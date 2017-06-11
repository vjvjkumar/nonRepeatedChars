package String;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeated {
	
 
	    public static void main(String[] args)
	    {	          
	        System.out.println(" Please enter the input string :" );
	        
	        Scanner scan = new Scanner (System.in);
	        String str = scan.nextLine();
	        
	        char ch = firstNonRepeatedCharacter(str);
	        System.out.println("The first non repeated character is :  " + ch);
	    }
	    
	    public static Character firstNonRepeatedCharacter(String str){
	    	
	        HashMap<Character,Integer>  hMap = new HashMap<Character ,Integer>();
	        
	        int i;
	        int length;
	        Character ch ;
	        
	        length= str.length();  // Scan string and build hash table
	        
	        for (i=0; i<length; i++)
	        	{
	            ch = str.charAt(i);
	            if(hMap.containsKey(ch))
	            {
	                // increment count corresponding to ch
	                hMap.put( ch ,  hMap.get(ch) +1 );
	            }
	            else
	            {
	                hMap.put(ch, 1);
	            }
	        }
	        // Search hashmap in order of string str
	        
	        for (i =0; i<length; i++ )
	        {
	            ch= str.charAt(i);
	            if( hMap.get(ch)  == 1 )
	            return ch;
	        }
	        return null ;
	    }
	} 


