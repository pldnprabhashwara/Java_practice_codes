import java.util.Scanner;
public class IT25100756Final2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int uni;
		String Rs = "Rs.";
		
		System.out.print("Enter your units: ");
		uni = input.nextInt();
		
		if (uni > 0 && uni <= 100){
			int ans1 = uni * 5;
			System.out.print("Your Units Costs Is " + " " + Rs + " " + ans1);
			
		}
		
		else if (uni > 100 && uni <= 200){
			int ans2 = uni * 7;
			System.out.print("Your Units Costs Is " + " " + Rs + " " + ans2);
			
		}
		
		else if (uni > 200 && uni <= 300){
			int ans3 = uni * 10;
			System.out.print("Your Units Costs Is " + " " + Rs + " " + ans3);
		
		}
		
		else if(uni >= 300){
			int ans4 = uni * 15;
			System.out.print("Your Units Costs Is " + " " + Rs + " " + ans4);
		}
		
	}
	
}