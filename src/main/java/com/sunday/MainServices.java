package com.sunday;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainServices {

    private final JavaMailSender javaMailSender;

    public void sendNotification(UserData userData) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom("deccanbesporty@gmail.com");
        mail.setTo("syedmubbashir97@gmail.com");
        mail.setText(userData.getMsg() + "   ->   " + userData.getMail() + "   ->   " + userData.getName());
        mail.setSubject(userData.getSub());
        mail.setReplyTo("deccanbesporty@gmail.com");
        javaMailSender.send(mail);
    }
}
