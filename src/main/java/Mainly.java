import java.util.Scanner;

public class Mainly {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Table myTable = new Table();
		Base myBase = new Base();
		
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
							   + "\n5. Print a data base."
							   + "\n6. Print all data base."
							   + "\n\nWhat do you want to do? Type the right number");
			
			ans = input.nextInt();
			
			if (ans == 1) {
				
				myTable.createNewData();
			} else if (ans == 2) {
				int pos = myTable.findBase();
				myBase.addFields(pos);
			}
			
		} while (ans != 0);


	}
}
