package com.hjw.frame.common.aspect;

import com.hjw.frame.common.result.BaseResult;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * <Description> 
 *
 * @author HJW
 * @version 1.0
 * @createDate 2019/10/10 13:53
 * @see com.hjw.frame.common.aspect
 */
@Component
@Aspect
public class ControllerAop {

    /**
     * 环绕通知：
     *   环绕通知非常强大，可以决定目标方法是否执行，什么时候执行，执行时是否需要替换方法参数，执行完毕是否需要替换返回值。
     *   环绕通知第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型
     */
    @Around("execution(* com.hjw.frame.business.controller.*.*(..))")
    public Object doAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Exception {
        try {
            Object obj = proceedingJoinPoint.proceed();
            //将所有返回格式都转换成BaseResult格式
            if(obj instanceof BaseResult){
                return obj;
            }
            return  new BaseResult<>(obj);
        } catch (Throwable throwable) {
            throw new Exception();
        }
    }
}
