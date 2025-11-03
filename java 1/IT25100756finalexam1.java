import java.util.Scanner;
public class IT25100756finalexam1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		char[][] positions = new char[3][4];
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.print("Enter Status for Position [" + i + " " + j + "]: ");
				positions[i][j] = input.next().charAt(0);
			}
			System.out.println();
		}
		
		
		System.out.println("\nWarehouse Grid Visual Display: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				System.out.print( positions[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Select a Status (S, E, or U) to display all locations: ");
		char target = input.next().charAt(0);
		
		
		System.out.print("Location of All Stocked Slots are: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				if(target == positions[i][j])
					System.out.print("[" + i + " , " + j + "]");
			}
		}
	}
}