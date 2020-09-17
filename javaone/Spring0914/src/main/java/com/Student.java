package com;

public class Student {
    private int xh;
    private String name;
    private int age;
//    自动装配三种方法
//    构造方法装配
//    byName
//    byType
    private Book book;
//    构造方法装配
    public Student(Book book){
        this.book=book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student(){
    }
    public Student(int xh,String name) {
        this.xh=xh;
        this.name=name;
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
}
