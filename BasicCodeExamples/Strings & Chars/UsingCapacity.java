public class UsingCapacity 
{
	public static void main(String[] args) 
	{
		StringBuffer strBuf = new StringBuffer("School of Computer Engineering");	

		System.out.println("StrBuf = " + strBuf.toString() + "\nLength = " + strBuf.length() + "\nCapacity = " + strBuf.capacity());
		strBuf.setLength(18); 
		System.out.println("StrBuf = " + strBuf.toString() + "\nLength = " + strBuf.length() + "\nCapacity = " + strBuf.capacity());
	}
}

