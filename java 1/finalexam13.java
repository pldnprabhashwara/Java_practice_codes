import java.util.Scanner;
public class finalexam13{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		char[][] road = new char[4][3];
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.print("Enter the Rows and Cloms (E,O, or R) [" + i + " " + j + "]: ");
				road[i][j] = input.next().charAt(0);
			}
		}
		
		System.out.println("\nParking Lot Layout");
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(road[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Enter a status to search (E/O/R): ");
		char target = input.next().charAt(0);
		
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				if(road[i][j] == target){
					System.out.print("[" + i + " , " + j + "]" );
				}
			}
		}
	}
}