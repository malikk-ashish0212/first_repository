//((((10/2)-2)-2)+2)*2)

package pkg1;

public class Arithmatic2 
{
  public int div(int a, int b)
  {
  int x=a/b;
  return x;
  }
  
  public int sub(int a1, int b1)
  {
  int x1=a1-b1;
  return x1;
  }
  public int sub1(int a2, int b2)
  {
  int x2=a2-b2;
  return x2;
  }
  
  public int sum(int a3, int b3)
  {
  int x3=a3+b3;
  return x3;
  }
  public void mul(int a4, int b4)
  {
  int x4=a4*b4;
  System.out.println("The final result "+x4);
  }
  public static void main(String[] args)
  {
	Arithmatic2 obj=new Arithmatic2();
	int fdiv=obj.div(10,2);
	int fsub=obj.sub(fdiv,2);
	int fsub1=obj.sub1(fsub,2);
	int fsum=obj.sum(fsub1,2);
	obj.mul(fsum,2);
	 }
 }
