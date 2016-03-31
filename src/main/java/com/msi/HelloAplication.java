package com.msi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by shao on 3/31/2016.
 */
@SpringBootApplication
public class HelloAplication {
    public static void main(String[] args){
        ApplicationContext ctx = SpringApplication
                .run(HelloAplication.class, args);
    }
}
