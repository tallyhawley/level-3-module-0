package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add(":)");
		array.add("death");
		array.add("i: want to die");
		array.add("!!!!");
		array.add("support star wars ep. VIII in theaters december 2017");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0;i< array.size();i++) {
			System.out.println(array.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for(String i : array) {
			System.out.println(i);
		}
		//5. Print only the even numbered elements in the list.
		for(int i=0;i<array.size(); i++) {
			if(i%2==0) {
				System.out.println(array.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i = array.size() - 1;i>=0;i--) {
			System.out.println(array.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=0;i<array.size();i++) {
			if(array.get(i).contains("e")) {
				System.out.println(array.get(i));
			}
		}
	}
}
