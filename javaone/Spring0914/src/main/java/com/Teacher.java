package com;

import java.util.List;

public class Teacher {
    private Book book;
    private String name;
    private List classl;

    public List getClassl() {
        return classl;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setClassl(List classl) {
        this.classl = classl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
