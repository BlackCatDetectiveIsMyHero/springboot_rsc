package com.ruipeng.springboot.express_delivery.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/*
 * @program: express_delivery.com.ruipeng.springboot.express_delivery.aspect.LogAspect
 *
 * @description:
 *
 * @author:Ruipeng
 *
 * @create:2019-11-18 00:07
 */
@Aspect
@Component
public class LogAspect {
    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution(public * com.ruipeng.springboot.express_delivery.controller.*.* (..))")
    public void log(){

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //url
        logger.info("url={}",request.getRequestURL());

        //request.method
        logger.info("request.method={}",request.getMethod());

        //ip
        logger.info("ip={}",request.getRemoteAddr());

        //class.method
        logger.info("class.method={}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

        //requestParam
        logger.info("args={}",joinPoint.getArgs());
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        //response
        logger.info("response={}",object.toString());
    }
}
