package factorypattern01;

public class NYStyleVeggiePizza extends Pizza {
	
	public NYStyleVeggiePizza(){
		name = "Ny Style Viggie Pizza";
		dough = "Thin Crust Fough";
		sauce = "Marinara Sauce";
		
		toppings.add("grated Regiano Cheese");
		toppings.add("mushroom");
		toppings.add("bellpeppers");
		toppings.add("onions");
	}
}
