package stringsInterview;

public class RepeatedLetters_inString 
{
	public static void main(String[] args) 
{
		String sentence = "I want to become strong in subject and reach my goals";
        String letter = "s";

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
        System.out.println("No.of duplicate characters:" +count);
}
}


