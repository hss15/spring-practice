package com.hari.spring.basics.componenntscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ComponentDAO {
	
	@Autowired
	ComponentJdbcConnection componentJdbcConnection;

	public ComponentJdbcConnection getJdbcConnection() {
		return componentJdbcConnection;
	}

	public void setJdbcConnection(ComponentJdbcConnection componentJdbcConnection) {
		this.componentJdbcConnection = componentJdbcConnection;
	}

}
