package com.codegnann.controlstatements;

import java.util.Scanner;

public class AtmExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double balance = 500000;// initial account balance.
		int pin = 1234;// original pin.
		int enteredPin;
		System.out.println("Enter Your Pin..");
		enteredPin = scanner.nextInt();
		if (enteredPin != pin) {
			System.out.println("Incorrect pin.Existing");
			return;
		}
		int choice;
		do {
			System.out.println("||=======================================||");
			System.out.println("||========= ATM Menu=====================||");
			System.out.println("||============== 1. Check Balance========||");
			System.out.println("||==============2. Deposit ==============||");
			System.out.println("||=============3. Withdraw===============||");
			System.out.println("||============= 4. Exit==================||");
			System.out.println("||=======================================||");
			System.out.println("Enter Your Choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Your Balance is : " + balance);
				break;
			case 2:
				System.out.println("Enter Deposit Amount");
				double deposit = scanner.nextDouble();
				if (deposit % 100 != 0) {
					System.out.println("please Deposit Multiples of Hunderd like 700,1000");
				} else {
					if (deposit < 500) {
						System.out.println("Please Deposit More than 500 rupess");
					} else {
						balance += deposit;
						System.out.println(
								"Deposited $ " + deposit + " amount succesfully.." + "new Balance is : " + balance);
					}
				}
				break;
			case 3:
				System.out.println("Enter Withdraw Amount");
				double withdraw = scanner.nextDouble();
				if (withdraw % 100 != 0) {
					System.out.println("please withdraw Multiples of Hunderd like 700,1000");
				} else {
					if (withdraw < 500) {
						System.out.println("Please withdraw More than 500 rupess");
					} else {
						if (withdraw > balance) {
							System.out.println("insufficient funds");
						} else {
							balance -= withdraw;
							System.out.println(
									"amount withdrawn succesfully" + withdraw + "UPDATED BALANCE IS " + balance);
						}
					}
				}
				break;
			case 4:
				System.out.println("Existing.. Thank you for using ATM");
				break;
			default:
				System.out.println("invalid choice." + " please chhose a valid option [1-4]");
				break;
			}
		} while (choice != 4);
		scanner.close();
	}
}
