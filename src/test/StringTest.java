package test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String testing = "Automation";
      System.out.println(testing);
      
      String tool = "Selenium";
      System.out.println(tool);
      
      System.out.println(testing +" "  + tool);
      
      int a = 10;
      int b = 20;
      
      System.out.println(testing+tool+a+b);
      //(as this is starting with stringso it will concatenate)
      
      System.out.println(a+b+testing+tool);
      //(as line is starting with integer it will add first)
       System.out.println(testing+tool+(a+b));
       //(it will add first as a and b are in paranthesis)
	}

}
