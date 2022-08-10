public class CommandLineApp 
{
	public static void main(String[] args) 
	{
		int count;

		System.out.println("args.length = " + args.length);
		for (count = 0; count < args.length; count++)
			System.out.println("args " + count + " = " + args[count]); 
		System.out.println();
	}
}


