  // reverse string convert to char array

class ReverseString
{
	public static String reverse(String s)
	{

		String rev = " ";
		
		for(int i = s.length()-1;i>=0;i--) 
		{
			rev = rev + s.charAt(i);  //string to convert char array reverse finding
  
  }

 return rev;

}

public static void main(String[] args)
	{

	String s = "Hello";

	String rev = reverse(s);

	System.out.println("Original String =" +s);

	System.out.println("Reverse String =" + rev);

	}


}