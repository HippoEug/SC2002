public class ComparingStrings2 
{
	public static void main(String[] args)
	{


		System.out.println("1 " + "ABC".equals("XYZ"));
		System.out.println("2 " + "ABC".equals("abc"));
		System.out.println("3 " + "ABC".equals("ABC"));
		System.out.println("4 " + "ABC".equals("ABCD"));
		System.out.println();
		
		System.out.println("1 " + "ABC".compareTo("XYZ"));
		System.out.println("2 " + "ABC".compareTo("abc"));
		System.out.println("3 " + "ABC".compareTo("ABC"));
		System.out.println("4 " + "123".compareTo("abc"));
		System.out.println("5 " + "abcd".compareTo("abc"));
		System.out.println("6 " + "abc".compareTo("abcd"));		
	

	}
}


