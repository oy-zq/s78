package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest0916 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring0916.xml");
        Student0916 student0916 = (Student0916) context.getBean("student");
        Teacher0916 teacher0916 = (Teacher0916) context.getBean("teacher");
        Book0916 book0916 = (Book0916) context.getBean("book");

        System.out.println("学号:"+student0916.getBh()+"  姓名:"+student0916.getName()+
                "  年龄:"+student0916.getAge()+"  老师姓名:"+student0916.getTeacher0916().getName()+
                "  书名:"+student0916.getBook0916().getBname());
        System.out.println("老师姓名:"+teacher0916.getName());
        teacher0916.getClasslist().forEach(
                value -> System.out.println("班级:"+value)
        );
        System.out.println("书编号:"+teacher0916.getBook0916List().get(0).getBid()+"  书名:"+teacher0916.getBook0916List().get(0).getBname());
        System.out.println("书编号:"+teacher0916.getBook0916List().get(1).getBid()+"  书名:"+teacher0916.getBook0916List().get(1).getBname());
        System.out.println("书类");
        System.out.println("书编号:"+book0916.getBid()+"  书名:"+book0916.getBname());
    }
}
