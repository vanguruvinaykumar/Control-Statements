package com.codegnann.controlstatements;

import java.util.Scanner;

public class TableMultipication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number that you want to multiply");
		int number =sc.nextInt();
		System.out.println("multipication table :"+ number);

		for(int i=1;i<=20;i++) {
			System.out.println(number + "*" + i + "=" + (number*i));
		}
		sc.close();
		
	}

}
