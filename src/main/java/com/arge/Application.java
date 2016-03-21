package com.arge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * Created by M.UNLU on 17.03.2016.
 */
@SpringBootApplication
public class Application {

    public static void main(String[]  args){
        ApplicationContext context  = SpringApplication.run(Application.class,args);

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

    }
}
