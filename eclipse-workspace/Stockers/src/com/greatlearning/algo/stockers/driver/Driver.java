package com.greatlearning.algo.stockers.driver;

import java.util.Scanner;

import com.greatlearning.algo.stockers.service.Operations;

public class Driver {

	public static void main(String[] args) {
		int option;
		Scanner sw= new Scanner(System.in);
		Operations st = new Operations();
		st.enterCompanyData();
		
		do {
			System.out.println("\n --------------------------------------");
			System.out.println("Enter the operation that you want to perfom");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("6. press 0 to exit");
			System.out.println("--------------------------------------");
			
			option = sw.nextInt();
			switch(option) {
			case 0:
				option=0;
				break;
			case 1:
				System.out.println("Stock prices in ascending order are:");
				st.ascending(st.sharePrice, 0, st.sharePrice.length-1);
				st.descending();
				break;
			case 2:
				System.out.println("Stock prices in descending order are:");
				st.ascending(st.sharePrice, 0, st.sharePrice.length-1);
				st.display();
				break;
			case 3:
				System.out.println("Total no of companies whose stock price rose today: "+ st.rise);
				break;
			case 4:
				System.out.println("Total no of companies whose stock price declined today: "+ st.decline);
				break;
			case 5:
				st.search();
				break;
			default:
				System.out.println("Please enter a valid option.");
			}
			
		}
			while(option!=0);
			System.out.println("Exited successfully");	
			sw.close();

	}

}
