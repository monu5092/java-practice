import java.util.Scanner;

class OddEven
{
   public void checkOddEven(int number)
   {
     if(number%2==0)
	 {
	   System.out.print("Number "+number+" is Even.");
	 }
	 else{
	   System.out.print("Number "+number+" is Odd.");
	 }
   }
}

class Driver
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	
	int n =sc.nextInt();
	
	OddEven oE = new OddEven();
	
	oE.checkOddEven(n);
  }
}
