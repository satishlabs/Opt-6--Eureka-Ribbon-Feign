package com.booksearchms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.booksearchms.ribbon.RibbonConfig;

@SpringBootApplication(scanBasePackages={"com.netflix.client.config.IClientConfig"})
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name="myjlc",configuration = RibbonConfig.class) 
public class BookSearchMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookSearchMsApplication.class, args);
	}
	
}
