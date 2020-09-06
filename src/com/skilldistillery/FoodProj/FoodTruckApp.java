package com.skilldistillery.FoodProj;

import java.util.Scanner;

public class FoodTruckApp {
	Scanner kb = new Scanner(System.in);

	FoodTruck[] foodTrucks = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();

	}

	private void run() {

		System.out.println("Hello, welcome to the food truck application.");
boolean keepgoing = true;
	
		for (int i = 0; i < foodTrucks.length; i++) {
			System.out.println("enter truck name");

			String name = kb.next();
			kb.nextLine();
//			if (n)) {
//				keepgoing= false;
//			}

			System.out.println("please enter type of food");
			String foodType = kb.nextLine();

			System.out.println("give them a rating");
			int rating = kb.nextInt();

			FoodTruck newTruck = new FoodTruck(foodType, name, rating);

			foodTrucks[i] = newTruck;

			// System.out.println(foodTrucks[i].toString());
		
		}
		displayMenu();

	}

	private void displayMenu() {
		double sum = 0.0;
		int choice;
		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println("What would you like to do?");
			System.out.println("1: list food trucks");
			System.out.println("2: see avarage rating");
			System.out.println("3: view highest rated");
			System.out.println("4: quit");
			choice = kb.nextInt();
			if (choice == 1) {
				for (int i = 0; i < foodTrucks.length; i++) {
					System.out.println(foodTrucks[i].toString());
					System.out.println();
				}

			} else if (choice == 2) {
				int[] ratings = new int[foodTrucks.length];
				for (int i = 0; i < foodTrucks.length; i++) {
					ratings[i] = foodTrucks[i].getRating();
					
				}

				for (int i = 0; i < ratings.length; i++) {
					sum += ratings[i];

				}
				double average = sum / ratings.length;
				System.out.println(average);
			}
			else if (choice == 3) {
				int[] ratings = new int[foodTrucks.length];
				int largest = ratings[0];
				int bestRating = 0;
				for (int i = 0; i < foodTrucks.length; i++) {
					ratings[i] = foodTrucks[i].getRating();
					 if(ratings[i] > largest) {
					        largest = ratings[i];
					        bestRating = i;
					      }
				}
				System.out.println(bestRating);
			}
			else {
				System.out.println("goodbye");
				keepGoing= false; 
			}

		}
	}

}
