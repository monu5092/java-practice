package com.kodewala.inheritance.practice;

class User {
    String name;
    String email;

    public User(String _name, String _email) {
        this.name = _name;
        this.email = _email;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class AdminUser extends User {
    String gradePay;

    public AdminUser(String name, String email, String gradePay) {
        super(name, email);
        this.gradePay = gradePay;
    }

    public void approveUser(User user) {
        System.out.println("Admin " + name + " approved user: " + user.name);
    }
}


class CustomerUser extends User {
    int loyaltyPoints;

    public CustomerUser(String name, String email, int loyaltyPoints) {
        super(name, email);
        this.loyaltyPoints = loyaltyPoints;
    }

 
    public void purchase(double amount) {
        System.out.println(name + " purchased items worth $" + amount);
        int earnedPoints = (int) (amount / 10); 
        loyaltyPoints += earnedPoints;
        System.out.println(name + " earned " + earnedPoints + " loyalty points.");
    }

    public void redeemPoints(int points) {
        if (points <= loyaltyPoints) {
            loyaltyPoints -= points;
            System.out.println(name + " redeemed " + points + " points. Remaining points: " + loyaltyPoints);
        } else {
            System.out.println(name + " does not have enough points to redeem.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Loyalty Points: " + loyaltyPoints);
    }
}

public class Driver1 {
    public static void main(String[] args) {
        AdminUser admin = new AdminUser("Alice", "alice@company.com", "GP-01");
        CustomerUser customer = new CustomerUser("Bob", "bob@gmail.com", 50);

        System.out.println("=== Admin Info ===");
        admin.displayInfo();

        System.out.println("\n=== Customer Info ===");
        customer.displayInfo();

        System.out.println("\n=== Customer Purchase ===");
        customer.purchase(250);
        customer.redeemPoints(20);

        System.out.println("\n=== Admin Action ===");
        admin.approveUser(customer);
    }
}
