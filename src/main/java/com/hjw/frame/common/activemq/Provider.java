package com.hjw.frame.common.activemq;

import com.hjw.frame.common.consts.Consts;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import javax.jms.StreamMessage;

/**
 * MQ消息提供者
 *
 * @author leftso
 *
 */
@Component
//@EnableScheduling // 测试用启用任务调度
public class Provider {
    /** MQ jms实例 **/
    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * @Title: send
     * @Description: 自定义发送类型及内容
     * @param message
     * @param name
     * @param type 1代表主体；其余代表queue
     */
    public void send(Object message , String name , int type) throws Exception {
    	Destination destination;
    	switch (type) {
			case Consts.AMQ_MESSAGE_QUEUE:{
				destination = new ActiveMQQueue(name);// 这里定义了Queue的key
				break;
			}
			case Consts.AMQ_MESSAGE_TOPIC:{
				destination = new ActiveMQTopic(name);// 主题的写法
				break;
			}
			default:
				throw new Exception("类型错误");
		}
		this.jmsTemplate.convertAndSend(destination, message);
	}
    
    public void sendTopicMessage(String topicName, final String message) {
    	Destination destination =new ActiveMQTopic(topicName);
		jmsTemplate.send(destination, session -> {
			StreamMessage streamMessage = session.createStreamMessage();
			streamMessage.writeBytes(message.getBytes());
			return streamMessage;
		});
	}
    
}
