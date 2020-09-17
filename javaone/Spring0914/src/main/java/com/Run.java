package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring0914.xml");
        Student student = (Student) context.getBean("student");
        Teacher teacher = (Teacher) context.getBean("teacher");
        Book book = (Book) context.getBean("book");

        System.out.println(student.getXh()+"==="+student.getName());

        System.out.println(teacher.getName());
        teacher.getClassl().forEach(
                value -> System.out.println(value)
        );

        System.out.println(book.getBh()+"===="+book.getName());
        System.out.println(book);
        System.out.println(teacher.getBook());
        System.out.println(student.getBook());
    }
}
