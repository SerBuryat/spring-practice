package com.practice.spring.startup.beanpostprocessor;

import com.practice.spring.startup.StartupApplication;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Artem Anosov
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
        throws BeansException {
        if(bean instanceof StartupApplication) {
            System.out.println("------------------------------------------");
            System.out.println("BEFORE-START-APPLICATION-BEAN...");
            System.out.println("------------------------------------------");
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
        throws BeansException {
        if(bean instanceof StartupApplication) {
            System.out.println("------------------------------------------");
            System.out.println("AFTER-START-APPLICATION-BEAN...");
            System.out.println("------------------------------------------");
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
