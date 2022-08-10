public class ComparingStrings 
{
	public static void main(String[] args)
	{
		String str1 = "hello";
		String str2 = "Hello";
		String str3 = "HELLO";
		
		System.out.println("String Comparison:");
		System.out.println("str1 = " + str1 + "\nstr2 = " + str2 + "\nstr3 = " + str3);

		System.out.println();
		
		System.out.println("str1.compareTo(str2)= " + str1.compareTo(str2));
		System.out.println("str2.compareTo(str1)= " + str2.compareTo(str1));
		System.out.println("str1.compareTo(str3)= " + str1.compareTo(str3));
		System.out.println("str2.compareTo(str3)= " + str2.compareTo(str3));
		System.out.println();
		
		System.out.println("str1.compareToIgnoreCase(str2) = " + str1.compareToIgnoreCase(str2));
		System.out.println("str1.compareToIgnoreCase(str3) = " + str1.compareToIgnoreCase(str3));
		System.out.println("str2.compareToIgnoreCase(str3) = " + str2.compareToIgnoreCase(str3));		
		System.out.println();
		
		if (str1.equals(str2))
			System.out.println("str1 equals str2");
		else
			System.out.println("str1 not equal str2");
		if (str1.equalsIgnoreCase(str2))
			System.out.println("str1 equalsIgnoreCase str2");
		else
			System.out.println("str1 !equalsIgnoreCase str2");
		

	}
}


