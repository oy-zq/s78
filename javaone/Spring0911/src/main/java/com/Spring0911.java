package com;

import java.util.List;
import java.util.Map;

public class Spring0911 {
//    给一个类里面的属性设值就叫做依赖注入
//    简单属性注入        基本数据类型的注入
//    引用数据类型的注入   对象的注入
//    数据结构的注入       集合数据类型的注入
//    1、通过构造方法注入    2、getter和setter方法注入  3、ref引用注入
    private int stuno;
    private int age;
    private String name;
    private String remak;
    private List infolist;
    private Map infomap;
//    如果设置一个有参数的构造方法必须设置一个空的构造方法
    public Spring0911(int stuno){
        this.stuno=stuno;
    }
    public Spring0911(int stuno,String name){
        this.stuno=stuno;
        this.name=name;
    }

    public int getStuno() {
        return stuno;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
    }

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

    public String getRemak() {
        return remak;
    }

    public void setRemak(String remak) {
        this.remak = remak;
    }

    public List getInfolist() {
        return infolist;
    }

    public void setInfolist(List infolist) {
        this.infolist = infolist;
    }

    public Map getInfomap() {
        return infomap;
    }

    public void setInfomap(Map infomap) {
        this.infomap = infomap;
    }
}
