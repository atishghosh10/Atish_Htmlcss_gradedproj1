package com.greatlearning.labs.transaction;

import java.util.Scanner;

public class Transactions {

	public static void main(String[] args) {
		System.out.println("Enter the size of transaction array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetno = sc.nextInt();

		while (targetno != 0) {
			int flag = 0;
			long target;
			System.out.println("Enter the value of  target");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum += arr[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
			target--;
		}
	}

}
