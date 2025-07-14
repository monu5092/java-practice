import java.util.*;

class ShoppingCartApp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Shopping Cart Application\n");

        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<String> productDescriptions = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();
        ArrayList<Integer> productQuantities = new ArrayList<>();

        while (true) {
            System.out.println("\nEnter the User:\n1. Seller\n2. Buyer\n3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            String userChoice = sc.nextLine();

            if (userChoice.equals("1")) {
          
                while (true) {
                    System.out.print("Enter the Product Name: ");
                    String pName = sc.nextLine();
                    productNames.add(pName);

                    System.out.print("Enter the Product Description: ");
                    String pDesc = sc.nextLine();
                    productDescriptions.add(pDesc);

                    System.out.print("Enter the Product Price: ");
                    double pPrice = sc.nextDouble();
                    productPrices.add(pPrice);

                    System.out.print("Enter the Product Quantity: ");
                    int pQty = sc.nextInt();
                    productQuantities.add(pQty);
                    sc.nextLine(); 

                    System.out.print("Do you want to add another product? (yes/no): ");
                    String cont = sc.nextLine();
                    if (!cont.equalsIgnoreCase("yes")) {
                        break;
                    }
                }

                System.out.println("\nProducts added successfully:");
                for (int i = 0; i < productNames.size(); i++) {
                    System.out.println("\nProduct " + (i + 1) + ":");
                    System.out.println("Name: " + productNames.get(i));
                    System.out.println("Description: " + productDescriptions.get(i));
                    System.out.println("Price: " + productPrices.get(i));
                    System.out.println("Quantity: " + productQuantities.get(i));
                }

            } else if (userChoice.equals("2")) {
                
                if (productNames.isEmpty()) {
                    System.out.println("No products available to buy. Ask the seller to add products first.");
                    continue;
                }

                System.out.print("Enter the Product Name you want to buy: ");
                String desiredName = sc.nextLine();

                System.out.print("Enter the Product Description: ");
                String desiredDesc = sc.nextLine();

                System.out.print("Enter the Quantity you want to purchase: ");
                int desiredQty = sc.nextInt();
                sc.nextLine(); 

                boolean found = false;
                for (int i = 0; i < productNames.size(); i++) {
                    if (productNames.get(i).equalsIgnoreCase(desiredName) &&
                        productDescriptions.get(i).equalsIgnoreCase(desiredDesc)) {

                        if (desiredQty <= productQuantities.get(i)) {
                            double total = productPrices.get(i) * desiredQty;
                            double gst = total * 0.18;
                            double grandTotal = total + gst;

                            System.out.println("\n----- Payment -----");
                            System.out.println("Total Price: ₹" + total);
                            System.out.println("GST (18%): ₹" + gst);
                            System.out.println("Grand Total to Pay: ₹" + grandTotal);

                            System.out.print("Enter delivery address: ");
                            String address = sc.nextLine();
                            System.out.println("Order placed successfully! It will be delivered to: " + address);

                       
                            productQuantities.set(i, productQuantities.get(i) - desiredQty);
                            found = true;
                        } else {
                            System.out.println("Insufficient stock. Available quantity: " + productQuantities.get(i));
                            found = true;
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Product not found in the system.");
                }

            } else if (userChoice.equals("3")) {
                System.out.println("Exiting the application. Thank you!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
