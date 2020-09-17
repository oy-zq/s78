package com;

import java.util.List;

public class Teacher {
    private String name;
    private List classlist;
    private List<Book> book;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getClasslist() {
        return classlist;
    }

    public void setClasslist(List classlist) {
        this.classlist = classlist;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
}
