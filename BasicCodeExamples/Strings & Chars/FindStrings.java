public class FindStrings 
{
	public static void main(String[] args) 
	{
		String str = "Introduction to Java Programming";
		
		System.out.println("str = " + str);
		System.out.println("str.indexOf('t') location = " + str.indexOf('t'));
		System.out.println("str.indexOf('t', 10) location = " + str.indexOf('t', 10));
		System.out.println("str.indexOf(ro) location = " + str.indexOf("ro"));
		System.out.println("str.indexOf(ro, 20) location = " + str.indexOf("ro", 20));
		System.out.println(" ");
		System.out.println("str.lastIndexOf('t') location = " + str.lastIndexOf('t'));
		System.out.println("str.lastIndexOf('t') location = " + str.lastIndexOf('t', 10));
		System.out.println("str.lastIndexOf(ro) location = " + str.lastIndexOf("ro"));
		System.out.println("str.lastIndexOf(ro,30) location = " + str.lastIndexOf("ro", 30));
	}
}


