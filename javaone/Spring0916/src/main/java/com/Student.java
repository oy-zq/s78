package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Component("student")
//@Scope("prototype")
@Lazy

public class Student {
    private int xh;

    private String name;
    private int age;
//    @Autowired //spring framework 提供的自动装配注解
    @Resource(name = "teacher")     //JSR JDK  属于java jdk里的
    private Teacher0916 teacher0916;
    @PostConstruct      //与init-method  是一样的效果
    public void initmethod(){
        //初始化
        System.out.println("student.init-method");
    }
    @PreDestroy         //与detory-method  是一样的效果
    public void detorymethod(){
        System.out.println("student.detory-method");
    }

    public int getXh() {
        return xh;
    }

    public void setXh(int xh) {
        this.xh = xh;
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
}
