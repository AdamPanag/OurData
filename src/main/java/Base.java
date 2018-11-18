import java.util.ArrayList;
import java.util.Scanner;

public class Base {
	
	ArrayList<Field> baseObjects = new ArrayList<Field>();
	ArrayList<String> categories = new ArrayList<String>();
	
	Scanner input = new Scanner(System.in);
	
	public void addCategories() {
		
		String flag;
		do {
			
			System.out.println("Enter the Name of the category:");
			String name = input.nextLine();
			categories.add(name); // Adding categories
			
			System.out.println("Add category by pressing 1. Leave by pressing any key.");
			flag = input.nextLine();			
			
		} while (flag.equals("1"));
	}
	
	static int counter = 0;
	
	public void addFields() {
	
		String flag;
		do {
			baseObjects.add(new Field());
		
			for (int i = 0; i < categories.size(); i++) {
				
				System.out.println("Give " + categories.get(i) + ":");
				String name = input.nextLine();
				baseObjects.get(counter).fields.add(name); // Adding fields in each category
			}

			System.out.println("Continue adding fields by pressing 1. Leave by pressing any key.");
			flag = input.nextLine();
			System.out.println();
			counter++;
			
		} while (flag.equals("1"));
	}
	
	public void printBase() {
			
		for (int i = 0; i < categories.size(); i++) {
		
			System.out.printf("%s		",categories.get(i));
		}
		
		System.out.println();
		for (int i = 0; i < categories.size(); i++) {
			
			for (int j=0; j < baseObjects.get(i).fields.size(); j++) {

				System.out.print(baseObjects.get(i).fields.get(j) + "		");	
				

			}
			System.out.println();
		}
				

	}
	
	
	
	
	/** static ArrayList<String> categories = new ArrayList<String>();
	
	Scanner input = new Scanner(System.in);
	
	public void addFields(int pos) {
		
		
		System.out.println(pos); 
	}
	
	public void addCategories(int pos) {
		
		System.out.println("Specify the categories of " + Table.nameOfBase.get(pos) + "\n");
		
		int flag;
		do {
			
			System.out.println("name of category:");
			String name = input.nextLine();
			categories.add(name);
			
			System.out.println("Do you want to continue adding categories? If yes press 1");
			flag = input.nextInt();
			
		} while (flag == 1);
	} **/
}

