public class VarLengthParameterList
{
	public static void main(String[] args) 
	{
		int max;

		max = maximum(1,2,3);
		System.out.println("The maximum value is " + max);
		max = maximum(1,3,5,43,9,11,15);
		System.out.println("The maximum value is " + max);
	}
	public static int maximum(int ... table) 
	{
		int i, temp=0;

		if (table.length != 0)
		{
			for (int num: table)
				if (num > temp)
					temp = num;

		}
		return temp;
	}
}

