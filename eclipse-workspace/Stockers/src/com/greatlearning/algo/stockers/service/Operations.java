package com.greatlearning.algo.stockers.service;

import java.util.Scanner;

public class Operations {
	public int companies;
	public double[] sharePrice;
	boolean hike;
	public int rise=0;
	public int decline=0;
	
	Scanner sc = new Scanner(System.in);
	
	public void enterCompanyData() {
		System.out.println("Enter the no. of companies");
		companies =sc.nextInt();
		sharePrice = new double[companies];
		riseOrDecline();
	}
	
	public void riseOrDecline() {
		for(int i=0;i<companies;i++) {
			System.out.println("Enter current stock price of  the company "+ (i+1));
			sharePrice[i]=sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday? ");
			hike = sc.nextBoolean();
			if(hike==true) {
				rise++;
			}else {
				decline++;
			}
		}
	}
	
	void merge(int left, int right, int mid, double[] arr) {
		int n1= mid-left+1;
		int n2= right-mid;
		double leftarr[]=new double[n1];
		double rightarr[]=new double[n2];
		for(int i=0;i<n1;i++) {
			leftarr[i]=arr[left+i];
		}
		for(int j=0;j<n2;j++) {
			rightarr[j]=arr[mid+1+j];
						
		}
		int i=0,j=0,k=left;
		while(i<n1&&j<n2) {
			if(leftarr[i]>rightarr[j]) {
				arr[k] = leftarr[i];
				i++;
				}else {
					arr[k]=rightarr[j];
					j++;
				}k++;
		}
		while(i<n1) {
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightarr[j];
			j++;
			k++;
		} 
	}


	public void ascending(double array[],int left,int right) {
		if(left<right) {
			int mid=(left+right)/2;
			ascending(array, left,mid);
			ascending(array, mid+1,right);
			merge(left,right,mid,array);
		}
	}
	
	public void descending() {
		for(int i= sharePrice.length -1;i>=0;i--) {
			System.out.print(sharePrice[i] + " ");
		}
	}
	
	public void display() {
		for(int i=0; i<sharePrice.length;i++) {
			System.out.print(sharePrice[i] + " ");
		}
	}
	
	public void search() {
		boolean value= false;
		System.out.println("enter the key value");
		double price = sc.nextDouble();
		for(int i=0;i<sharePrice.length;i++) {
			if(sharePrice[i] == price) {
				System.out.println("Stock of value " + price + " is present");
				value = true;
			}
		}
		if(value == false) {
			System.out.println("Value not found");
		}
	}
}
