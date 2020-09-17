package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.applet.AppletContext;

public class RunSpring {
    public static void main(String[] args){
//        初始化容器     非懒加载
        //所有容器的父类                      是ApplicationContext的实现,通过相对路径去寻找配置文件创建容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
                                        //通过注解配置创建容器
        /*ApplicationContext context1= new AnnotationConfigApplicationContext();
                                        //通过绝对文件路径
        ApplicationContext context2 = new FileSystemXmlApplicationContext();*/
//        懒加载方式
        HelloSpring student = (HelloSpring) context.getBean("student");
        HelloSpring student1 = (HelloSpring) context.getBean("student");
        HelloSpring student2 = (HelloSpring) context.getBean("student");
        System.out.println("1、"+student);
        System.out.println("2、"+student1);
        System.out.println("3、"+student2);
        System.out.println(student.equals(student1) && student1.equals(student2));
        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
//        System.out.println(student.getAge()+"===="+student.getName());
//        student.hello();


    }
}
