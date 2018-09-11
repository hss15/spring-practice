package com.hari.spring.basics.springfirst.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		// logic for bubble sort.
		return numbers;
	}

}
