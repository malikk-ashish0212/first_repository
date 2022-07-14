package pkg1;

public class Student 
 {
    int age;
    int rollno ;
    public void deepak()
    {
    	System.out.println("Welcome all of you");
    	System.out.println("Automation is very easy");
    }
    public static void main(String[] args) 
    {
    	Student obj=new Student();
        obj.deepak();
    	obj.age=21;
    	System.out.println("age is " +obj.age);
    	obj.rollno=36;
    	System.out.println("Roll no." +obj.rollno);
    }
}

