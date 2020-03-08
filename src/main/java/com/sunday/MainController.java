package com.sunday;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final MainServices service;

    @GetMapping("/getdata")
    public String confirm(@RequestParam("name") String userName, @RequestParam("mail") String mail, @RequestParam("msg") String msg, @RequestParam("sub") String sub) {
        UserData data = new UserData(userName, mail, msg, sub);
        System.out.println("some");
        service.sendNotification(data);
        System.out.println("send");
        return "details";
    }

    @ResponseBody
    @GetMapping("/name")
    public String name() {
        return "<h1>Syed Mohiuddin";
    }

    @ResponseBody
    @GetMapping("/goku")
    public String goku() {
        return "<h1>Goku Amry";
    }
    @ResponseBody
    @GetMapping("/haku")
    public String friend() {
        log.info("Calling Goku Army ");
        return "<h1 style='color:red;'>Mohd Abdul Hakeem";
    }
}
