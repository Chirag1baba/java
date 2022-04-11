package demo1;
import java.util.*;
class xyz
{
	int age;
   void input()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Age = ");
	   age=sc.nextInt();
	   
   }
   void output()
   {
	   System.out.println("Your age is = "+age);
	   
   }
}
public class demo1 {

	public static void main(String[] args) {
		xyz x1=new xyz();
		x1.input();
		x1.output();
		
	
	 
	 
			

	}

}
