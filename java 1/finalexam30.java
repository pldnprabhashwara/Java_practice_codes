import java.util.Scanner;

public class finalexam30{

    public static double paymentAmount(int date, char cardType, double amount) {
        double discount = 0;

        if (date == 5 && cardType == 'a')
            discount = 0.20;
        else if (date == 6 && cardType == 'b')
            discount = 0.25;
        else if (date == 7 && (cardType == 'a' || cardType == 'c'))
            discount = 0.30;
        else if (date == 8 && (cardType == 'b' || cardType == 'c'))
            discount = 0.20;

        double payment = amount - (amount * discount);
        return payment;
    }

    public static void displayLoyaltyType(double payment) {
        if (payment >= 30000)
            System.out.println("Loyalty Card Type: Gold");
        else if (payment >= 10000 && payment < 30000)
            System.out.println("Loyalty Card Type: Silver");
        else
            System.out.println("Loyalty Card Type: Bronze");
    }

    public static void testPaymentAmount() {
        assert Math.abs(paymentAmount(5, 'a', 1000) - 800) < 0.01 : "Test 1 Failed";
        assert Math.abs(paymentAmount(6, 'b', 2000) - 1500) < 0.01 : "Test 2 Failed";
        assert Math.abs(paymentAmount(7, 'c', 3000) - 2100) < 0.01 : "Test 3 Failed";
        System.out.println("All tests passed successfully!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the date (5–8): ");
        int date = input.nextInt();

       
        System.out.print("Enter the card type (a, b, c): ");
        char cardType = input.next().charAt(0);

        System.out.print("Enter the total amount: ");
        double amount = input.nextDouble();

        double payable = paymentAmount(date, cardType, amount);
        System.out.println("Total payable amount after discount: " + payable);

        displayLoyaltyType(payable);

        testPaymentAmount();  // Run tests
    }
}
