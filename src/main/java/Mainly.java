import javax.swing.JOptionPane;

public class Mainly {

	public static void main(String[] args) {
		
		Table myTable = new Table();
		Base myBase = new Base();
		
		JOptionPane.showMessageDialog(null, "             ** Hello World **\n"
			 						+ "This Application Creates A DataBase\n"	
			 						+ "                 Lets Begin !");	
	
		int ans;		
		
		do {			
				
			String answer = JOptionPane.showInputDialog("** Menu **" 
							   + "\n\n0. Terminate Application"
							   + "\n1. Add Categories."
							   + "\n2. Add Fields."
							   + "\n3. Delete Fields."
							   + "\n4. Edit Fields."
							   + "\n5. Print The Data Base."							
							   + "\n\nWhat Would You Like To do? Type The Right Number");
			
			
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