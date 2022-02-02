
 import java.util.Scanner;
class StringPalindrome
{
	public static void main(String[] args)

	{
		/*
		Scanner sc = new Scanner(System.in);

     String s = sc.next();
	 */
	  
	  String s = "madam";
	 
	   if(isPalindrome(s))
		   {

		   System.out.println(s +" " + "is palindrome");
}

    else{

		System.out.println(s + "  " + "is not a palindrome");


	}

	}


public static boolean isPalindrome(String s)
	{

	 char ch[] =  s.toCharArray(); //convert string to char array

	 for(int i=0;i<ch.length/2;i++)
		{

		 if(ch[i] !=ch[ch.length-1-i])
			{
			 return false;

			}

		}
		  return true;

	}

}