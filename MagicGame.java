import java.util.Scanner;

class MagicGame
{
  public static void main(String args[])
  {
    int luckyNumber = 13;
	int numberEnterbyUser = 0;
	Scanner sc = new Scanner(System.in);
	
	while(luckyNumber != numberEnterbyUser)
	{
	  System.out.print("Please enter you Fav number!! -->");
	  numberEnterbyUser = sc.nextInt();
	  
	  if(luckyNumber==numberEnterbyUser){
	    System.out.print("You are the Winner");
	  }
	  else {
		  System.out.println("Try Again!! ");
	  }
	}
	sc.close();
  }
}