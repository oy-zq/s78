package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.BeanInfo;
import java.util.Map;

public class RunSpring0911 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring0911.xml");
        Spring0911 spring0911 = (Spring0911) context.getBean("spr");

        System.out.println(spring0911.getName()+"====="+spring0911.getStuno());
        System.out.println(spring0911.getRemak()+"====="+spring0911.getAge());
        System.out.println("=====老方法======");
        for (Object obj:spring0911.getInfolist()) {
            System.out.println(obj);
        }

        for (Object obj2:spring0911.getInfomap().entrySet()) {
            Map.Entry entry = (Map.Entry) obj2;
            System.out.println(entry.getKey()+"======="+entry.getValue());
        }
//        lamboda表达式
        System.out.println("==========lamboda===========");
        spring0911.getInfolist().forEach(
                vallue -> System.out.println(vallue)
        );
        spring0911.getInfomap().forEach(
                (key,value) -> System.out.println(key+"======"+value)
        );

    }
}
