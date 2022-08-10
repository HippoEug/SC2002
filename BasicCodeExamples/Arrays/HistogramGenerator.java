import java.util.Scanner;
public class HistogramGenerator 
{
	public static void main(String[] args)
	{
		int[] empData = new int[10];
		inputData(empData);
		System.out.println();
		printData(empData);
	}
	public static void inputData(int[] array) 
	{	
		int i;
		Scanner sc = new Scanner(System.in);
	
		for (i = 0; i < array.length; i++)
		{
			System.out.print("Worker [" + (i+1) + "] hours: ");
			array[i] = sc.nextInt();
		}
	}
	public static void printData(int[] array)
	{
		int i,j;
		System.out.print("Emp No. \tHistogram");
		for(i = 0; i < array.length; i++)
		{
			System.out.print("\t \n   " + (i+1) +"\t\t");
			for(j = 0; j < array[i]; j++) {
				System.out.print('*');
			}
			System.out.print("("+ array[i] +")");
		}

	}
}	

