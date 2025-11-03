import java.util.Scanner;

public class finalexam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] pronames = new String[6];
        int[] proid = new int[6];
        double[] prices = new double[6];

        // Variables for calculations
        double total = 0;
        double exp_pro = 0;
        double che_pro = 0;
        int maxindex = 0;
        int minindex = 0;
        int countover20 = 0;

        // Input products
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the product name " + (i + 1) + ": ");
            pronames[i] = input.nextLine();

            System.out.print("Enter the product id: ");
            proid[i] = input.nextInt();

            System.out.print("Enter the product Price: ");
            prices[i] = input.nextDouble();
            input.nextLine(); // Consume newline
        }

        // Initialize min/max with the first price
        exp_pro = prices[0];
        che_pro = prices[0];

        // Calculate total, max, min, count over $20
        for (int j = 0; j < prices.length; j++) {
            total += prices[j];

            if (prices[j] > exp_pro) {
                exp_pro = prices[j];
                maxindex = j;
            }

            if (prices[j] < che_pro) {
                che_pro = prices[j];
                minindex = j;
            }

            if (prices[j] > 20) {
                countover20++;
            }
        }

        double average = total / prices.length;

        // Print results
        System.out.println("\nAverage price: $" + average);
        System.out.println("Most expensive product: " + pronames[maxindex] + " ($" + exp_pro + ")");
        System.out.println("Cheapest product: " + pronames[minindex] + " ($" + che_pro + ")");
        System.out.println("Number of products over $20: " + countover20);
    }
}
