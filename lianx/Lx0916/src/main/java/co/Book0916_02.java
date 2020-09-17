package co;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("book0916_02")
@PropertySource(value = "classpath:config_02.yml",encoding = "UTF-8")
public class Book0916_02 {
    @Value("${bid}")
    private int bid;
    @Value("${bname}")
    private String bname;

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
