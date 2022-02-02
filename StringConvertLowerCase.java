class StringConvertLowerCase
{
	public static void main(String[] args){

    String s = "JSPIDER";
	
	convertToLowerCase(s);

	System.out.println("Print Lower Case Strintg :" + convertToLowerCase(s));






	}

	  public static String convertToLowerCase(String s)
	{

		char[] ch = s.toCharArray();

		for(int i=0;i<ch.length;i++)
		{

			if(ch[i]>= 'A' && ch[i] <='Z')
			{

				ch[i] = (char) (ch[i] +32);

			}

		}

		return new String(ch);
}

}