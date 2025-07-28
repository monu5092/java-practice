import java.util.*;

class ProductCatlogue
{
  public String findProduct(String product[],String userProduct){
   
     int n = product.length;
	 boolean found = false;
	 
	 for(int i=0;i<n;i++)
	 {
	   if(product[i].equals(userProduct))
	   { 
	      System.out.println(product[i]+" is found");
		  found = true;
		  break;
	   }
	 }
	 if(!found)
	 {
		 System.out.print(userProduct+" not found");
	 }
  } 
}

class Product
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
	  String product[] = new String[5];
	  
	  product[0] = "Notebook";
	  product[1] = "Pen";
	  product[2] = "Book";
	  product[3] = "GeometryBox";
	  product[4] = "ProjectBook";
	  
	  for(int i=0;i<5;i++){
	    System.out.print(product[i]+" ");
	  }
	  System.out.println();
	  
	  System.out.print("Enter the UserProduct: ");
	  String userProduct = sc.nextLine();
	  
	  ProductCatlogue obj =  new ProductCatlogue();
	  
	  obj.findProduct(product,userProduct);
   }
}