import javax.swing.JOptionPane;



public class Mainly {
	public static void main(String[] args) {
		
		//epixeiro na ftiakso GUI
				
		Table myTable = new Table();
		Base myBase = new Base();
		
		 JOptionPane.showMessageDialog(null, "			** Hello World **		");
		 JOptionPane.showMessageDialog(null, "			This Application Ceates A DataBase		");				   
		 JOptionPane.showMessageDialog(null, "			Lets Begin !		");	
		
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
							   + "\n7. Print all data base."
							   + "\n\nWhat do you want to do? Type the right number");
			
		 ans = Integer.parseInt(answer);
				
					if (ans == 1) {
						
						JOptionPane.showMessageDialog(null,"You Have Chosen "+ans,"the title",JOptionPane.PLAIN_MESSAGE);
				
				
					myTable.createNewData();
				} else if (ans == 2) {
					
					JOptionPane.showMessageDialog(null,"You Have Chosen "+ans,"the title",JOptionPane.PLAIN_MESSAGE);
				
					/** int pos = myTable.findBase(); **/
					myBase.addCategories();
			
				} else if (ans == 3) {
					
					JOptionPane.showMessageDialog(null,"You Have Chosen "+ans,"the title",JOptionPane.PLAIN_MESSAGE);
				
				
					myBase.addFields();
				} else if (ans == 6) {
					
					
					JOptionPane.showMessageDialog(null,"You Have Chosen "+ans,"the title",JOptionPane.PLAIN_MESSAGE);
					myBase.printBase();
				}
				
		} while (ans != 0);
		
		if (ans == 0 ) {
			JOptionPane.showMessageDialog(null,"See You Next Time!","the title",JOptionPane.PLAIN_MESSAGE);
			
		}
				
				
				
	
}
}	
