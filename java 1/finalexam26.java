import java.util.Scanner;
public class finalexam26{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char[][] seats = new char[4][4];
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.print("Enter Section for Position[" + i + " " + j + "]: ");
				seats[i][j] = input.next().charAt(0);
			}
		}
		
		System.out.println("\nSeating Chart Visual Display: ");
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Select a Section (F, B, or S) to display all locations: ");
		char symbol = input.next().charAt(0);
		
		System.out.print("Location of All Front Seats are: ");
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(seats[i][j] == symbol){
					System.out.print("[" + i + " " + j + "]");
				}
			}
		}
		
	}
}