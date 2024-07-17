package com.example.coupling_pratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouplingPraticeApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm()); //We can change what algorithm we can use
		int result = binarySearch.binarySearch(new int[] {12,4,6, 3}, 3);
		System.out.println(result);

		SpringApplication.run(CouplingPraticeApplication.class, args);
	}

}
