package test;

import selenium.Test4; // When we call a class from different package hover on the error and import

public class Test1 {
	//className objname = new Classname();
	static Test1 t1 = new Test1();
    static Test2 t2 = new Test2();
    static Test3 t3 = new Test3();
    static Test4 t4 = new Test4();
  
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("I am in main");
      scanMe();
      printMe();
      System.out.println("after print ");
     t1.testMe();
     t2.circle();
  Test2.square();
  Test3.red();
  t3.blue();
  t4.bmw();
  Test4.audi();
  
  
    
	}
    public static void printMe() {
    	System.out.println("print me");
    }
    
    
    public static void scanMe() {
    	System.out.println("scanMe");
    }
    
    public void testMe() {
    	System.out.println("test Me");
    }
    public void paintMe() {
    	System.out.println("paint Me");
    }
}
