package stringsInterview;

import java.util.Scanner;

public class FindDuplicateCharacters 
{
	
	public static void main(String[] args) 
{

		Scanner scan=new Scanner(System.in);
        
		System.out.println("Enter the string: ");
		String sentence  =   scan.next();
    
		System.out.println("Enter the character you want to search for: ");
		String size =  scan.next();
		
		char[] c= size.toCharArray();
		
		int  count=0;
		for(int i=0; i<=sentence.length()-1; i++)
		{
		for(int j=0; j<=c.length-1; j++)
        {
		if(sentence.charAt(i)==c[j])
   	   	{
    		   System.out.println("indexes where duplicate character are:" +i);
    		   count++;  
   	   }
       }
       }
   System.out.println("No.of duplicate characters:" +count);  
}
}


