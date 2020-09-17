package c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunTest0916_03 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring0916_03.xml");
        Student0916_03 student0916_03 = (Student0916_03)context.getBean("student0916_03");
        Teacher0916_03 teacher0916_03 = (Teacher0916_03) context.getBean("teacher0916_03");
        Book0916_03 book0916_03 = (Book0916_03) context.getBean("book0916_03");

        System.out.println("学号:"+student0916_03.getStu_xh()+"  姓名:"+student0916_03.getStu_name()+
                "  年龄:"+student0916_03.getStu_age()+"  老师:"+student0916_03.getTeacher0916_03().getT_name()+
                "  书名:"+student0916_03.getBook0916_03().getBname());
        System.out.println("老师:"+teacher0916_03.getT_name());
        teacher0916_03.getT_class().forEach(
                value -> System.out.println("班级:"+value)
        );
        System.out.println("书编号:"+teacher0916_03.getBook0916_03s().get(0).getBid()+"  书名:"+teacher0916_03.getBook0916_03s().get(0).getBid());
        System.out.println("书编号:"+teacher0916_03.getBook0916_03s().get(1).getBname()+"  书名:"+teacher0916_03.getBook0916_03s().get(1).getBname());


        System.out.println("书类");
        System.out.println("书编号:"+book0916_03.getBid()+"  书名:"+book0916_03.getBname());
    }
}
