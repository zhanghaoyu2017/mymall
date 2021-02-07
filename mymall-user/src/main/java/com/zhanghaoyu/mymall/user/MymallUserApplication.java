package com.zhanghaoyu.mymall.user;


import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.zhanghaoyu.mymall.user.mapper")
public class MymallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallUserApplication.class, args);
    }

}
