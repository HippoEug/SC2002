public class ConversionMethod 
{
	public static void main(String[] args) 
	{
		String str1 = new String(String.valueOf(123));
		String str2 = new String(String.valueOf(1234.56));
		String str3 = new String(String.valueOf('A'));
		String str4 = new String(String.valueOf(true));

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}


