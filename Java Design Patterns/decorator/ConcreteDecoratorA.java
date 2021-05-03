package decorator;

public class ConcreteDecoratorA extends Decorator{
	private String addedState;
	
	@Override
	public void operation(){
		super.operation();
		addedState = "new state";
		System.out.println("A's operation");
	}
}
