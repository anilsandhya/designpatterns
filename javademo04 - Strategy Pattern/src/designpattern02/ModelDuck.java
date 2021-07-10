package designpattern02;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
	}
	public void display() {
		System.out.println("I am a model duck.");
	}
}
