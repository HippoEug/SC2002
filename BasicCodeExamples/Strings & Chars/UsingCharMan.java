public class UsingCharMan 
{
	public static void main(String[] args)
	{
		int i;
		StringBuffer strBuf = new StringBuffer("School of Computer Engineering");	

		System.out.println("StrBuf = " + strBuf.toString());
		System.out.println("charAt(0) = " + strBuf.charAt(0) + "\ncharAt(7) = " + strBuf.charAt(7));
		strBuf.setCharAt(0,'G');
		strBuf.setCharAt(7,'q');
		System.out.println("After setCharAt(): strBuf = " + strBuf.toString());
		char[] charData = new char[strBuf.length()];
		strBuf.getChars(0, strBuf.length(), charData, 0);
		System.out.print("After getChars(): charData= ");
		for(i = 0; i < strBuf.length(); i++) 
		{
			System.out.print(charData[i]);
		}

		strBuf.reverse();
		System.out.println();
		System.out.println("After reverse(): strBuf = " + strBuf.toString());
	}
}


