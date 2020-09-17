package com;

import java.io.IOException;

public class HelloSpring {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void initMethod(){
        this.age=18;
        this.name="欧阳";
        System.out.println("HelloSpring 对象被创建了");
    }
    public void destroy(){
        System.out.println("对象被销毁了");
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void hello (){
        System.out.println("你好");
    }
}
