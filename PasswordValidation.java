import java.util.Scanner;

class PasswordValidation
{
   public static void main(String args[])
   {
	 Scanner sc = new Scanner(System.in);
     String password = "Test@123";
	 
	 int count =1;
	 boolean sucess = false;
	  
	  while(count <= 5 )
	  { 
	    System.out.print("Enter Password : ");
		String userPassword = sc.nextLine();
	   
	    if(password.equals(userPassword))
		{
		  System.out.print("Allow for Login");
		  sucess = true;
		  break;
		}
		 else{
			 System.out.println("Please  Enter Correct password: ");
			 count++;
		 }
	  }
	  if (!sucess)
        {
            System.out.println("Your turn is over. Try after 30 minutes.");
        }
	  
   }
}