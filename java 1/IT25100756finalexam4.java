import java.util.Scanner;
public class IT25100756finalexam4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		char[][] positions = new char[4][3];
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.print("Enter Color for Position [" + ( i + " , " + j ) + "]: ");
				positions[i][j] = input.next().charAt(0);
				
				
			}
			System.out.println();
		}
		
		System.out.println("\nFloor Plan Visual Display: ");
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(positions[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Select a Status (O, V, or M) to display all locations: ");
		char target = input.next().charAt(0);
		
		
		System.out.print("Location of All Vacant Rooms are: ");
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.print("[" + (i + " , " + j) + "]");
			}
		}
		
	}
}