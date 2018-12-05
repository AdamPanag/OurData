import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Categories {
	
	
	ArrayList<Base> baseCategories = new ArrayList<Base>();
	ArrayList<Base> baseIds = new ArrayList<Base>();
	
	public void editCategories(){   

		if (baseCategories.size() != 0) {
			
			String answer = JOptionPane.showInputDialog("Which category do you want to edit? Give the right umber");
			int pos = Integer.parseInt(answer) - 1;
			boolean exists = false;
			
			for (int i = 0; i < baseIds.ids.size(); i++) {
				if (baseIds.ids.get(i).equals(String.valueOf(pos + 1))) {
					exists = true;
				}				
			}		
			if (!exists) {
				
				JOptionPane.showMessageDialog(null, "This number does not exist.");			
				editCategories();	
				
			} else {
				boolean exists2 = false;
				int catPos = 0;
				String answer2;
				do {
					answer2 = JOptionPane.showInputDialog("Which category do you want to edit? "
		  													 + "Type it as you see it.\n" + categories);
					
					for (int i = 0; i < base.categories.size(); i++) {
						if(base.categories.get(i).equals(answer2)) {
							exists2 = true;
							catPos = i;
						}
					}
					if (!exists2)
						JOptionPane.showMessageDialog(null, "Wrong Input,"
														+ " Type The Name Of The Category As You See It.");
				} while (!exists2);
				
				String toEdit = JOptionPane.showInputDialog("Give " + categories.get(catPos) + ":");
				baseObjects.get(pos).fields.set(catPos, toEdit);
			}
		} else {
			JOptionPane.showMessageDialog(null, "You Must First Add A Field");
		}
		
	}
}