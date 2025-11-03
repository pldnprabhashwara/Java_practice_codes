import java.util.Scanner;
public class finalexam16{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char[][] peoples = new char[2][4];
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 4; j++){
				System.out.print("Enter Role for Position(use L,M,or A) [ " + i + " , " + j + "]: ");
				peoples[i][j] = input.next().charAt(0);
			}
		}
		
		System.out.println("\nTeam Board Visual Display:");
		for(int i = 0; i < 2; i++){
			for(int j =0; j < 4; j++){
				System.out.print(peoples[i][j] + " ");
				
			}
			System.out.println();
		}
		
		System.out.print("\nSelect a Role (L, M, or A) to display all locations: ");
		char target = input.next().charAt(0);
		
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 4; j++){
				if(peoples[i][j] == target){
				System.out.println("Location of All Member Roles are: ["+ i + "," + j + "]");
				}
			}
		}
		
		
	}
}