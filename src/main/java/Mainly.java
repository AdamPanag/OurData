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
							   + "\n1. Add categories."
							   + "\n2. Add fields."
							   + "\n3. Delete fields."
							   + "\n4. Edit fields."
							   + "\n5. Print the data base."							
							   + "\n\nWhat do you want to do? Type the right number");
			
			
			ans = Integer.parseInt(answer);
			
			switch (ans) {
			case 0:
				JOptionPane.showMessageDialog(null,"See You Next Time!");
				break;	
			case 1:
				myBase.addCategories();
				break;
			case 2:
				myBase.addFields();
				break;
			case 3:
				myBase.deleteFields();
				break;
			case 4:
				myBase.editFields();
				break;
			case 5:
				myBase.printBase();
				break;
			case 6:
				myBase.printBase();
				break;
			default:
				JOptionPane.showMessageDialog(null,"Please Try again");		
			}					
		} while (ans != 0);
		
	}
}	