package com.dal.task;


//Employee class hierarchy
abstract class Pizzaa {
	protected String name;
	protected double cost;

	public Pizzaa(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}

	public abstract void pizzaprice();
}

class VegExtravaganza extends Pizzaa {
	public VegExtravaganza(String name, double cost) {
		super(name, cost);
	}

	public void pizzaprice() {
		System.out.println("Price of Veg Extra vaganza Pizza is " + cost);
	}
}

class SpicedDoubleChicken extends Pizzaa {
	public SpicedDoubleChicken(String name, double cost) {
		super(name, cost);
	}

	public void pizzaprice() {
		System.out.println("Price of Spice Double Chicken Pizza is " + cost);
	}
}

//Abstract factory interface
interface PizzaaFactory {
	public Pizzaa createPizza(String name, double cost);
}

//Concrete factory classes
class VegExtravaganzaFactory implements PizzaaFactory {
	public Pizzaa createPizza(String name, double cost) {
		return new VegExtravaganza(name, cost);
	}
}

class SpicedDoubleChickenFactory implements PizzaaFactory {
	public Pizzaa createPizza(String name, double cost) {
		return new SpicedDoubleChicken(name, cost);
	}
}

//Client class
class PizzaPrice {
	private PizzaaFactory factory;

	public PizzaPrice(PizzaaFactory factory) {
		this.factory = factory;
	}

	public void pizzaprice(String name, double cost) {
		Pizzaa pizza = factory.createPizza(name, cost);
		pizza.pizzaprice();
	}
}

//Example usage
public class AbstractPizzaFactory {
	public static void main(String[] args) {
		PizzaaFactory VegExtravaganzaFactory = new VegExtravaganzaFactory();
		PizzaaFactory SpicedDoubleChickenFactory = new SpicedDoubleChickenFactory();

		PizzaPrice VegExtravaganzaFactoryprice = new PizzaPrice(VegExtravaganzaFactory);
		VegExtravaganzaFactoryprice.pizzaprice("Veg Extra vaganza", 1000.0);

		PizzaPrice SpicedDoubleChickenFactoryprice = new PizzaPrice(SpicedDoubleChickenFactory);
		SpicedDoubleChickenFactoryprice.pizzaprice("Veg Extra vaganza", 500.0);
	}
}
