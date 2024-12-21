package test;

public class Forlooptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  for(int i=1;i<=10; i++) {
	  System.out.println(i);
	  
	  if(i == 5) {
		  System.out.println("hey 5 here");
		  
		  break;
		 
	  }
  }
  
  int j = 0;
  while (j<=10) {
	  System.out.println("I am inside while loop");
	  j++;
  }
	}

}
