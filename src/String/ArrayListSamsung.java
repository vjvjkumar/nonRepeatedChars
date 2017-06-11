package String;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSamsung {

	public static void main(String[] args) {
		
		// " Samsung Galaxy A3 (2016) "
		// add the above string individually into an array list 
		ArrayList<String> phonename = new ArrayList<String>();
		
		//ArrayList al = new ArrayList(phonename); // phonename is collection object
		
		phonename.add("Samsung");
		phonename.add("Galaxy");
		phonename.add("A3");
		phonename.add("(2016)");
		//phonename.addAll(phonename);
		
		// now remove required elements
		phonename.remove("Samsung");
		phonename.remove("Galaxy");
		phonename.remove("A3");
		
		// now let iterator travel through the arraylist to remove elements using iterator function
		Iterator<String> iterator = phonename.iterator();
		
		while (iterator.hasNext())
		{
			String element = iterator.next().toString(); // save the findings in string variable called "element" 
			System.out.println(element+ " ");
		}
		

	}

}
