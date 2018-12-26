import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Base {

	ArrayList<Table> table = new ArrayList<Table>();
	ArrayList<String> nameOfTable = new ArrayList<String>();
	public static int tables = 0;

	Scanner input = new Scanner(System.in);
		
	/*
	 * Creates a new Table and calls tableMenu(int r) for this table.
	 */
	public void createNewTable() {

		String newTableName = JOptionPane.showInputDialog("How would you like to name your new table:");
		nameOfTable.add(newTableName);

		table.add(new Table());
		tableMenu(tables);
		tables++;
	}
	
	
	/*
	 * Finds the table that the user gave and calls tableMenu(int r) for this table.
	 */
	public void findTable() {

		if (nameOfTable.size() != 0) {

			String name = JOptionPane.showInputDialog("These are the existing data bases " + nameOfTable
				                                	+ "\nType the name of the data base you want to edit:");

			int r = -1;

			for (int i = 0; i < nameOfTable.size(); i++) {

				if (nameOfTable.get(i).equals(name)) {
					r = i;
				}
			}

			if (r == -1) {
				JOptionPane.showMessageDialog(null, "Wrong name!");
				findTable();
			}
			tableMenu(r);
		} else {
			JOptionPane.showMessageDialog(null, "You have 0 data bases, create one first.");
		}
	}

	
	/*
	 * This is the menu for each table.
	 */
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
				table.get(r).printTable();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Please Try again");
			}
		} while (ans != 0);
	}	
}
