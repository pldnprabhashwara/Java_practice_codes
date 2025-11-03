import java.util.Scanner;
public class finalexam5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] ids      = new int[5];
		int[] fees     = new int[5];
		
		
		int total = 0;
		int highfee = 0;
		int lowfee = 0;
		int maxid = 0;
		int minid = 0;
		int more100= 0;
		
		for(int i = 0; i < 5; i++){
			System.out.print("Enter your name: ");
			names[i] = input.nextLine();
			
			System.out.print("Membership id: ");
			ids[i] = input.nextInt();
			
			System.out.print("Monthly fee: ");
			fees[i] = input.nextInt();
			
			input.nextLine();
		}
		
		highfee = fees[0];
		lowfee  = fees[0];
		
		for(int j = 0; j < fees.length; j++){
			total += fees[j];
			
			if(highfee < fees[j]){
				highfee = fees[j];
				maxid = j;
			}
			
			if(lowfee > fees[j]){
				lowfee = fees[j];
				minid = j;
			}
			
			if(fees[j] > 100){
				more100++;
			}
		}
		
		int average = total / fees.length;
		
		System.out.println("\nAverage monthly fee is: " + average);
		System.out.println("Member paying the highest fee is: " + names[maxid] + " ; " + highfee + " and " + ids[maxid] );
		System.out.println("Member paying the lowest fee is: " + names[minid] + " ; " + lowfee + " and " + ids[minid]);
		System.out.println("More than $100 per month are: " + more100);
	}
}