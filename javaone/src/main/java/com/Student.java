package com;

public class Student {
    private int stuno;     //学号
    private String name;  //姓名
    private int age;     //年龄
    private String className;   //班级

    protected String teacher;   //protected 受保护的
    public String homework;
//    private

    public int getStuno() {
        return stuno;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void study(){
        System.out.println(name+"在学习");
//        BuyBook buy = new PYou();
//        buy.buybook();
        ChiF chi=new PY();
        chi.chif();
    }
    public void Book(){
        System.out.println(className+":"+name+"正在借书");
        System.out.println("1.登记学号"+stuno);
        System.out.println("2.登记"+name+"所借书籍");
        System.out.println("3.."+name+"带走书");

    }
}
