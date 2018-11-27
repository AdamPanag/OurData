import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Categories {
	
	ArrayList<String> categories = new ArrayList<String>();

	
	public void addCategories() {
		
		String answer;
	
		do {
			
			String name = JOptionPane.showInputDialog(" Enter The Name Of The Category:");		
			categories.add(name);									
			answer = JOptionPane.showInputDialog( "Add Category By Pressing The Number 1."
												+ " Leave By Pressing Any Other Key.");
			
			} while (answer.equals("1"));
	}
	
	public ArrayList<String> getCategories() {
		return categories;
	}
}
