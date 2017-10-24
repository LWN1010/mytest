package com.itheima;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 代表为SpringBoot应用运行的主类
@SpringBootApplication(scanBasePackages="com.itheima")
public class Application {
	
	public static void main(String[] args) {
		// 运行SpringBoot应用的第一种方式
//		SpringApplication.run(Application.class, args);
		
		// 运行SpringBoot应用的第二种方式
		SpringApplication springApplication = new SpringApplication(Application.class);
		// 设置横幅模式（关闭）
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);
	}
	
}
