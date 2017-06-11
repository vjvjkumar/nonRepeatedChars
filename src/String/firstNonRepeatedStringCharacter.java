package String;

import java.util.HashMap;
import java.util.Scanner;

public class firstNonRepeatedStringCharacter 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		String str = scan.nextLine();
		char c = getCharacter(str);
		System.out.println("First Character which is non repeating is: "+c);
		scan.close();
	}

	public static Character getCharacter(String str)
	{
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		int i;
		Character c;
				
		for (i=0; i<str.length(); i++) 
		{
			c=str.charAt(i);
			if (hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else
				hmap.put(c, 1);
		}
			
		for (i=0; i<str.length(); i++)
		{
			c=str.charAt(i);
			if (hmap.get(c)==1)
			{
				return c;
			}
		}
		return null;
		}
}

		
		
		
		
	

