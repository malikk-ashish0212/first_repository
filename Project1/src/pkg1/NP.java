package pkg1; //      ((((((4/2)*5)/5)+5)-5)

public class NP 
{

	public int div(int y, int z)
	{
	int x=y/z;
	return x;
	}
	
	public int mul(int y1, int z1)
	{
	int x1=y1*z1;
	return x1;
	}
	
	public int div1(int y2, int z2)
	{
	int x2=y2/z2;
	return x2;
	}
	
	public int add(int y3, int z3)
	{
	int x3=y3+z3;
	return x3;
	}
	
	public void sub(int y4, int z4)
	{
	int x4=y4-z4;
	System.out.println("final "  +x4);
	}
	
	public static void main(String[] args)
	{
		NP obj=new NP();
		int newdiv= obj.div(4, 2);
		int newmul= obj.mul(newdiv, 5);
		int newdiv2= obj.div1(newmul, 5);
		int newadd= obj.add(newdiv2, 5);
		obj.sub(newadd, 5);
		
	}
	
	
	
	
}
