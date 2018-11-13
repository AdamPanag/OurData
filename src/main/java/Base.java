import java.util.ArrayList;
import java.util.Scanner;

public class Base {
	
	ArrayList<Field> baseObjects = new ArrayList<Field>();
	ArrayList<String> categories = new ArrayList<String>();
	
	Scanner input = new Scanner(System.in);
	
	public void addCategories() {
		
		System.out.println("Specify the categories of "  + "\n");
		
		String flag;
		do {
			
			System.out.println("name of category:");
			String name = input.nextLine();
			categories.add(name);
			
			System.out.println("Continue adding categories? If yes press 1, if no press any key");
			flag = input.nextLine();
			/** input.nextLine(); **/
			
		} while (flag.equals("1"));
	}
	
	
	public void addFields() {
		String flag;
		int counter = 0;
		do {
			baseObjects.add(new Field());
		
			for (int i = 0; i < categories.size(); i++) {
				/** input.nextLine(); **/
				System.out.println("Give " + categories.get(i) + ":");
				/** input.nextLine(); **/
				String name = input.nextLine();
				baseObjects.get(counter).fields.add(name);
			}
			System.out.println("Continue adding fields? If yes press 1, if no press any key");
			flag = input.nextLine();
			counter++;
		} while (flag.equals("1"));
	}
	
	public void printBase() {
		System.out.println();
		for (int i = 0; i < baseObjects.size(); i++) {
			
			for (int j=0; j < baseObjects.get(i).fields.size(); j++) {
				
				System.out.print(baseObjects.get(i).fields.get(j) + " ");
			}
			System.out.println("\n");
			
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

