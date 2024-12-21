package test;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      ArrayList<String> tools = new ArrayList<String>();
//       tools.add("selenium");
//       tools.add("Java");
//       tools.add("TestLink");
//       tools.add("TestRail");
//       tools.add("Zephyr");
//       
//       System.out.println(tools.size());
//       
//       System.out.println(tools.get(0));
//       System.out.println(tools.get(1));
//       System.out.println(tools.get(2));
//       System.out.println(tools.get(3));
//       System.out.println(tools.get(4));
//       
//       System.out.println("---------------");
//       tools.remove(2);
//       System.out.println(tools.size());
//       
//       //forloop
//       
//       for (int i=0; i<tools.size();i++) {
//    	   System.out.println(tools.get(i));
//       }
       
       //ArrayList<String> arr = new ArrayList<String>();
       
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(5);
       list.add(0, 10000);
       list.add(89);
       list.add(78);
       
       for(int a:list) {
    	   System.out.println(a);
       }
       
      String sos= "Rahul Shetty Academy";
      for(int i = sos.length()-1; i>0; i--) {
    	  System.out.println("char["+i+"] = "+sos.charAt(i));
      }
       
       
       
       
       
       
       
	}
	
	

}
