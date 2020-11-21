package com.xdja.repository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.xdja.repository.mapper")
public class RepositoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(RepositoryApplication.class, args);
    }

}
