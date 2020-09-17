package c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student0915 {
    @Value(value = "1001")
    private int xh;
    @Value(value = "欧阳")
    private String name;
    @Value(value = "18")
    private int age;
    @Autowired
    private Teacher0915 teacher;
    @Autowired
    private Book0915 book;

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

    public Teacher0915 getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher0915 teacher) {
        this.teacher = teacher;
    }

    public Book0915 getBook() {
        return book;
    }

    public void setBook(Book0915 book) {
        this.book = book;
    }
}
