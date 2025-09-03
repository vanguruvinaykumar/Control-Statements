package com.codegnann.controlstatements;

import java.util.Scanner;

public class CountNumbers {

 public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);


     System.out.print("Please enter a number: ");
     int number = scanner.nextInt();
     
     int sum = 0;

     while (number != 0) {
         int digit = number % 10;
         
         sum += digit;
         
         number /= 10;
     }
     System.out.println(sum);


     scanner.close();
 }
}


