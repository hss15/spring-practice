package com.hari.spring.basics.springfirst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.hari.spring.basics.componenntscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.hari.spring.basics.componenntscan")
public class SpringComponenetScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponenetScanApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringComponenetScanApplication.class, args);
		
		ComponentDAO ComponentDAO = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("*****************************************************************");
		
		LOGGER.info("{}", ComponentDAO);
		
		LOGGER.info("*****************************************************************");
	}
}
