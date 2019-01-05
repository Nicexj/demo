package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableScheduling
@EnableCaching
@MapperScan(basePackages = "com.example.dao")
@EnableTransactionManagement
@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) throws Exception {

        SpringApplication.run(DemoApplication.class, args);
		/*SpringApplication app = new SpringApplication(DemoApplication.class);
		app.set BannerMode(Banner.Mode.OFF);// 关闭启动Banner
		app.run(args);*/
    }
}
