package test;

public class Test2 {
	static Test1 t3= new Test1();
	
	public static void main(String[] args) {
	
	}
	public static void square() {
		System.out.println("square");
	}
	
	public void circle() {
		System.out.println("circle");
	}
	
	//method is same as className
	//No return type
	public Test2() {
		System.out.println("I'm in Constructor");
	}
	
	public Test2(int i) {
		System.out.println("Constructor with Arguments" + i);
	}

}
	
