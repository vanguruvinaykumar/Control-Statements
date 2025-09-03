package com.codegnann.controlstatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		int originalNumber = number;
		int reversednumber = 0;
		while (number != 0) {
			int reminder = number % 10;
			reversednumber = reversednumber * 10 + reminder;
			number /= 10;
			
			
		}
		if(reversednumber<0) {
			reversednumber=-reversednumber;
		}
		System.out.println("reversed of a given number is :" + originalNumber + " = " + reversednumber);

	}

}
