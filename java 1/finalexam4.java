import java.util.Scanner;
public class finalexam4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[4];
		int[] numbers  = new int[4];
		double[] prices  = new double[4];
		
		double total = 0;
        double highticket = 0;
        double lowticket = 0;
        int highnum = 0;
        int lownum = 0;
        double more5000 = 0;
        		
		
		for(int i = 0; i < 4; i++){
			System.out.print("Enter your name: ");
			names[i] = input.nextLine();
			
			System.out.print("Enter your ticket number: ");
			numbers[i] = input.nextInt();
			
			System.out.print("Enter thr ticket price: ");
			prices[i] = input.nextDouble();
			
			input.nextLine();
		}
		
		highticket = prices[0];
		lowticket = prices[0];
		
		for(int j = 0; j < prices.length; j++){
			total += prices[j];
			
			if(prices[j] > highticket){
				highticket = prices[j];
				highnum = j;
			}
			
			if(prices[j] < lowticket){
				lowticket = prices[j];
				lownum = j;
			}	
				
			if(prices[j] > 5000){
				more5000++;
			}
			
			
		}
		double average = total / prices.length;
		
		System.out.println("\nAverage ticket price is: " + average);
		System.out.println("Most expensive ticket is: " + highticket + " and " + names[highnum] );
		System.out.println("Cheapest expensive ticket is: " + lowticket + " and " + names[lownum]);
		System.out.println("Tickets cost more than $500 are: " + more5000 );
	}

}