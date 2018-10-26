package com.pccc.myspringboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//告诉SpringBoot我是一个入口类，运行我就能启动SB
//@ResponseBody   @Controller @Entity
@SpringBootApplication
public class MySpringBootApplication {


    public static void main (String[] args){

        SpringApplication.run(MySpringBootApplication.class);

        //  SpringBootApplication.run(MySpringBootApplication.class);



    }
}
