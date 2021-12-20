package com.greatlearning.labs.driver;

import java.util.Scanner;

import com.greatlearning.labs.notescount.MergeSortImplementation;
import com.greatlearning.labs.notescount.NotesCount;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Enter the currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the denominations value");
		for(int i=0; i<size;i++) {
			notes[i]= sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		MergeSortImplementation mergeSort  = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
		
		mergeSort.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes, amount);
	}

}
