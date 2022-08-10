import java.util.StringTokenizer;
public class StringTokenizerApp {
	public static void main(String[] args) {
		StringTokenizer str1 = new StringTokenizer("This is SC103 course on Java programming.");	
		System.out.println("countTokens() = " + str1.countTokens());
		while (str1.hasMoreTokens())
			System.out.println(str1.nextToken());

		StringTokenizer str2 = new StringTokenizer(
				"http://www.ntu.edu.sg/sce/asschui.html", ":/");	
		System.out.println("countTokens() = " + str2.countTokens());
		while (str2.hasMoreTokens())
			System.out.println(str2.nextToken());
	}
}


