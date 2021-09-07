package com.practice;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		System.out.print("Enter a number:  ");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		int fact = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
			System.out.println("\n"+fact);
		}
	}

}