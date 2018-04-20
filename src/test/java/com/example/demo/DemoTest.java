package com.example.demo;

import com.example.demo.mail.MailSender;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {
    @Test
    public void senMail(){
        List<String> list = new ArrayList<>();
        for(int i=0;i<20;i++){
            list.add("rebekah.tu@foxmail.com");
        }
        MailSender.sendMail(list,"Hello","<font color='red' size='8px'>Hello 妞子！</font>");
    }
}
