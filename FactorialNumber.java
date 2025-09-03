package com.codegnann.controlstatements;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int number = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result = result * i;
		}
		System.out.println( "Factorial of : " + number + " is " +result);

	}

}
