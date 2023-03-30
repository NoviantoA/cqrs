package com.novianto.belajar.cqrs;

import com.novianto.belajar.cqrs.exception.ProductServiceEventsErrorHandler;
import org.axonframework.config.EventProcessingConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BelajarCqrsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelajarCqrsApplication.class, args);
	}

	@Autowired
	public void configure(EventProcessingConfigurer configurer){
		configurer.registerListenerInvocationErrorHandler("product", configuration -> new ProductServiceEventsErrorHandler());
	}

}
