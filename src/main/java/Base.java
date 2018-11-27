import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Base {
	
	ArrayList<Field> baseObjects = new ArrayList<Field>();
	ArrayList<String> ids = new ArrayList<String>();
	
	Scanner input = new Scanner(System.in);
	Categories myCat = new Categories();

	public void addCategories() {
		myCat.addCategories();
	}
	
	
	public void addFields() {
		
		if (myCat.getCategories().size() != 0) {
			int counter;
			String answer;
			
			do {
				baseObjects.add(new Field());
				counter = baseObjects.size() - 1;
				int t = counter + 1;
				ids.add(String.valueOf(t));
				
				for (int i = 0; i < myCat.getCategories().size(); i++) {
					
					String name = JOptionPane.showInputDialog("Give " + myCat.getCategories().get(i) + ":");									
					baseObjects.get(counter).fields.add(name);
				}	
				answer = JOptionPane.showInputDialog("Continue Adding Fields By Pressing The Number 1."
														+ " Leave By Pressing Any Other Key.");
							
			} while (answer.equals("1"));					
		
		} else {
			
			JOptionPane.showMessageDialog(null, "You Must First Difine At Least One Category.");
		}
	}
	
	// It doesn't work 100%
	public void editFields(){   
		
		if (baseObjects.size() != 0) {
			
			String answer = JOptionPane.showInputDialog("Which Field Do You Want To Edit? Give The Right Number");
			int pos = Integer.parseInt(answer) - 1;
			boolean exists = false;
			
			for (int i = 0; i < ids.size(); i++) {
				if (ids.get(i).equals(String.valueOf(pos + 1))) {
					exists = true;
				}				
			}		
			if (!exists) {
				
				JOptionPane.showMessageDialog(null, "This Number Does Not Exist.");			
				editFields();	
				
			} else {
				boolean exists2 = false;
				int catPos = 0;
				String answer2;
				do {
					answer2 = JOptionPane.showInputDialog("Which Category Do You Want To Edit? "
		  													 + "Type Tt As You See It.\n" + myCat.getCategories());
					
					for (int i = 0; i < myCat.getCategories().size(); i++) {
						if(myCat.getCategories().get(i).equals(answer2)) {
							exists2 = true;
							catPos = i;
						}
					}
					if (!exists2)
						JOptionPane.showMessageDialog(null, "Wrong Input,"
														+ " Type The Name Of The Category As You See It.");
				} while (!exists2);
				
				String toEdit = JOptionPane.showInputDialog("Give " + myCat.getCategories().get(catPos) + ":");
				baseObjects.get(pos).fields.set(catPos, toEdit);
			}
		} else {
			JOptionPane.showMessageDialog(null, "You Must First Add A Field");
		}
	}
		
	
	
	public void printBase() {
		int spaces;	
		int maxWord = findMaxWord();
		int maxId = findMaxIdLength();
		spacing(maxId);
		
		for (int i = 0; i < myCat.getCategories().size(); i++) {
			
			spaces = maxWord - myCat.getCategories().get(i).length();				
			System.out.print(myCat.getCategories().get(i));		
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
		
		for (int i = 0; i < myCat.getCategories().size(); i++) {
			
			if (myCat.getCategories().get(i).length() > max ) {
				
				max = myCat.getCategories().get(i).length();
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
		
		if (baseObjects.size() != 0) {
				
			String answer = JOptionPane.showInputDialog("Which Field Do You Want To Delete? Give The Right Number:");
			int pos = Integer.parseInt(answer) - 1;
			boolean exists = false;
		
			for (int i = 0; i < ids.size(); i++) {
				if (ids.get(i).equals(String.valueOf(pos + 1))) {
				exists = true;
				}				
			}
			if (!exists) {
				JOptionPane.showMessageDialog(null, "This Number Does Not Exist.");
			
				deleteFields();
			} else {
		
				baseObjects.remove(pos);
				ids.remove(pos);
		
				for (int i = 0; i < ids.size(); i++) {
					ids.set(i , String.valueOf(i + 1));
				}
			}
		
		} else {
			JOptionPane.showMessageDialog(null, "You Must First Add A Field");
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
