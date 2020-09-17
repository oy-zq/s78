package c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("student0916_03")
@PropertySource(value = "classpath:config_02.yml",encoding = "UTF-8")
public class Student0916_03 {
    @Value("${stu_xh}")
    private int stu_xh;
    @Value("${stu_name}")
    private String stu_name;
    @Value("${stu_age}")
    private int stu_age;
    @Autowired
    private Teacher0916_03 teacher0916_03;
    @Autowired
    private Book0916_03 book0916_03;

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

    public Teacher0916_03 getTeacher0916_03() {
        return teacher0916_03;
    }

    public void setTeacher0916_03(Teacher0916_03 teacher0916_03) {
        this.teacher0916_03 = teacher0916_03;
    }

    public Book0916_03 getBook0916_03() {
        return book0916_03;
    }

    public void setBook0916_03(Book0916_03 book0916_03) {
        this.book0916_03 = book0916_03;
    }
}
