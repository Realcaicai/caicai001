package decorator;

public class ConcreteDecoratorB extends Decorator {
	private void addedBehavior(){
		
	}
	
	public void operation(){
		super.operation();
		addedBehavior();
		System.out.println("B's operation");
	}
}
