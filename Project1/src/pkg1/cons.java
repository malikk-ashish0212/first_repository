//Assignment 1 using this keyword in constructor

package pkg1; 

public class cons

{
 public cons(int a, int b, int c, int d) 
 {  
	 this(1,2);
	 System.out.println("four parameterized constructor");
}
 public cons(int a, int b) 
 {
	this(1);
	 System.out.println("two parameterized constructor");
}
 public cons(int a) 
 {  
	 this();
	 System.out.println("one parameterized constructor");
}
 public cons() 
 {  
	 this(1,2,3);
	 System.out.println("Default parameterized constructor");
}
 public cons(int a, int b, int c) 
 {
	 System.out.println("three parameterized constructor");
}
 
 public static void main(String[] args) 
 {
	cons obj1=new cons(1,2,3,4);
	
	
}
}
