package com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunLianxi {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Lianx0910 lianx0910 = (Lianx0910) context.getBean("lx");
        lianx0910.student();
    }
}
