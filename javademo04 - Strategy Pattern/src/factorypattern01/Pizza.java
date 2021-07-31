package factorypattern01;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String name;
	
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
						/*	{
		System.out.println("Preparing " + name);
		System.out.println("Tossing Dough... ");
		System.out.println("Adding Sauce... ");
		System.out.println("Adding Topping: ");
		for (String topping : toppings) {
			System.out.println("   " + topping);
		}
	}*/
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350F");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		//code to print pizza name;
	}
}
