package stringsInterview;

//method to check if input String is Palindrome
// A String is said to be Palindrome if it’s value is same when reversed. For example “aba” is a Palindrome String.
//String class doesn’t provide any method to reverse the String but StringBuffer and StringBuilder class 
//has reverse method that we can use to check if String is palindrome or not.

public class Palindrome {
	
 public static boolean main (String args[]){
	 
	 String str = "This is Java world" ;
 	    
		if (str == null)
		
		return false;
		
	    StringBuilder strBuilder = new StringBuilder(str);
	    strBuilder.reverse();
	    return strBuilder.toString().equals(str);
	}
}