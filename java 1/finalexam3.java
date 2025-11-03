import java.util.Scanner;
public class finalexam3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] StudentNames = new String[6];
		int[] idNumbers       = new int[6];
		int[] hoursPer        = new int[6];
		
		
		int total = 0;
		int highHours = 0;
		int lowHours = 0;
		int morehour15 = 0;
		int maxindex = 0;
		int minindex = 0;
		
		
		for(int i = 0; i < 6; i++){
			System.out.print("Enter your name " + (i + 1) + ": ");
			StudentNames[i] = input.nextLine();
			
			System.out.print("Enter your id numbers: ");
			idNumbers[i] = input.nextInt();
			
			System.out.print("Number of hours studied per week: ");
			hoursPer[i] = input.nextInt();
			
			input.nextLine();
		}
		
		highHours = hoursPer[0];
		lowHours = hoursPer[0];
		
		for(int j = 0; j < hoursPer.length; j++){
			total += hoursPer[j];
			
			if(highHours < hoursPer[j]){
				highHours = hoursPer[j];
				maxindex = j;
			}
			
			if(lowHours > hoursPer[j]){
				lowHours = hoursPer[j];
				minindex = j;
			}
			
			if(hoursPer[j] > 15){
				morehour15++;
				
			}
			
		}
		
		double average = total / hoursPer.length ;
		
		System.out.println("\nAverage hours: " + average);
		System.out.println("student with the highest study hours: " + StudentNames[maxindex] + " and " + highHours);
		System.out.println("student with the lowest study hours: " + StudentNames[minindex] + " and " + lowHours);
		System.out.println("more than 15 hours per week: " + morehour15 );
		
	}
}	