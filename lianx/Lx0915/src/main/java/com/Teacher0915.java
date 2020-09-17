package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("teacher")
public class Teacher0915 {
    @Value(value = "milo")
    private String name;
    @Value("#{'${A:s78,s81,s82}'.split(',')}")
    private List classlist;
    @Autowired
    private List<Book0915> book0915;

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

    public List<Book0915> getBook0915() {
        return book0915;
    }

    public void setBook0915(List<Book0915> book0915) {
        this.book0915 = book0915;
    }
}
