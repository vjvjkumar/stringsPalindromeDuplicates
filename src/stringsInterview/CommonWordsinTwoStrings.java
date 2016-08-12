package stringsInterview;
//find the common words

public class CommonWordsinTwoStrings {
	
  
	public static void main(String[] args) {
		
		String str1="Selenium";
		String str2="cucumberSelenium";
	
		for(int i=0;i<=str1.length()-1;i++)
		{
			if(str1.charAt(i)==str2.charAt(i)){
		}	else{
			
		    System.out.println(str1.length());
			System.out.println();
			System.out.println("above text match");
			
			break;
			}
	}
}
}
