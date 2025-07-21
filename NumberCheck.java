import java.util.*;

class NumberCheck
{  
   public static void main(String args[])
   {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   
	   Driver dr = new Driver();
	   
	   if(dr.checkPositive(n))
	   {
		   System.out.println("Number is Positive");
	   }
	   else{
		   System.out.println("Number is Negative");
	   }
   }
}

class Driver
{
	public boolean checkPositive(int n)
    {
     if(n<0)
	 {
	   return false;
	 }
	 return true;
   }
}