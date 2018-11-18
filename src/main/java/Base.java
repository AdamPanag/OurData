import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Base {
	
	ArrayList<Field> baseObjects = new ArrayList<Field>();
	ArrayList<String> categories = new ArrayList<String>();
	ArrayList<String> ids = new ArrayList<String>();
	
	Scanner input = new Scanner(System.in);
	
	
	public void addCategories() {
	
		if (Table.nameOfBase.size() != 0 ) {
			
		String answer;
	
		do {
			
			String name = JOptionPane.showInputDialog(" Enter the Name of the category:");		
			categories.add(name);									
			answer = JOptionPane.showInputDialog( "Add category by pressing 1. Leave by pressing any other number.");
			
			} while (answer.equals("1"));
		}else {
			JOptionPane.showMessageDialog(null, "You must first create a data base.");
		}
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
				
				for (int i = 0; i < categories.size(); i++) {
					
					String name = JOptionPane.showInputDialog("Give " + categories.get(i) + ":");									
					baseObjects.get(counter).fields.add(name);
				}	
				answer = JOptionPane.showInputDialog("Continue adding fields by pressing 1. Leave by pressing any other number.");
							
			} while (answer.equals("1"));					
		
		} else {
			
			JOptionPane.showMessageDialog(null, "You must first difine at least one category.");
		}
	}
	
	/*public void editFields(){
		
		String answer = JOptionPane.showInputDialog("Which field do you want to edit ?");
		
		int len = baseObjects.size();
		
		for (int i=0; i<len; i++) {
			if (baseObjects.get(i).equals(answer)) {
				
				//String editfield = JOptionPane.showInputDialog("What to you want to replace "+baseObjects.get(i)+" with ?");
				 String editfield
	
				baseObjects.set(i, editfield);
				
			
			}else {
				JOptionPane.showMessageDialog(null," Error, can't find your Field");
			}						
			
		}			
		
	}*/
	
	public void printBase() {
		int spaces;	
		int maxWord = findMaxWord();
		int maxId = findMaxIdLength();
		spacing(maxId);
		
		for (int i = 0; i < categories.size(); i++) {
			
			spaces = maxWord - categories.get(i).length();				
			System.out.print(categories.get(i));		
			spacing(spaces);
		}
		
		System.out.println();
		
		for (int i = 0; i < baseObjects.size(); i++) {
						
			System.out.print(ids.get(i));			
			spaces = maxId - ids.get(i).length();			
			spacing(spaces);
			
			for (int j=0; j < baseObjects.get(i).fields.size(); j++) {
							
				System.out.print(baseObjects.get(i).fields.get(j));				
				spaces = maxWord - baseObjects.get(i).fields.get(j).length();				
				spacing(spaces);
			}
			System.out.println();
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
		return max;
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
