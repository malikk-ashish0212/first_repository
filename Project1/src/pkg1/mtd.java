package pkg1;

public class mtd 
{

	public void m0()
      {
	    System.out.println("Default method");
	   this.m1();
      }
	public void m1()
	  {
		System.out.println("one parameterized method");
		this.m2();
	  }
		
	public void m2()
	  {
		System.out.println("two parameterized method");
		this.m4();
	
	  }
		
	public void m3()
	  {
		System.out.println("three parameterized method");
		this.m0();
	  }
		
	public void m4()
	  {
		System.out.println("four parameterized method");
		
	  }
		
	
	public static void main(String[] args) 
	{
		mtd obj=new mtd();
		obj.m3();
		
	}
}


