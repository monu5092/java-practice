import java.util.Scanner;

class Grade
{
  public String checkGrade(int marks)
  {
    if(marks>=75)
	{
	  return "D";
	}
	else if(marks>=35)
	{
	  return "Pass";
	}
	else if(marks>=0){
	  return "Fail";
	}
	else{
      return null;	
	}
  }
}

class Result
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Marks: ");
	int n =  sc.nextInt();
	Grade grade = new Grade();
	
	
	System.out.print(grade.checkGrade(n));
  }
}