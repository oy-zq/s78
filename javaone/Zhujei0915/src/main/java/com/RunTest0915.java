package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunTest0915 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring.class);
        Student student = context.getBean(Student.class);
        Teacher teacher = context.getBean(Teacher.class);
        System.out.println(student);
        System.out.println(student);
        System.out.println(teacher);
    }
}
