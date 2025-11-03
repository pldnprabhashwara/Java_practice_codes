import java.util.Scanner;
public class finalexam21{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		char[][] seats = new char[2][5];
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 5; j++){
				System.out.print("Enter Status for Position [" + i + " " + j + "]: ");
				seats[i][j] = input.next().charAt(0);
			}
		}
		
		System.out.println("\nSeating Chart Visual Display: ");
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(seats[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("\nSelect a Status (O, E, or V) to display all locations: ");
		char target = input.next().charAt(0);
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 5; j++){
				if(seats[i][j] == target){
					System.out.println("Location of All Empty Seats are: [" + i + " " + j + " " + "] ");
				}
			}
		}
		
	}
}