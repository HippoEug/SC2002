public class StringBufferConstructors
{
	public static void main(String[] args) 
	{
		StringBuffer strBuf1 = new StringBuffer();	
		StringBuffer strBuf2 = new StringBuffer(10);	
		StringBuffer strBuf3 = new StringBuffer("Java Programming");	

		System.out.println("strBuf1 = " + strBuf1.toString());
		System.out.println("strBuf2 = " + strBuf2.toString());
		System.out.println("strBuf3 = " + strBuf3.toString());
	}
}


