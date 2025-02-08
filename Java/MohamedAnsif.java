/*
 * Author: MohamedAnsif02
 * Email: mohamedansif2003@gmail.com
 * Date: 09.02.2025
 * Description: Representing a general Payment method
 */



// Abstract class representing a general Payment method
abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

// Credit Card Payment class
class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;

    public CreditCardPayment(double amount, String cardNumber, String cardHolder, String expiryDate) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Payment Successful!");
    }
}

// Debit Card Payment class
class DebitCardPayment extends Payment {
    private String cardNumber;
    private String cardHolder;
    private String pin;

    public DebitCardPayment(double amount, String cardNumber, String cardHolder, String pin) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.pin = pin;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Debit Card Payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Payment Successful!");
    }
}

// PayPal Payment class
class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal Payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("PayPal Email: " + email);
        System.out.println("Payment Successful!");
    }
}

// Main class to handle user interaction
public class PaymentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Payment System");
        System.out.print("Enter the amount to pay: $");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. PayPal");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Payment payment = null;

        switch (choice) {
            case 1:
                System.out.print("Enter Card Holder Name: ");
                String ccHolder = scanner.nextLine();
                System.out.print("Enter Card Number (16 digits): ");
                String ccNumber = scanner.nextLine();
                System.out.print("Enter Expiry Date (MM/YY): ");
                String expiry = scanner.nextLine();
                payment = new CreditCardPayment(amount, ccNumber, ccHolder, expiry);
                break;

            case 2:
                System.out.print("Enter Card Holder Name: ");
                String dcHolder = scanner.nextLine();
                System.out.print("Enter Card Number (16 digits): ");
                String dcNumber = scanner.nextLine();
                System.out.print("Enter PIN (4 digits): ");
                String pin = scanner.nextLine();
                payment = new DebitCardPayment(amount, dcNumber, dcHolder, pin);
                break;

            case 3:
                System.out.print("Enter PayPal Email: ");
                String email = scanner.nextLine();
                payment = new PayPalPayment(amount, email);
                break;

            default:
                System.out.println("Invalid choice! Exiting...");
                System.exit(0);
        }

        // Process the payment
        if (payment != null) {
            payment.processPayment();
        }

        scanner.close();
    }
}
