
public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight); //the 1, 1, refers to brain and body from the animal class that have been 
										//deleted from public Dog;
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Dogs chew");
		;
	}
	
	public void walk() {
		System.out.println("Dog walks");
		move(5);
	}
	public void run() {
		System.out.println("Dog runs");
		move(10);
	}
	

}
