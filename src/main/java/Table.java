import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class Table {
	
	static ArrayList <ArrayList<ArrayList<String>>> table = new ArrayList <ArrayList<ArrayList<String>>>();
	static ArrayList<String> nameOfBase = new ArrayList<String>();
	
	 Scanner input = new Scanner(System.in);
	
	
	
	public void createNewData() {
		
		String newDataBaseName = JOptionPane.showInputDialog("How would you like to name your new data base:");	
			
		nameOfBase.add(newDataBaseName);
		
		table.add(null);
		
	}
	
	public int findBase() {
		
		System.out.println("Type the name of the data base you want to edit:");
		String name = input.nextLine();
		
		int r = -1;
		
		for(int i=0; i < nameOfBase.size(); i++) {
			
			if (nameOfBase.get(i).equals(name)) {
				r = i;
			}
		}
		
		if (r == -1) {
			System.out.println("Wrong name");
			findBase();
		}
		return r;
	}
}
