package factorypattern01;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.OrderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.OrderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		
	}

}
