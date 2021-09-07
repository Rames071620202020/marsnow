package com.practice;

public class Power {

	public static void main(String[] args) {
		int base = 2;
		int power = 5;
		int result = 1;
		for (int i = 1; i <= power; i++) {
			result = result * base;
			System.out.println(result);
		}
	}

}