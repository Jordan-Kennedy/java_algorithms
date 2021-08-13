package com.college.jordan;

import java.util.Scanner;
import java.util.Arrays;

public class Search {

	static Scanner scan = new Scanner(System.in);

	static String userInput = " ";
	static int searchTerm;
	
	public static void main(String... args) {
		System.out.println("Welcome to Jordan's algorithm collection");
		System.out.println("----------------------------------------");
		
		menu();
		menuSelect();
		int[] dataArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		Arrays.binarySearch(dataArray,8);
	}

	private static void menu() {
		System.out.println("1. Binary search");
		System.out.println("2. Linear search");
		System.out.println("3. Bubble sort");	
	}
	
	private static void menuSelect() {
		userInput = scan.nextLine();
		int[] dataArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		switch(userInput) {
		case "1" :
			System.out.println("Binary search");
			searchTerm = scan.nextInt();
			binary(dataArray, searchTerm);
			break;
		case "2" :
			System.out.println("Linear search");
			searchTerm = scan.nextInt();
			linear(dataArray, searchTerm);
			break;
		case "3" :
			System.out.println("Bubble sort");	
			break;
		case "4" :
			System.out.println("Insert sort");	
			break;
		default:
			System.out.println("It's brok");	
			break;
		}		
	}
	
	private static void binary(int[] dataArray, int searchTerm) {
		int dataArrayLength = dataArray.length;
		
		int lowerBound = 0;
		int upperBound = dataArrayLength - 1;
		int midPoint = 0;
		
		boolean found = false;
		int searchIterations = 0;
		
//		System.out.println("Java binary search");
//		System.out.println("------------------");
//		System.out.println("Which item do you wish to search for?");
//		searchTerm = scan.nextInt();
		
		while (found == false && lowerBound<=upperBound) {
			midPoint = ((upperBound + lowerBound ) / 2);
			
			if (dataArray[midPoint] == searchTerm) {
				found = true;
				break;
			}
			else if (dataArray[midPoint] < searchTerm ) {
				lowerBound = midPoint + 1;
			}
			else if (dataArray[midPoint] > searchTerm ) {
				upperBound = midPoint - 1;
			}
			++searchIterations;
		}
		
		if (found == true ) {
			System.out.println("Item has been found, it was positioned at the " + midPoint + " index.");
//			System.out.println("Item was found in " + searchIterations + " iterations.");
		} else {
			System.out.println("Item couldn't be found within the list");
		}
	}

	private static void linear(int[] dataArray, int searchTerm) {
		
		int dataArrayLength = dataArray.length;
		
		boolean found = false;
		int position = 0;
		int searchIterations = 0;

//		System.out.println("Java binary search");
//		System.out.println("------------------");
//		System.out.println("Which item do you wish to search for?");
//		searchTerm = scan.nextInt();
		
		while ((found == false) && (position <= (dataArrayLength -1))) {
			
			if (dataArray[position] == searchTerm) {
				found = true;
				break;
			}
			else {
				position += 1;
			}
			++searchIterations;
		}
		
		if (found == true ) {
			System.out.println("Item has been found, it was positioned at the " + position + " index.");
//			System.out.println("Item was found in " + searchIterations + " iterations.");
		} else {
			System.out.println("Item couldn't be found within the list");
		}
	}

}

class Binary {
	
}
