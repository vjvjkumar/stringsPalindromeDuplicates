package stringsInterview;

import java.util.Scanner;

public class Scanner_RepeatedLetters_inString 
{
	public static void main(String[] args) 
{
	Scanner Scan1 = new Scanner (System.in);
		System.out.println("Enter a String: ");
		String sentence = Scan1.next();
	
	Scanner Scan2 = new Scanner (System.in);
		System.out.print("Enter a Letter: ");
		String letter = Scan1.next();
			
		int count = 0;
        
        for (int i = 0; i<sentence.length(); i++) 
        {
            if ((sentence.length()-i) >= letter.length()) 
            {
            String substring = sentence.substring(i, i+letter.length());
            if (letter.equalsIgnoreCase(substring)) 
            {
            count++;
            }
            }else{
            break;
            }
        }
        System.out.println("No.of repeated letters:" +count);
}
}


