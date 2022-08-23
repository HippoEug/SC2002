import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = new int[100];
		int n, i;
		
		System.out.println("Enter number of Integer elements to be sorted: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for (i=0; i<=(n-1); i++) {
			System.out.println("\nEnter integer value for element no." + i + " : ");
			a[i] = sc.nextInt();
		}
		
		bubble(a, n);
		
		System.out.println("\n\nFinally sorted array is: ");
		for (i=0; i<=(n-1); i++) {
			System.out.println(a[i] + " ");
		}
	}
	
	public static void bubble(int[] a, int n) { 
		int i, j, t;
		
		for (i=(n-2); i>=0; i--) {
			for (j=0; j<=i; j++) {
				if (a[j] > a[j+1]) {
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	}
}
