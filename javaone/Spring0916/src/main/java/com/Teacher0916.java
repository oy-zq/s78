package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("teacher")
@PropertySource(value = "classpath:config.properties")
//@PropertySource(value = "classpath:config1.yml")
public class Teacher0916 {
    @Value("${name}") //name 相当于一个value也是一个占位符
    private String name;
    @Value("#{'${classlist}'.split(',')}")
    private List<String> classlist;

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
}
