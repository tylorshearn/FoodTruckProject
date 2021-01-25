package com.skilldistillery.foodtruck;

public class FoodTruck {

	public String name;
	public String foodType;
	public int numericRating;
	public static int numericID = 0;
	int numericIDCounter = 0;

	@Override
	public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("FoodTruck [name=").append(name).append(", foodType=").append(foodType)
	.append(", numericRating=").append(numericRating).append(", numericID=").append(numericID).append("]");
	return builder.toString();
	}

}
