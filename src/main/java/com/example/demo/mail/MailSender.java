package com.example.demo.mail;

import java.util.List;

public class MailSender {
    public static void sendMail(List<String> to,String subject,String content){
        for (String address: to) {
            try{
                MailUtil.sendMail(address,subject,content);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
