package com.edx.week5;

public class StringPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Mam";
		String str2=reverseString(str);
		if(str.equalsIgnoreCase(str2))
			System.out.println("True");
		else
		System.out.println("False");
		
		isPalindrome(str);
	}
	
	public static String reverseString(String inputStr){
		  
        String revStr= "";
	
        for(int i=0; i < inputStr.length( ); i++) {
                revStr= inputStr.charAt(i) + revStr;
                /*
                 * This will work like wen i=0 revstr=M
                 * i=1 then inputStr.charAt(i) will have 'a' and revstr ='M' so the value of inputStr.charAt(i)
                 * will be appended in revstr which contain M.
                 * Therefore, now revstr will contain 'aM'
                 */
                
                 
        }

        return revStr;
}
	
	public static boolean isPalindrome(String str)
	{
		
		if(str=="mam")
			System.out.println("Helo");
		else 
			System.out.println("2");
		if(reverseString(str).equalsIgnoreCase(str))
		return true;
		
		else
			return false;
		
		
	}

}
