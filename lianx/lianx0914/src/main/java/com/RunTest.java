package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring0914.xml");
        Student student = (Student) context.getBean("student");
        Teacher teacher = (Teacher) context.getBean("teacher");
        Book book = (Book) context.getBean("book");

        System.out.println(student.getXh()+"=="+student.getName()+"=="+
                student.getAge()+"=="+student.getTeacher().getName()+"=="+student.getBook().getBookname());

        System.out.println(teacher.getName());
        teacher.getClasslist().forEach(
                value -> System.out.println(value)
        );
        teacher.getBook().forEach(
                value -> System.out.println(value.getBh()+value.getBookname())
        );

        System.out.println(book.getBh()+"==="+book.getBookname());
    }
}
