package com.lei.springframework;

/**
 * @author lyf
 * @date 2023/8/24 16:52
 */
public class BeanDefinition {

    private final Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
