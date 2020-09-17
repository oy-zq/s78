package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest0916 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring0916.xml");
        Student student = (Student) context.getBean("student");
//        Student student1 = (Student) context.getBean("student");
//        Teacher0916 teacher0916 = (Teacher0916) context.getBean("teacher");

//        System.out.println(student+"===="+student1+"===="+teacher0916);
        System.out.println(student.getTeacher0916());
        System.out.println(student.getTeacher0916().getName());
        student.getTeacher0916().getClasslist().forEach(
                value -> System.out.println(value)
        );
        ((ClassPathXmlApplicationContext) context).close();
    }
}
