import java.util.Scanner;

class Table
{
  public void printTable(int n)
  { 
  
    for(int i=1;i<=10;i++){
	   System.out.println(n+" x "+i+" ="+ n*i);
	}
  }
}

class TableCounting
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter the value of N: ");
	 
	 int n = sc.nextInt();
	 
	 Table table = new Table();
	 table.printTable(n);
  }
}
