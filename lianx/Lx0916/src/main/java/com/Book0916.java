package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("book")
@PropertySource(value = "classpath:config.yml", encoding = "UTF-8")
public class Book0916 {
    @Value("${Book_bid}")
    private int bid;
    @Value("${Book_bname}")
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
