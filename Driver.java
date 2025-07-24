import java.util.Scanner;

class Driver
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the class name in Digit: ");
	int standard = sc.nextInt();
	
	Switch obj = new Switch();
	  obj.allocateRoom(standard);
  }
}

class Switch
{
  public void allocateRoom(int standard)
  {
    switch(standard){
	 case 1:
	     System.out.print("Go to 1st Floor Hall");
	    break;
	 case 2:
	    System.out.print("Go to 2nd Floor Hall");
	    break;
     case 3:
	     System.out.print("Go to 3rd Floor Hall");
	    break;
     case 4:
	     System.out.print("Go to 4th Floor Hall");
	    break;
     case 5:
	     System.out.print("Go to 5th Floor Hall");
	    break;
     case 6:
	     System.out.print("Go to 6st Floor Hall");
	    break;	
     case 7:
	     System.out.print("Go to 7th Floor Hall");
	    break;
     default:
        System.out.print("Room Allocation upto 7 class");	 
	}
  }
}