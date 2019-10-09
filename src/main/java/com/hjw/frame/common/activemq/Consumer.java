package com.hjw.frame.common.activemq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.stereotype.Component;

import javax.jms.ConnectionFactory;

@Component
public class Consumer {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
        bean.setPubSubDomain(true);
        bean.setConnectionFactory(activeMQConnectionFactory);
        return bean;
    }
    
    @JmsListener(destination = "topic.send_alarm_message",containerFactory="jmsListenerContainerTopic")
    public void getAlarmMessage(String message) {
    	logger.info("success:"+message);
    	logger.debug("test");
	}
	
	@JmsListener(destination = "queue.send_message")
	public void getQueueMessage(String message){
    	logger.info(message);
	}

}
