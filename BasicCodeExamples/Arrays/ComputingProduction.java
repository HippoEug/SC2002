public class ComputingProduction 
{
	public static void main(String[] args)
	{
		int i,j;
		int worker = 0;
		int[][] production = new int[20][5];
		System.out.println("====== PRODUCTION COMPANY ======");
		readInput(production);
		printInput(production);
		System.out.println("Average production: " + computeAverage(production));
		worker = findTheBest(production);
		System.out.println("The most productive worker is: " + worker);
	}
	public static void readInput(int[][] prod) 
	{
		int i,j; 
		for (i=0; i<20; i++)
			for (j=0; j<5; j++)
				prod[i][j] = (int)(Math.random()*100);
	}
	public static void printInput(int[][] prod) 
	{
		int i,j; 
		for (i=0; i<20; i++)
		{
			System.out.print("\n");
			for (j=0; j<5; j++){
				System.out.print(prod[i][j] + " ");
			}
		}
		System.out.println();
	}
	public static double computeAverage(int[][] prod) 
	{
		int i,j;
		int total = 0;
		for (i=0; i<20; i++)
			for (j=0; j<5; j++)
				total += prod[i][j];
		return total/20.0;
	}
	public static int findTheBest(int[][] prod) 
	{
		int weekTotal[] = new int[20];
		int best=0;
		int i,j,highest;
		for (i=0; i<20; i++)
		{
			weekTotal[i] = 0;
			for (j=0; j<5; j++)
				weekTotal[i] += prod[i][j];
		}
		highest = -1;
		for (i =0; i<20; i++)
		{
			if (weekTotal[i] >= highest)
				highest = weekTotal[i] ;
		}
		for (j=0; j < 20; j++)
		{
			if (weekTotal[j] == highest) 
				best = j;
		}
		return best;
	}
}		

