package test;

public class ArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    sum();
    sum(8,9);
    sum(3,6,9);
	}
  public static void sum() {
	  int a = 4+5;
	  System.out.println(a);
  }
  
  
  public static void sum(int b, int c) {
	  int a = b+c;
	  System.out.println(a);
  }
  
  public static void sum(int b, int c,int d) {
	  int a = b+c+d;
	  System.out.println(a);
  }
  }
