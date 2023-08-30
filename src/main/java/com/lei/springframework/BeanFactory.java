package com.lei.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lyf
 * @date 2023/8/24 16:52
 */
public class BeanFactory {

    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
