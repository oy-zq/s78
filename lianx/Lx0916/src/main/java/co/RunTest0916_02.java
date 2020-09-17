package co;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest0916_02 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring0916_02.xml");
        Student0916_02 student0916_02 = (Student0916_02)context.getBean("student0916_02");
        Teacher0916_02 teacher0916_02 = (Teacher0916_02) context.getBean("teacher0916_02");
        Book0916_02 book0916_02 = (Book0916_02) context.getBean("book0916_02");

        System.out.println("学号:"+student0916_02.getStu_xh()+"  姓名:"+student0916_02.getStu_name()+
                "  年龄:"+student0916_02.getStu_age()+"  老师:"+student0916_02.getTeacher0916_02().getT_name()+
                "  书名:"+student0916_02.getBook0916_02().getBname());

        System.out.println("老师:"+teacher0916_02.getT_name());
        teacher0916_02.getT_class().forEach(
                value -> System.out.println("班级:"+value)
        );
        System.out.println("书编号:"+teacher0916_02.getBook0916_02s().get(0).getBid()+"  书名:"+teacher0916_02.getBook0916_02s().get(0).getBname());
        System.out.println("书编号:"+teacher0916_02.getBook0916_02s().get(1).getBid()+"  书名:"+teacher0916_02.getBook0916_02s().get(1).getBname());
        System.out.println("书");
        System.out.println("书编号:"+book0916_02.getBid()+"书名:"+book0916_02.getBname());
    }
}
