import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Table {

	ArrayList<Field> fieldObjects = new ArrayList<Field>();
	ArrayList<String> categories = new ArrayList<String>();
	ArrayList<String> ids = new ArrayList<String>();
	
	Scanner input = new Scanner(System.in);

	public void addCategories() {

		String answer;

		do {

			String name = JOptionPane.showInputDialog(" Enter the name of the category:");
			categories.add(name);
			answer = JOptionPane
					.showInputDialog("Add category by pressing the number 1." + " Leave by pressing any other key.");

		} while (answer.equals("1"));
	}

	
	public void addFields() {

		if (categories.size() == 0) {
			JOptionPane.showMessageDialog(null, "You must first difine at least one category.");
		} else {

			int counter;
			String answer;

			do {
				fieldObjects.add(new Field());
				counter = fieldObjects.size() - 1;
				int t = counter + 1;
				ids.add(String.valueOf(t));

				for (int i = 0; i < categories.size(); i++) {

					String name = JOptionPane.showInputDialog("Give " + categories.get(i) + ":");
					fieldObjects.get(counter).fields.add(name);
				}
				answer = JOptionPane.showInputDialog(
						"Continue adding fields by pressing the number 1." + " Leave by pressing any other key.");

			} while (answer.equals("1"));

		}
	}

	
	public void editFields() {
		setSpaceValue(categories.size(), fieldObjects.size());
		
		if (fieldObjects.size() == 0) {
			JOptionPane.showMessageDialog(null, "You must first add a field");
		} else {

			String answer = JOptionPane.showInputDialog("Which field do you want to edit? Give the right number");
			int pos = Integer.parseInt(answer) - 1;
			
			if (!idExists(pos)) {

				JOptionPane.showMessageDialog(null, "This number does not exist.");
				editFields();

			} else {
				boolean exists2 = false;
				int catPos = 0;
				String answer2;
				do {
					answer2 = JOptionPane.showInputDialog(
							"Which category do you want to edit? " + "Type it as you see it.\n" + categories);

					for (int i = 0; i < categories.size(); i++) {
						if (categories.get(i).equals(answer2)) {
							exists2 = true;
							catPos = i;
						}
					}
					if (!exists2)
						JOptionPane.showMessageDialog(null,
								"Wrong input." + " Type the name of the category as you see it.");
				} while (!exists2);

				String toEdit = JOptionPane.showInputDialog("Give " + categories.get(catPos) + ":");
				fieldObjects.get(pos).fields.set(catPos, toEdit);
			}
		}
	}

	
	public void editCategories() {

		if (categories.size() == 0) {
			JOptionPane.showMessageDialog(null, "You must first add a category");
		} else {

			boolean exists = false;
			int catPos = 0;
			String answer;

			do {
				answer = JOptionPane.showInputDialog(
						"Which category do you want to edit? " + "Type it as you see it.\n" + categories);

				for (int i = 0; i < categories.size(); i++) {
					if (categories.get(i).equals(answer)) {
						exists = true;
						catPos = i;
					}
				}
				if (!exists)
					JOptionPane.showMessageDialog(null,
							"Wrong input." + " Type the name of the category as you see it.");
			} while (!exists);

			String toEdit = JOptionPane.showInputDialog("Give new designation");
			categories.set(catPos, toEdit);
		}

	}
	
	
	/*
	 * Sets " " as value at every field in a array which has no value.
	 */
	public void setSpaceValue(int catNum, int lineNum) {
		
		for (int i=0; i < lineNum; i++) {
			
			int s1 = fieldObjects.get(i).fields.size();
			int s2 = categories.size();
			int dif;
			if (s1 != s2)  {
				dif = s2 - s1;
				
				for (int k = 0; k < dif; k++) {
					fieldObjects.get(i).fields.add("(not difined)");
				}
			}
		}
	}
	

	public void printTable() {
		int spaces;
		int maxWord = findMaxWord();
		int maxId = findMaxIdLength();
		spacing(maxId);

		for (int i = 0; i < categories.size(); i++) {

			spaces = maxWord - categories.get(i).length();
			System.out.print(categories.get(i));
			spacing(spaces);
		}

		System.out.println();

		for (int i = 0; i < fieldObjects.size(); i++) {

			System.out.print(ids.get(i));
			spaces = maxId - ids.get(i).length();
			spacing(spaces);

			for (int j = 0; j < fieldObjects.get(i).fields.size(); j++) {

				System.out.print(fieldObjects.get(i).fields.get(j));
				spaces = maxWord - fieldObjects.get(i).fields.get(j).length();
				spacing(spaces);
			}
			System.out.println();
		}
	}

	/*
	 * Adds spaces on the same line.
	 */
	public void spacing(int spaces) {
		for (int i = 0; i < spaces + 1; i++) {
			System.out.print(" ");
		}
	}

	
	public int findMaxWord() {
		int max = 0;

		for (int i = 0; i < categories.size(); i++) {

			if (categories.get(i).length() > max) {

				max = categories.get(i).length();
			}
		}

		for (int i = 0; i < fieldObjects.size(); i++) {

			for (int j = 0; j < fieldObjects.get(i).fields.size(); j++) {

				if (fieldObjects.get(i).fields.get(j).length() > max) {
					max = fieldObjects.get(i).fields.get(j).length();
				}
			}
		}
		return max;
	}

	
	public int findMaxIdLength() {
		int max = 0;

		for (int i = 0; i < ids.size(); i++) {
			if (ids.get(i).length() > max) {
				max = ids.get(i).length();
			}
		}
		return max;
	}

	
	public void deleteFields() {

		if (fieldObjects.size() == 0) {
			JOptionPane.showMessageDialog(null, "You must first add a field");
		} else {

			String answer = JOptionPane.showInputDialog("Which field do you want to delete? Give the right number:");
			int pos = Integer.parseInt(answer) - 1;
									
			if (!idExists(pos)) {
				JOptionPane.showMessageDialog(null, "This number does not exist.");

				deleteFields();
			} else {

				fieldObjects.remove(pos);
				ids.remove(pos);

				for (int i = 0; i < ids.size(); i++) {
					ids.set(i, String.valueOf(i + 1));
				}
			}

		}
	}
	
	public boolean idExists(int pos) {
		boolean exists = false;
		for (int i = 0; i < ids.size(); i++) {
			if (ids.get(i).equals(String.valueOf(pos + 1))) {
				exists = true;
			}
		}
		return exists;
	}
}