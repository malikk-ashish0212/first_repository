//((((10+2)+2)-2)*2)/2)

package pkg1;

public class Arithmatic1 

{
   public int sum(int a, int b, int c) 
   {
	int x;
	x=a+b+c;
	return x;
   }
   public int sub(int a1, int b1)
   {
	   int x1;
	   x1=a1-b1;
	   return x1;
   }
   public int mul(int a2, int b2)
   {
	   int x2;
	   x2=a2*b2;
	   return x2;
   }
   public void div(int a3, int b3)
   { 
	   int z3;
	   z3=a3/b3;
	   System.out.println("final result " +z3);
   }
   public static void main(String[] args) 
   {
	Arithmatic1 obj=new Arithmatic1();
	
	int sumresult1=obj.sum(10,2,2);
	int subresult=obj.sub(sumresult1,2);
	int mulresult=obj.mul(subresult,2);
	obj.div(mulresult, 2);
   }
   
}
