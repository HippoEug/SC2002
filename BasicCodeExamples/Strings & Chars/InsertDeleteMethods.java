public class InsertDeleteMethods 
{
	public static void main(String[] args)
	{
		int i = 1;
		char[] charData = {'S','C','1','0','3'};
		Object o = "Java";
		String s = "Programming";
		char c = '$';
		double d = 25.99;
		StringBuffer strBuffer = new StringBuffer(32);	

		strBuffer.insert(0,d); 
		strBuffer.insert(0,c); strBuffer.insert(0," ");
		strBuffer.insert(0,s); strBuffer.insert(0," ");
		strBuffer.insert(0,o); 
		strBuffer.insert(0,"-"); strBuffer.insert(0,charData); 
		strBuffer.insert(0," "); strBuffer.insert(0,i); 
		System.out.println(strBuffer.toString());

		strBuffer.deleteCharAt(3); 
		strBuffer.delete(12,24); 
		System.out.println(strBuffer.toString());
	}
}


