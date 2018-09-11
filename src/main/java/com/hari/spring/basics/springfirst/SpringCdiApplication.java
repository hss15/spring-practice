package com.hari.spring.basics.springfirst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hari.spring.basics.springfirst.cdi.SomeCdiBusiness;

@SpringBootApplication
public class SpringCdiApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringCdiApplication.class, args);
		
		SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("*****************************************************************");
		
		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());		
		LOGGER.info("*****************************************************************");
	}
}
