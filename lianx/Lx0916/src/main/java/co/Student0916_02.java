package co;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("student0916_02")
@PropertySource(value = "classpath:config_02.yml",encoding = "UTF-8")
public class Student0916_02 {
    @Value("${stu_xh}")
    private int stu_xh;
    @Value("${stu_name}")
    private String stu_name;
    @Value("${stu_age}")
    private int stu_age;
    @Resource(name = "teacher0916_02")
    private Teacher0916_02 teacher0916_02;
    @Resource(name = "book0916_02")
    private Book0916_02 book0916_02;

    public int getStu_xh() {
        return stu_xh;
    }

    public void setStu_xh(int stu_xh) {
        this.stu_xh = stu_xh;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public int getStu_age() {
        return stu_age;
    }

    public void setStu_age(int stu_age) {
        this.stu_age = stu_age;
    }

    public Teacher0916_02 getTeacher0916_02() {
        return teacher0916_02;
    }

    public void setTeacher0916_02(Teacher0916_02 teacher0916_02) {
        this.teacher0916_02 = teacher0916_02;
    }

    public Book0916_02 getBook0916_02() {
        return book0916_02;
    }

    public void setBook0916_02(Book0916_02 book0916_02) {
        this.book0916_02 = book0916_02;
    }
}
