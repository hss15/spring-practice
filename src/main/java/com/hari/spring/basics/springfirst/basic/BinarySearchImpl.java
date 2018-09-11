package com.hari.spring.basics.springfirst.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	// Using the initializer for Autowiring
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	// Using the setters for Autowiring
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	// Actually we don't need Setter also.
	
	
	
	public int binarySearch(int[] numbers, int number) {
		// tasks: sort array and find index of number.
		
//		BubbleSortAlgorithm bubbleSort = new BubbleSortAlgorithm();
		
		int[] sortedNumbers =  sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 0;
	} 
	
	@PostConstruct
	public void bla() {
		logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	@PreDestroy
	public void blabla() {
		logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

}
