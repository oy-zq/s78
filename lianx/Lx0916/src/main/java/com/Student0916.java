package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("student")
@PropertySource(value = "classpath:config.yml", encoding = "UTF-8")
public class Student0916 {
    @Value("${Student_bh}")
    private int bh;
    @Value("${Student_name}")
    private String name;
    @Value("${Student_age}")
    private int age;
    @Resource(name = "teacher")
    private Teacher0916 teacher0916;
    @Resource(name = "book")
    private Book0916 book0916;

    public int getBh() {
        return bh;
    }

    public void setBh(int bh) {
        this.bh = bh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher0916 getTeacher0916() {
        return teacher0916;
    }

    public void setTeacher0916(Teacher0916 teacher0916) {
        this.teacher0916 = teacher0916;
    }

    public Book0916 getBook0916() {
        return book0916;
    }

    public void setBook0916(Book0916 book0916) {
        this.book0916 = book0916;
    }
}
