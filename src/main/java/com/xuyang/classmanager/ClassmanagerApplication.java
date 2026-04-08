package com.xuyang.classmanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuyang.classmanager.mapper")
public class ClassmanagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClassmanagerApplication.class, args);
    }
}