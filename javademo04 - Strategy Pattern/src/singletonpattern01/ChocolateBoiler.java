package singletonpattern01;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoiler chocolateBoiler;

	// this is comment 
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if (chocolateBoiler == null) {
			synchronized(ChocolateBoiler.class) {
				chocolateBoiler = new ChocolateBoiler();
			}
		}
		return chocolateBoiler;
	}
	
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with milk/chocolate mixture
		}
	}
	
	public void drain() {
		if (!isEmpty() && !isBoiled()) {
			//drain the boiled milk and chocolate
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			//bring the contents to a boil
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
