package day9;

public class ObjectAndClass {
	public class DiningTable { 
		 int capacity; 
		 String color; 
		 String design; 
		 int legs; 
		 String material; 
		 double length; 
		 double height; 
		 double breadth; 
		 boolean isConditionGood; 
		 String dish[]; 
		 
//		 public void eating(String dish[]) { 
//		 
//		  for (int i = 0; i < dish.length; i++) { 
//		   System.out.println("Eating dish: " + dish[i]); 
//		  } 
//		 
//		 } 
		 
		 public boolean holdDish(String dish) { 
		  System.out.println("Holding dish: "+dish); 
		  return false; 
		 
		 } 
		 
		 public boolean isPlaceAvail() { 
		   
		  return true; 
		 
		 } 
		 
		}
}
