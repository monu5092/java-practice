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

    public int discountAmount(int amount) { 
        String category = customerCategory(amount);
        int discount = 0; // initialize to avoid compilation error

        switch (category) {
            case "OrdType":
                discount = (int)(amount * 0.05);
                System.out.println("Give 5% Discount, Discount-Amount: " + discount);
                break;
            case "RegularType":
                discount = (int)(amount * 0.10);
                System.out.println("Give 10% Discount, Discount-Amount: " + discount);
                break;
            case "VipType":
                discount = (int)(amount * 0.15);
                System.out.println("Give 15% Discount, Discount-Amount: " + discount);
                break;
            default:
                System.out.println("Enter a valid amount.");
        }
        return discount;
    }
}

class ZC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Order Amount: ");
        int amount = sc.nextInt();

        Discount discount = new Discount();
        int ds = discount.discountAmount(amount);

        int totalPrice = amount - ds;
        System.out.println("Total Price: " + totalPrice);
    }
}
