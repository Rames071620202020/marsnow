package com.practice;

public class SumEvenNumber {
	public static void main(String[] args) {
		int sum = 0;
		int grandsum = 0;
		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				System.out.println(sum);
			}
		}
		System.out.println("===========");
		System.out.println(sum);
	}

}