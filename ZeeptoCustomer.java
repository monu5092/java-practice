import java.util.*;

class Discount {

    public String customerCategory(int amount) {
        if (amount < 1000) {
            return "OrdType";
        } else if (amount >= 1000 && amount < 5000) { 
            return "RegularType";
        } else {
            return "VipType";
        }
    }

    public void discountAmount(int amount) { 
        String category = customerCategory(amount);

        switch (category) {
            case "OrdType":
                System.out.println("Give 5% Discount and Discount-Amount "+(amount * 0.05));
                break;
            case "RegularType":
                System.out.println("Give 10% Discount Discount-Amount "+(amount * 0.10));
                break;
            case "VipType":
                System.out.println("Give 15% Discount Discount-Amount "+(amount * 0.15)); 
                break;
            default:
                System.out.println("Enter a valid amount.");
        }
    }
}

class ZeeptoCustomer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Order Amount: ");
        int amount = sc.nextInt();

        Discount discount = new Discount();
        //discount.discountAmount(amount);
		
		 int ds = discount.discountAmount(amount);
		
		int totalPrice = amount - ds;
		System.out.print("Total Price "+totalPrice);
		
    }
}
