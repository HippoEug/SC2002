public class ComputeStatistics
{
	private static final int NUM_OF_STUDENTS = 10;
	public static void main(String[] args)
	{
		double average, percentPass, percentFail, mean; 
		double deviation;
		double[] marks = new double[10];
		int passes = 0, failures = 0, totalmark =0;
		
		generateMarks(marks);
		passes = computePasses(marks);
		failures = computeFailures(marks);

		percentPass = computePercentPass(NUM_OF_STUDENTS, passes);
		percentFail =computePercentFail(NUM_OF_STUDENTS, failures);
		mean = computeMean(marks);
		deviation = computeDeviation(marks);
		printData(passes,failures,percentPass,percentFail,mean, deviation);
	}
	public static double computePercentPass(int noStudents, int passes) 
	{
		return ((double)passes/noStudents) * 100;
	}
	public static double computePercentFail(int noStudents, int failures) 
	{
		return ((double)failures/noStudents) * 100;
	}
	public static void generateMarks(double[] inputMark)
	{	
		int i;
		for(i=0; i < NUM_OF_STUDENTS; i++)
			inputMark[i] = (int)(Math.random()*100);

	}
	public static int computeFailures(double[] mark) 
	{
		int i, failures=0;
		for(i = 0; i < 10; i++)
			if (mark[i] < 50)
				failures++;
		return failures;
	}
	public static int computePasses(double[] mark) 
	{
		int i, passes=0;
		for (i = 0; i < 10; i++)
			if (mark[i] > 50)
				passes++;
		return passes;
	}
	public static double computeDeviation(double[] mark) 
	{
		int i;
		double meanValue, squareSum =0;
		meanValue = computeMean(mark);
		for (i = 0; i < mark.length; i++)
			squareSum += Math.pow(mark[i]-meanValue, 2);
		return Math.sqrt((squareSum) / (mark.length - 1));
	}
	public static double computeMean(double[] mark) 
	{
		int i, sum = 0;
		for (i=0; i < mark.length; i++)
			sum += mark[i];
		return sum/mark.length;
	}
	public static void printData(int passes, int failures, double percentPass, double percentFail, double mean, double  deviation) 
	{
		System.out.println("===== STUDENT STATISTICS =====");
		System.out.println("The number of passes = " + passes);
		System.out.println("The number of failures = " + failures);
		System.out.println("The passing rate = " +  percentPass + "%");
		System.out.println("The failure rate = " +  percentFail + "%");
		System.out.println("The mean =  " + mean);
		System.out.println("The standard deviation = " + deviation);
	}
}					


