package test;

public class ConditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a= 20;
       int b =20;
       
       
       
        if (a==b) {
        	System.out.println("equal");
        	
        }else {
        	System.out.println("not equal");
        }
      
        
        String expectedResult="abc";
        String actualResult ="abc1";
        		if (expectedResult.equals(actualResult)) {
        			System.out.println("print equal");
        		}else {
        			System.out.println("print not equal");
        		}
	}

}
