package c;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("teacher0916_03")
@PropertySource(value = "classpath:config_02.yml",encoding = "UTF-8")
public class Teacher0916_03 {
    @Value("${t_name}")
   private String t_name;
    @Value("#{'${t_class}'.split(',')}")
   private List<String> t_class;
    @Autowired
   private List<Book0916_03> book0916_03s;

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public List<String> getT_class() {
        return t_class;
    }

    public void setT_class(List<String> t_class) {
        this.t_class = t_class;
    }

    public List<Book0916_03> getBook0916_03s() {
        return book0916_03s;
    }

    public void setBook0916_03s(List<Book0916_03> book0916_03s) {
        this.book0916_03s = book0916_03s;
    }
}
