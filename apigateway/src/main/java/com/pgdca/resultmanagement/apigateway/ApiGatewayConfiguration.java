package com.pgdca.resultmanagement.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	
	@Bean
	public RouteLocator getGatewayRouter(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route("chart-service", p -> p.path("/chart-service/**")
						.uri("lb://chart-service"))
				.route(p -> p.path("/student-service/**")
						.uri("lb://student-service"))
				.build();
	}

}
