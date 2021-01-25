package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		FoodTruckApp foodTruckApp = new FoodTruckApp();

		int numericIDCounter = 0;

		FoodTruck[] foodTruckB;

		foodTruckB = new FoodTruck[4];

		FoodTruck foodTruck1;
		foodTruck1 = new FoodTruck();
		System.out.println("You are going to be inputting a name, food type, and numeric rating for\n"
				+ "up to 5 food trucks. Please start with the name of the first food truck: ");
		foodTruck1.name = kb.nextLine();
		System.out.println("Input the food type for the first food truck: ");
		foodTruck1.foodType = kb.nextLine();
		System.out.println("Input a numeric rating from 0-5 for the first food truck. Use whole numbers only: ");
		foodTruck1.numericRating = kb.nextInt();
		foodTruck1.numericID++;
		numericIDCounter = foodTruck1.numericID;
		System.out.println(foodTruck1.numericID);
		System.out.println("If you'd like to open the menu, input \"quit\" when prompted\n"
				+ "for the name of any of the following food trucks.");

		FoodTruck foodTruck2;
		foodTruck2 = new FoodTruck();
		System.out.println("Input the name of the second food truck: ");
		foodTruck2.name = kb.next();
		while (foodTruck2.name.equals("quit")) {
			menu();
		}
		System.out.println("Input the food type for the second food truck: ");
		foodTruck2.foodType = kb.next();
		System.out.println("Input a numeric rating from 0-5 for the second food truck. Use whole numbers only: ");
		foodTruck2.numericRating = kb.nextInt();
		foodTruck2.numericID++;
		numericIDCounter = foodTruck2.numericID;
		System.out.println(foodTruck2.numericID);

		FoodTruck foodTruck3;
		foodTruck3 = new FoodTruck();
		System.out.println("Input the name of the third food truck: ");
		foodTruck3.name = kb.next();
		System.out.println("Input the food type for the third food truck: ");
		foodTruck3.foodType = kb.next();
		System.out.println("Input a numeric rating from 0-5 for the third food truck. Use whole numbers only: ");
		foodTruck3.numericRating = kb.nextInt();
		foodTruck3.numericID++;
		numericIDCounter = foodTruck3.numericID;
		System.out.println(foodTruck3.numericID);

		FoodTruck foodTruck4;
		foodTruck4 = new FoodTruck();
		System.out.println("Input the name of the fourth food truck: ");
		foodTruck4.name = kb.next();
		System.out.println("Input the food type for the fourth food truck: ");
		foodTruck4.foodType = kb.next();
		System.out.println("Input a numeric rating from 0-5 for the fourth food truck. Use whole numbers only: ");
		foodTruck4.numericRating = kb.nextInt();
		foodTruck4.numericID++;
		numericIDCounter = foodTruck4.numericID;
		System.out.println(foodTruck4.numericID);

		FoodTruck foodTruck5;
		foodTruck5 = new FoodTruck();
		System.out.println("Input the name of the fifth food truck: ");
		foodTruck5.name = kb.next();
		System.out.println("Input the food type for the fifth food truck: ");
		foodTruck5.foodType = kb.next();
		System.out.println("Input a numeric rating from 0-5 for the fifth food truck. Use whole numbers only: ");
		foodTruck5.numericRating = kb.nextInt();
		foodTruck5.numericID++;
		numericIDCounter = foodTruck5.numericID;
		System.out.println(foodTruck5.numericID);
	}

	String.menu(String menu, Scanner kb) {
		System.out.println("List all existing food trucks: Input \"1\"");
		System.out.println("See the average rating of food trucks: Input \"2\"");
		System.out.println("Display the highest-rated food truck: Input \"3\"");
		System.out.println("Quit the program: Input \"4\"");
		
		int switchChoice = 0;
		switchChoice = kb.nextInt();
		switch(switchChoice) {
		case 1:
			System.out.println(foodTruck1.name + );
		
		}
	}

}
