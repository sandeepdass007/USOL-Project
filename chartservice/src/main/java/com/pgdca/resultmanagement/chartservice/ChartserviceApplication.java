package com.pgdca.resultmanagement.chartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import com.pgdca.resultmanagement.chartservice.proxy.StudentServiceProxy;

@SpringBootApplication
@EnableFeignClients
public class ChartserviceApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext applicationContext = SpringApplication.run(ChartserviceApplication.class, args);
		System.out.println(applicationContext.getBean(StudentServiceProxy.class).getMessage("Sandeep"));
	}

}
