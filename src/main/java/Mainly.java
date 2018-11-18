import javax.swing.JOptionPane;

public class Mainly {

	public static void main(String[] args) {
		
		Table myTable = new Table();
		Base myBase = new Base();
		
		JOptionPane.showMessageDialog(null, "             ** Hello World **\n"
			 						+ "This application creates a data base\n"	
			 						+ "                 Lets Begin !");	
	
		int ans;		
		
		do {			
				
			String answer = JOptionPane.showInputDialog("** Menu **" 
							   + "\n\n0. Terminate application"
							   + "\n1. Create a new data base. "
							   + "\n2. Add categories."
							   + "\n3. Add fields in existing data base."
							   + "\n4. Delete fields."
							   + "\n5. Edit fields."
							   + "\n6. Print a data base."
							   + "\n7. Print all data bases."
							   + "\n\nWhat do you want to do? Type the right number");
			
			
			ans = Integer.parseInt(answer);
			
			switch (ans) {
			case 0:
				JOptionPane.showMessageDialog(null,"See You Next Time!");
				break;	
			case 1:
				myTable.createNewData();
				break;
			case 2:
				myBase.addCategories();
				break;
			case 3:
				myBase.addFields();
				break;
			case 4:
				myBase.deleteFields();
				break;
			case 5:
				break;
			case 6:
				myBase.printBase();
				break;
			case 7:
				break;
			default:
				JOptionPane.showMessageDialog(null,"Please Try again");		
			}					
		} while (ans != 0);
		
	}
}	
