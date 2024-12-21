package test;

public class ReturntypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum());
int x = sum();
System.out.println(x);
String y = hello();
System.out.println(y);
	}
    public static int sum() {
	int a = 4+5;
	return a;
}
    
    
    public static String hello() {
    	String s= "hello World";
    	return s;
    }
}

