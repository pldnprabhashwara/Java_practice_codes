import java.util.Scanner;
public class finalexam25{
    static int calculateStamps(int time, int numBooks){
		int incentive = 0;
		if(time >= 16 && time <= 18){
			if(numBooks >= 5){
				incentive = 8;
			}else if(numBooks >= 2 && numBooks < 5){
				incentive = 4;
			}
			
			
		}else if(time >= 19 && time <= 20){
			if(numBooks >= 5){
				incentive = 10;
			}else if(numBooks >= 2 && numBooks < 5){
				incentive = 6;
			}
		}	
			return incentive;
	}
	
    static void displayReward(int finalStamps){
		if(finalStamps >= 12)
			System.out.println("Free Novel");
		else if(finalStamps >= 8 && finalStamps <= 11)
			System.out.println("Free Magazine");
		else if(finalStamps >= 4 && finalStamps <= 7)
			System.out.println("Free Bookmark");
		else
			System.out.println("No Reward");
	}
	
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter time (16-20): ");
		int time = input.nextInt();
		
		if(time < 16 || time > 20){
			System.out.print("You entered time was wrong");
			return;
		}
		
		System.out.print("Enter number of books: ");
		int numBooks = input.nextInt();
		
		int finalStamps = calculateStamps(time, numBooks);
		System.out.println("Final stamps: " + finalStamps);
		
		displayReward(finalStamps);
	}
}