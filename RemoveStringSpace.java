class RemoveStringSpace
{
   
   public static void main(String[] args)
	{
	   String s = "hello gys how are you";

	   System.out.println("Before Remove space" + " " + s);
	   System.out.println("After Remove space" + " " + removeEmptySpace(s));

}

  public static String removeEmptySpace(String s)
	{
	  String str = " ";

	  for(int i=0; i< s.length();i++)
		{
		  if(s.charAt(i) !=' ')
			{
			  str = str + s.charAt(i);
			}

	
		}
		 return str;
	

	}

	
}