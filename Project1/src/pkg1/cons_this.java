package pkg1;

public class cons_this 

{
	public void m0()
	{   this.m2(0, 0);
        System.out.println("default parameterized method");
	}
	public void m1 (int a)
    {
		
		System.out.println("one parameterized method");
	}
	public void m2 (int b, int c)
    {
	    
	    System.out.println("two parameterized method");
    }
	public void m3 (int d, int e, int f)
    {   
		this.m4(f, d, e, f);
		System.out.println("three parameterized method");
	}
	public void m4(int g, int h, int i, int j)
    {
	
		this.m0();
	    System.out.println("four parameterized method");
    }
	
	public static void main(String[] args) 
	{
		cons_this obj=new cons_this();
		obj.m3(1, 20, 30);
	}
}
