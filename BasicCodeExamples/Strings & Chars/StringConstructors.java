public class StringConstructors 
{
	public static void main(String[] args)
	{
		char[] charData = {'S','C','1','0','3'};
		byte[] byteData = {(byte)'S', (byte)'t', (byte)'r', (byte)'i', (byte)'n', (byte)'g'};
		StringBuffer strBuffer = 
			new StringBuffer("Introduction to Programming");	
		
		String str1 = new String();	
		System.out.println("str1 = " + str1);
		String str2 = new String("Java Programming");
		System.out.println("str2 = " + str2);
		String str3 = new String(charData);	
		System.out.println("str3 = " + str3);
		String str4 = new String(charData, 2, 3);	
		System.out.println("str4 = " + str4);
		String str5 = new String(byteData);	
		System.out.println("str5 = " + str5);
		String str6 = new String(byteData, 2, 4);	
		System.out.println("str6 = " + str6);
		String str7 = new String(strBuffer);	
		System.out.println("str7 = " + str7);
	}
}


