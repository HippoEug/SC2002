import java.util.Scanner;
public class ReturningArrays 
{
	public static void main(String[] args) 
	{
		int index, n;
		int[] numArray = new int[10];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 numbers: ");
		for (index = 0; index < 10; index++)
			numArray[index] = sc.nextInt();
		numArray = multiplyArray(numArray);
		System.out.println("The multiplied values are: ");
		for (index = 0; index < 10; index++)
			System.out.print(numArray[index] + " ");
	}
	public static int[] multiplyArray(int[] table) 
	{
		int i;
		int[] temp = new int[table.length];
		for (i = 0; i < temp.length; i++)
			temp[i] = table[i] * 5;
		return temp;
	}

}


