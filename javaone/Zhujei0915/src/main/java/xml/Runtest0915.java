package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runtest0915 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springann.xml");
        Student student = (Student) context.getBean("student");//student bean中id默认为类的首字母小写, 如果要加id就在@Component后加（“id”）
        Teacher teacher = (Teacher) context.getBean("teacher");
        Book book = (Book) context.getBean("book");

        System.out.println(student+"=="+teacher+"=="+book);
        System.out.println("student=="+student.getStuno()+"=="+student.getName());
        System.out.println("teacher=="+teacher.getName());
        System.out.println("book=="+book.getBookid()+"=="+book.getBookname());

        System.out.println(book.getListt());
    }
}
