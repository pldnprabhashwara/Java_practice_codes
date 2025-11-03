import java.util.Scanner;
public class finalexam15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[4];
        int[] ids = new int[4];
        char[] types = new char[4];
        int[] scores = new int[4];

        int totalA = 0, totalB = 0;
        int countA = 0, countB = 0;
        int averageA = 0, averageB = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Student " + (i + 1) + " Name: ");
            names[i] = input.nextLine();

            System.out.print("Enter Project ID: ");
            ids[i] = input.nextInt();

            System.out.print("Enter Grade Type (A or a || B or b): ");
            types[i] = input.next().charAt(0);

            System.out.print("Enter Score: ");
            scores[i] = input.nextInt();

            input.nextLine(); 
        }

        int highestNum = 0;
        String highestName = "";
        int lowestNum = 0;
        String lowestName = "";

        boolean firstAproject = true;
        boolean firstBproject = true;

        for (int i = 0; i < scores.length; i++) {
            if (types[i] == 'A' || types[i] == 'a') {
                totalA += scores[i];
                countA++;

                if (firstAproject) {
                    highestNum = scores[i];
                    highestName = names[i];
                    firstAproject = false;
                } else if (scores[i] > highestNum) {
                    highestNum = scores[i];
                    highestName = names[i];
                }
            } else if (types[i] == 'B' || types[i] == 'b') {
                totalB += scores[i];
                countB++;

                if (firstBproject) {
                    lowestNum = scores[i];
                    lowestName = names[i];
                    firstBproject = false;
                } else if (scores[i] < lowestNum) {
                    lowestNum = scores[i];
                    lowestName = names[i];
                }
            }
        }

        averageA = (countA > 0) ? totalA / countA : 0;
        averageB = (countB > 0) ? totalB / countB : 0;

        System.out.println("Average A-Grade Score is: " + averageA);
        System.out.println("Average B-Grade Score is: " + averageB);
        System.out.println("Count of All A-Grade Projects is: " + countA);
        System.out.println("Count of All B-Grade Projects is: " + countB);
        System.out.println("Highest A-Grade Score Student Name is: " + highestName + " and " + highestNum);
        System.out.println("Lowest B-Grade Score Student Name is: " + lowestName + " and " + lowestNum);
    }
}