package com.pgdca.resultmanagement.chartservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableFeignClients
public class ChartserviceApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext applicationContext = SpringApplication.run(ChartserviceApplication.class, args);
	}

}
