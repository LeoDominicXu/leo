package com.xuzc.dubbo.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Description: The description of the file.
 * @Author: Xuzc
 * @Date: 2016/11/16
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/applicationContext.xml",
                "META-INF/spring/spring-context.xml",
                "META-INF/spring/spring-dubbo.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
