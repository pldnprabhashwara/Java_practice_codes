import java.util.Scanner;
public class finalexam12{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		char[][] shelf = new char[3][5];
		
		for(int i = 0; i < 3; i++){
			for(int j =0; j < 5; j++){
				System.out.print("Enter status for position [" + i + " " + j + "]: ");
				shelf[i][j] = input.next().charAt(0);
				
			}
		}
		System.out.println("\nshelf Layout Visual Display");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(shelf[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.print("\nSelect a Status (E, F, or D) to display all location: ");
		char target = input.next().charAt(0);
		
		
        System.out.print("Location of All " + target + " Slots are: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 5; j++){
				if(shelf[i][j] == target){
				System.out.print("[" + i + "," + j + "] ");
				}
				
			}
		}
		
	}
}