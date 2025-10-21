package com.kodewala.abstrct;

abstract class Product
{
	String name;
	double price;
	
	public Product(String _name,double _price) {
		this.name = _name;
		this.price = _price;
	}
	
	abstract double calculatePrice();
	
	public void showDetail()
	{
		System.out.println("Product Name : "+name);
		System.out.println("Product Price : "+price);
	}
}
class Electronics extends Product
{
    double warrantyCost;
     
	public Electronics(String _name, double _price,double _warrantyCost) {
		super(_name, _price);
		this.warrantyCost = _warrantyCost;
	}

	@Override
	double calculatePrice() {
		double discount = price*0.10;
		
		return(price-discount)+warrantyCost;
	}
}

class Clothing extends Product
{
    double discountPercent;
    
	public Clothing(String _name, double _price,double _discountPercent) {
		super(_name, _price);
	  	this.discountPercent = _discountPercent;
	}

	@Override
	double calculatePrice() {
	    
		double discount = (discountPercent/100)*price;
		return price-discount;
	}
}
public class EcommerceApp {
  public static void main(String args[])
  {
	  Electronics e1 = new Electronics("Led",1000,100);
	  e1.calculatePrice();
	  e1.showDetail();
	  
	  Clothing c1 = new Clothing("Jacket",3000,10);
	  c1.calculatePrice();
	  c1.showDetail();
	  
  }
}
