package test;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String tool = "Selenium";
      System.out.println(tool);
      
      
      String tools[]= {"Selenium","java","Junit"};
      System.out.println(tools.length);
      
      System.out.print(tools[0]);
      System.out.print(" ");
      System.out.println(tools [1]);
      
//      for(int i=0; i<tools.length; i++) {
//    	  System.out.println(tools[i]);
//    	  
//      }
      
      for(String Tool: tools) {
    	  System.out.println(Tool);
    	  
      }
      
  		int numbers[] = {1, 6,11, 100, 650};
  		System.out.println(numbers.length);
  		
//  		for(int i=0; i<numbers.length; i++) {
//  			System.out.println(numbers[i]);
//  		}
  		
  		
  		
  		for(int num :numbers) {
  			System.out.println(num);
  		}
  		System.out.println("-----------------------------------");
  		
  		int arr2[]= {1,3,5,7,9};
//  		for(int i=0; i<arr2.length; i++) {
//  			System.out.println(arr2[i]);
//  		}
  			
  		for(int Array :arr2) {
  			System.out.println(Array);
  		}
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		System.out.println("-----------------------------------");
  		// When we have to create all the things character, string , int in one array
  		Object mix[] = {"Hello", 5, 'c'};
  		System.out.println(mix.length);
  		
  		for(int i=0; i<mix.length; i++) {
  			System.out.println(mix[i]);
  		}
      }
	}


