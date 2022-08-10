public class UsingAppendMethod 
{
	public static void main(String[] args)
	{
		int i = 1;
		char[] charData = {'S', 'C', '1', '0', '3'};
		Object o = "Java";
		String s = "Programming";
		char c = '$';
		double d = 25.99;
		StringBuffer strBuffer = new StringBuffer(32);	

		strBuffer.append(i); strBuffer.append(" ");
		strBuffer.append(charData); strBuffer.append("-");
		strBuffer.append(o); strBuffer.append(" ");
		strBuffer.append(s); strBuffer.append(" ");
		strBuffer.append(c); 
		strBuffer.append(d); 

		System.out.println(strBuffer.toString());
	}
}

