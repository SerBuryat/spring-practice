package com.practice.spring.startup.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Artem Anosov
 */
@Component
public class CustomBeanDefinitionPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
        throws BeansException {
        if(beanFactory.containsBeanDefinition("startupApplication")) {
            System.out.println("------------------------------------------");
            System.out.println("BEAN-DEFINITION-STARTUP-APPLICATION...");
            System.out.println("------------------------------------------");
        }
    }
}
