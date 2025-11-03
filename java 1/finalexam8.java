import java.util.Scanner;

public class finalexam8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[6];
        int[] flights = new int[6];
        char[] seats = new char[6];
        int[] prices = new int[6];

        // Input
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Passenger " + (i+1) + " Name: ");
            names[i] = input.nextLine();

            System.out.print("Enter Flight Number: ");
            flights[i] = input.nextInt();

            System.out.print("Enter Seat Type (E/B): ");
            seats[i] = input.next().charAt(0);

            System.out.print("Enter Ticket Price: ");
            prices[i] = input.nextInt();
            input.nextLine(); // clear buffer
        }

        // Economy & Business totals and counts
        int totalEco = 0, totalBus = 0;
        int countEco = 0, countBus = 0;

        // Max / Min passengers
        int highestBusiness = 0;  
        String highestBusinessPassenger = "";

        int lowestEconomy = 0;   
        String lowestEconomyPassenger = "";

        // First values (initialize using first suitable element)
        boolean firstBusiness = true;
        boolean firstEconomy = true;

        for (int i = 0; i < prices.length; i++) {
            if (seats[i] == 'E' || seats[i] == 'e') {
                totalEco += prices[i];
                countEco++;

                if (firstEconomy) {
                    lowestEconomy = prices[i];
                    lowestEconomyPassenger = names[i];
                    firstEconomy = false;
                } else if (prices[i] < lowestEconomy) {
                    lowestEconomy = prices[i];
                    lowestEconomyPassenger = names[i];
                }
            } else if (seats[i] == 'B' || seats[i] == 'b') {
                totalBus += prices[i];
                countBus++;

                if (firstBusiness) {
                    highestBusiness = prices[i];
                    highestBusinessPassenger = names[i];
                    firstBusiness = false;
                } else if (prices[i] > highestBusiness) {
                    highestBusiness = prices[i];
                    highestBusinessPassenger = names[i];
                }
            }
        }

        // Output
        System.out.println("\n--- Summary ---");
        System.out.println("Total Economy Revenue is: " + totalEco);
        System.out.println("Total Business Revenue is: " + totalBus);
        System.out.println("Count of All Economy Reservations is: " + countEco);
        System.out.println("Count of All Business Reservations is: " + countBus);
        System.out.println("Highest Business Price Passenger Name is: " + highestBusinessPassenger);
        System.out.println("Lowest Economy Price Passenger Name is: " + lowestEconomyPassenger);
    }
}
