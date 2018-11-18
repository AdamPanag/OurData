import javax.swing.JOptionPane;

public class Mainly {

	public static void main(String[] args) {
		
		Table myTable = new Table();
		Base myBase = new Base();
		
		JOptionPane.showMessageDialog(null, "             ** Hello World **\n"
			 						+ "This application creates a data base.\n"	
			 						+ "                 Lets Begin !");	
	
		int ans;		
		
		do {			
				
		String answer = JOptionPane.showInputDialog("** Menu **" 
							   + "\n\n0. Terminate application"
							   + "\n1. Create a new data base. "
							   + "\n2. Add categories."
							   + "\n3. Edit categories's names."
							   + "\n4. Add fields in existing data base."
							   + "\n5. Delete fields."
							   + "\n6. Edit fields's names."
							   + "\n7. Print a data base."
							   + "\n8. Print all data base."
							   + "\n\nWhat do you want to do? Type the right number");
			
		 ans = Integer.parseInt(answer);
				
				if (ans == 1) {
					
					JOptionPane.showMessageDialog(null,"You have chosen "+ans,"the title",JOptionPane.PLAIN_MESSAGE);
					myTable.createNewData();

				} else if (ans == 2) {
					
					JOptionPane.showMessageDialog(null,"You have chosen "+ans,"the title",JOptionPane.PLAIN_MESSAGE);
				
					/** int pos = myTable.findBase(); **/
					myBase.addCategories();
			
				} else if (ans == 4) {
					
					JOptionPane.showMessageDialog(null,"You Have Chosen "+ans,"the title",JOptionPane.PLAIN_MESSAGE);
					myBase.addFields();
	
				} else if (ans == 7) {
						
					JOptionPane.showMessageDialog(null,"You Have Chosen "+ans,"the title",JOptionPane.PLAIN_MESSAGE);
					myBase.printBase();
				}
				
		} while (ans != 0);
		
		if (ans == 0 ) {
			
			JOptionPane.showMessageDialog(null,"See you next time!","the title",JOptionPane.PLAIN_MESSAGE);
			
		}	
	}
}	
