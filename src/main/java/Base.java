import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Base {
	
	ArrayList<Field> baseObjects = new ArrayList<Field>();
	ArrayList<String> categories = new ArrayList<String>();
	ArrayList<String> ids = new ArrayList<String>();
	
	Scanner input = new Scanner(System.in);
	
	public void addCategories() {
		
		String answer;
	
		do {
			
<<<<<<< HEAD
			System.out.println("Enter the Name of the category:");
			String name = input.nextLine();
			categories.add(name); // Adding categories
=======
			String name = JOptionPane.showInputDialog("  Enter the Name of the category:");
>>>>>>> 0be074f8d4d6216d7195f6fd65957e7e45bcf976
			
			categories.add(name);						
			
			answer = JOptionPane.showInputDialog( "Add category by pressing 1. Leave by pressing any other number.");
			
			} while (answer.equals("1"));
		}
	
	
	
	public void addFields() {
		
		if (categories.size() != 0) {
			int counter;
			String answer;
			
			do {
				baseObjects.add(new Field());
				counter = baseObjects.size() - 1;
				int t = counter + 1;
				ids.add(String.valueOf(t));
				
<<<<<<< HEAD
				System.out.println("Give " + categories.get(i) + ":");
				String name = input.nextLine();
				baseObjects.get(counter).fields.add(name); // Adding fields in each category
			}

			System.out.println("Continue adding fields by pressing 1. Leave by pressing any key.");
			flag = input.nextLine();
			System.out.println();
			counter++;
=======
				for (int i = 0; i < categories.size(); i++) {
					
					String name = JOptionPane.showInputDialog("Give " + categories.get(i) + ":");
									
					baseObjects.get(counter).fields.add(name);
				}	
				answer = JOptionPane.showInputDialog("Continue adding fields by pressing 1. Leave by pressing any other number.");
							
			} while (answer.equals("1"));					
		
		} else {
>>>>>>> 0be074f8d4d6216d7195f6fd65957e7e45bcf976
			
			JOptionPane.showMessageDialog(null, "You must first difine at least one category.");
		}
	}
	
	
	public void printBase() {
		int spaces;	
		int maxWord = findMaxWord();
		int maxId = findMaxIdLength();
		spacing(maxId);
		
		for (int i = 0; i < categories.size(); i++) {
			
			spaces = maxWord - categories.get(i).length();				
			JOptionPane.showInputDialog(categories.get(i));			
			spacing(spaces);
		}
		
		System.out.println();
		
		for (int i = 0; i < baseObjects.size(); i++) {
			
			
			JOptionPane.showInputDialog(ids.get(i));
			
			spaces = maxId - ids.get(i).length();
			
			spacing(spaces);
			
			for (int j=0; j < baseObjects.get(i).fields.size(); j++) {
							
				JOptionPane.showInputDialog(baseObjects.get(i).fields.get(j));
				
				spaces = maxWord - baseObjects.get(i).fields.get(j).length();
				
				spacing(spaces);
			}
			//System.out.println();
		}
	}
	
	public void spacing (int spaces) {
		for (int i = 0; i < spaces + 1; i++) {
			System.out.print(" ");
		}
	}
	
	
	public int findMaxWord() {
		int max = 0;
		
		for (int i = 0; i < categories.size(); i++) {
			
			if (categories.get(i).length() > max ) {
				
				max = categories.get(i).length();
			}			
		}
		
		for (int i = 0; i < baseObjects.size(); i++) {
			
			for (int j=0; j < baseObjects.get(i).fields.size(); j++) {
				
				if (baseObjects.get(i).fields.get(j).length() > max) {
					max = baseObjects.get(i).fields.get(j).length();
				}
			}
		}
		return max;		
	} 
	
	public int findMaxIdLength() {
		int max = 0;
		
		for (int i = 0; i < ids.size(); i++) {
			if (ids.get(i).length() > max) {
				max = ids.get(i).length();
			}
		}
<<<<<<< HEAD
				

=======
		return max;
>>>>>>> 0be074f8d4d6216d7195f6fd65957e7e45bcf976
	}
	
	
	public void deleteFields() {
		
		String answer = JOptionPane.showInputDialog("Which field do you want to delete? Give the right number:");
		int pos = Integer.parseInt(answer) - 1;
		boolean exists = false;
		
		for (int i = 0; i < ids.size(); i++) {
			if (ids.get(i).equals(String.valueOf(pos + 1))) {
				exists = true;
			}				
		}
		if (!exists) {
			JOptionPane.showMessageDialog(null, "This number does not exist.");
			
			deleteFields();
		} else {
		
			baseObjects.remove(pos);
			ids.remove(pos);
		
			for (int i = 0; i < ids.size(); i++) {
			ids.set(i , String.valueOf(i + 1));
			}
		}
	}
}
	
	
	/** public int handleException (String name , String answer) {
		int flag;
		try {	
			
			flag = Integer.parseInt(answer);
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null,"Oops, You did not type in a number");
			answer = JOptionPane.showInputDialog( "Add " + name + "by pressing 1. Leave by pressing any key.");
			flag = Integer.parseInt(answer);
		}
		return flag;
	}
}
	
	
 	static ArrayList<String> categories = new ArrayList<String>();
	
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


