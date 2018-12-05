import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Table {
	
	ArrayList<Base> table = new ArrayList<Base>();
	ArrayList<String> nameOfBase = new ArrayList<String>();
	public static int bases = 0;
	
	Scanner input = new Scanner(System.in);
	Base myBase = new Base();
	
	public void tableMenu(int r) {
		int ans; 
		
		do {			
				
			String answer = JOptionPane.showInputDialog("** Menu **" 
							   + "\n\n0. Go back"
							   + "\n1. Add Categories."
							   + "\n2. Add Fields."
							   + "\n3. Delete Fields."
							   + "\n4. Edit Fields."
							   + "\n5. Edit Categories."
							   + "\n6. Print the Data Base."							
							   + "\n\nWhat Would You Like To do? Type The Right Number");
			
			
			ans = Integer.parseInt(answer);
			
			switch (ans) {
			case 0:
				break;	
			case 1:
				table.get(r).addCategories();
				break;
			case 2:
				table.get(r).addFields();
				break;
			case 3:
				table.get(r).deleteFields();
				break;
			case 4:
				table.get(r).editFields();
				break;
			case 5:
				table.get(r).editCategories();
				break;
			case 6:				
				table.get(r).printBase();
				break;
			default:
				JOptionPane.showMessageDialog(null,"Please Try again");		
			}					
		} while (ans != 0);
	}
	
	
	public void createNewData() {
		
		String newDataBaseName = JOptionPane.showInputDialog("How would you like to name your new data base:");				
		nameOfBase.add(newDataBaseName);
		
		table.add(new Base());
		tableMenu(bases);
		bases++;
	}
	
	public void findBase() {
		
		if (nameOfBase.size() != 0) {
			
			String name = JOptionPane.showInputDialog("These are the existing data bases " + nameOfBase 
													+ "\nType the name of the data base you want to edit:");
			
			int r = -1;
			
			for(int i=0; i < nameOfBase.size(); i++) {
				
				if (nameOfBase.get(i).equals(name)) {
					r = i;
				}
			}
			
			if (r == -1) {
				JOptionPane.showMessageDialog(null, "Wrong name!");
				findBase();
			}
			tableMenu(r);
		} else {
			JOptionPane.showMessageDialog(null, "You have 0 data bases, create one first.");
		}
	}
}
