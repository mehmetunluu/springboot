package com.arge.controller;

import com.arge.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by M.UNLU on 21.03.2016.
 */
@Controller
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /**
     *
     * @param name gelen name değişkeni hello @name şekilde yazar
     * @return  hello @name
     * @ResponseBody anotasyonu ile bir Java nesnesi view elementleri   kullanılmadan kullanıcının talep eiği
     * formatta gönderebilmektedir.
     */
    @RequestMapping(method= RequestMethod.GET,path = "/hello-world")
    public @ResponseBody  Greeting sayHelloToUser(@RequestParam(value="name", required=false, defaultValue="Stranger") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
