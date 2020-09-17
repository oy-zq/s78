package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("teacher")
@PropertySource(value = "classpath:config.yml", encoding = "UTF-8")
public class Teacher0916 {
    @Value("${Teacher_name}")
    private String name;
    @Value("${Teacher_classlist}")
    private List<String> classlist;
    @Autowired
    private  List<Book0916> book0916List;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getClasslist() {
        return classlist;
    }

    public void setClasslist(List<String> classlist) {
        this.classlist = classlist;
    }

    public List<Book0916> getBook0916List() {
        return book0916List;
    }

    public void setBook0916List(List<Book0916> book0916List) {
        this.book0916List = book0916List;
    }
}
