class CapIntString
{
	public static void main(String[] args)
	{
		String s = "hi guys how are you";

		System.out.println(initCap(s));

}


  public static String initCap(String s)
	{
	  char[] ch = s.toCharArray();

	  ch[0] = (char) (ch[0] - 32);

	  for(int i = 1; i<ch.length;i++)
		{
		  if(ch[i] == ' ' )
			{
			  ch[i+1] = (char) (ch[i+1] -32);

			}


	}

        return new String(ch);

	}
}


/*

CapInt -> Starting character is Upper letter and remaining letter is lower case


*/

