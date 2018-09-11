package com.hari.spring.basics.springfirst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hari.spring.basics.springfirst.scope.PersonDAO;

@SpringBootApplication
public class SpringScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponenetScanApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringComponenetScanApplication.class, args);
		
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("*****************************************************************");
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());

		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
		
		LOGGER.info("*****************************************************************");
	}
}
