package test;

public class Test3 {
static Test3 t3 = new Test3();
static Test1 t1 = new Test1();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
red();
t3.blue();
Test1.printMe();
t1.testMe();
	}
	public static void red() {
		System.out.println("red");
	}
	public void blue() {
		System.out.println("blue");
	}
 }

