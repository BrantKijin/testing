package sample.cafekiosk.unit.berverage;

import sample.cafekiosk.unit.berverage.Beverage;

public class Latte implements Beverage {
	@Override
	public String getName() {
		return "라떼";
	}

	@Override
	public int getPrice() {
		return 4500;
	}
}
