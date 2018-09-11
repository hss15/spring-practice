package com.hari.spring.basics.springfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hari.spring.basics.springfirst.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int result = binarySearch.binarySearch(new int[] { 1, 3, 2, 5}, 3);
//		System.out.println(result);
		
		
		
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] { 1, 3, 2, 5}, 3);
		System.out.println(result);
	}
}
