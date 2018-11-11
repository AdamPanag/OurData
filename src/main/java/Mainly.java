import java.util.Scanner;

public class Mainly {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);

		System.out.println("** Hello World **" + 
						   "\n\nThis application creates a data base! Let's begin!\n");
		
		int ans;
		do {
			
			System.out.println("** Menu **" 
							   + "\n\n0. Terminate application"
							   + "\n1. Create a new data base. "
							   + "\n2. Add fields in existing data base."
							   + "\n3. Delete fields."
							   + "\n4. Edit fields."
							   + "\n\nWhat do you want to do? Type the right number");
			
			ans = input.nextInt();
			
			
		} while (ans != 0);


	}
}
