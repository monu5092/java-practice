import java.util.*;
class Tax
{ 
  static int rate1 = 5;
  static int rate2 = 18;
  static int rate3 = 28;
   
   int gstTax;
   
  
  public int calculateGST(int itemPrice,String itemType)
  {
    if(itemType.equals("iphone") && itemPrice >= 10000)
	{
	   gstTax = (itemPrice*28)/100; 
	}
	else if(itemType.equals("Samsung") && itemPrice >= 30000)
	{
	   gstTax = itemPrice + (itemPrice*18)/100;
	}
	else{
	   gstTax = itemPrice +(itemPrice*5)/100;
	}
	return  gstTax;
  }  
}

public class ItemPrice
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
      
	 System.out.print("Enter the ItemType: ");
	 String itemType = sc.nextLine();
	 
	 System.out.print("Enter the ItemPrice: ");
	 int itemPrice = sc.nextInt();
	
	 Tax totalPrice = new Tax();
	 
	 int totalGst =  totalPrice.calculateGST(itemPrice,itemType);
	 
	 System.out.print("TotalPrice: "+ (itemPrice + totalGst));
   
   
  }
}