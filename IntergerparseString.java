
/* Integer.parseInt("123")

string to Integer 

"123"     123 (output)



*/


class IntergerparseString
{
   
   public static void main(String[] args)
	{

       String s = "123";

	   System.out.println("Convert parse string to int :" +  convertToInt(s));

}



    public static int convertToInt(String s)
	{

		int num=0;

		for(int i=0;i<s.length();i++)
		{
			num = num * 10 + s.charAt(i) - 48; // so firstly string to convert to character array


		}

		return num;

	}

}