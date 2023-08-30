package com.lei.springframework.test;

import com.lei.springframework.BeanDefinition;
import com.lei.springframework.BeanFactory;
import com.lei.springframework.test.bean.UserService;
import org.junit.jupiter.api.Test;

/**
 * @author lyf
 * @date 2023/8/25 9:46
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
