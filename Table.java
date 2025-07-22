import java.util.Scanner;

class Multiplication
{
  public int printTable(int n)
  { 
  
    for(int i=1;i<=10;i++){
	   n = n*i;
	}
	return n;
  }
}

class Table
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter the value of N: ");
	 
	 int n = sc.nextInt();
	 
	 Multiplication table = new Multiplication();
	 table.printTable(n);
  }
}
