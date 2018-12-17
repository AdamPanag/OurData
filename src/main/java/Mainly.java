import javax.swing.JOptionPane;

public class Mainly {

	
	/*
	 * This is the menu for the data base.
	 */
	public static void main(String[] args) {

		Table myTable = new Table();

		JOptionPane.showMessageDialog(null, "             ** Hello World **\n" 
		                                  + "This application creates a DataBase\n"
									 	  + "                 Lets Begin !");

		int ans;

		do {

			String answer = JOptionPane.showInputDialog("** Menu **" + "\n\n0. Terminate Application"
					+ "\n1. Create a new data base." + "\n2. Edit an existing data base.");

			ans = Integer.parseInt(answer);

			switch (ans) {
			case 0:
				JOptionPane.showMessageDialog(null, "See you next time!");
				break;
			case 1:
				myTable.createNewData();
				break;
			case 2:
				myTable.findBase();
				break;
			}
		} while (ans != 0);
	}
}
