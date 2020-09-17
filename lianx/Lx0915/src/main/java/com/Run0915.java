package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run0915 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring0915.xml");
        Student0915 student0915 = (Student0915) context.getBean("student");
        Teacher0915 teacher0915 = (Teacher0915) context.getBean("teacher");
        Book0915 book0915 = (Book0915) context.getBean("book");

        System.out.println("学号=="+student0915.getXh()+
                "==姓名=="+student0915.getName()+"==年龄=="+student0915.getAge()+
                "==老师=="+student0915.getTeacher().getName()+
                "==书=="+student0915.getBook().getBookname());

        System.out.println("姓名=="+teacher0915.getName()+
                "==班级=="+teacher0915.getClasslist());
        System.out.println(teacher0915.getBook0915().get(0).getBh()+"==="+teacher0915.getBook0915().get(0).getBookname());
        System.out.println(teacher0915.getBook0915().get(1).getBh()+"==="+teacher0915.getBook0915().get(1).getBookname());

        System.out.println("==编号=="+book0915.getBh()+"==书名=="+book0915.getBookname());
    }
}
