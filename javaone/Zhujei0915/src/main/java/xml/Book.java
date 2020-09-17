package xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Book {
    @Value(value = "8001")
    private int bookid;
    @Value(value = "Java")
    private String bookname;
    @Value("#{'${A:1,2,3}'.split(',')}")
    private List listt;

    public List<String> getListt() {
        return listt;
    }

    public void setListt(List<String> listt) {
        this.listt = listt;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
}
