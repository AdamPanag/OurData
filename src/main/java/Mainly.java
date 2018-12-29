import javax.swing.JOptionPane;

public class Mainly {

	
	/*
	 * This is the menu for the data base.
	 */
	public static void main(String[] args) {

		Base myBase = new Base();

		JOptionPane.showMessageDialog(null, "             ** Hello World **\n" 
		                                  + "This application creates a DataBase\n"
									 	  + "                 Lets Begin !");

		int ans;

		do {

			String answer = JOptionPane.showInputDialog("** Menu **" 
			                                          + "\n\n0. Terminate Application"
					                                  + "\n1. Create a new table." 
					                                  + "\n2. Edit an existing table."
			                                          + "\n3. Print all tables"
			                                          + "\n\nWhat would you like to do? Type the right number");

			ans = Integer.parseInt(answer);

			switch (ans) {
			case 0:
				JOptionPane.showMessageDialog(null, "See you next time!");
				break;
			case 1:
				myBase.createNewTable();
				break;
			case 2:
				myBase.findTable();
				break;
			case 3:
				myBase.printAllTables();
			}
		} while (ans != 0);
	}
}
