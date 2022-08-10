import java.util.Scanner;
public class TextEditor 
{
	private StringBuffer strBuf;
	Scanner sc = new Scanner(System.in);

	public void readTextString()
	{
		System.out.println("Enter a sentence for editing: ");
		String	content = sc.nextLine();
		strBuf = new StringBuffer(content);
	}
	public void displayTextString()
	{
		System.out.println(strBuf);
	}
	public void displayCommands() 
	{
		System.out.println("====== Text Editor ======");
		System.out.println("To DELETE a character/word ");
		System.out.println("To INSERT a word ");
		System.out.println("To REPLACE a character/word ");
		System.out.println("To REVERSE the sentence ");
		System.out.println("To CHANGE letter cases ");
		System.out.println("To DISPLAY the sentence ");
		System.out.println("To HELP ");
		System.out.println("To QUIT ");
	}
	public StringBuffer deleteChar() 
	{
		System.out.print("Enter index to delete a char: ");
		int index = sc.nextInt();
		strBuf.deleteCharAt(index);
		return strBuf;
	}
	public StringBuffer deleteWord() 
	{
		System.out.print("Enter start and end indexes: ");
		int startIndex = sc.nextInt();
		int endIndex = sc.nextInt();
		strBuf.delete(startIndex, endIndex);
		return strBuf;
	}
	public StringBuffer insertWord() 
	{
		System.out.print("Enter the word to insert: ");
		String newStr = sc.nextLine();
		System.out.print("At index: ");
		int index = sc.nextInt();
		strBuf.insert(index," "); 
		strBuf.insert(index + 1, newStr);
		return strBuf;
	}
	public StringBuffer replaceChar() 
	{
		int i;
		System.out.print("Enter the character to replace: ");
		String charString = sc.next();
		char oldChar = charString.charAt(0);
		System.out.print("Enter new character: ");
		charString = sc.next();
		char newChar = charString.charAt(0);
		for (i = 0; i < strBuf.length(); i++) 
			if (strBuf.charAt(i) == oldChar) 
				strBuf.setCharAt(i, newChar);
		return strBuf;
	}
	public StringBuffer replaceWord()
	{
		System.out.print("Enter the new word: ");
		String newWord = sc.next();
		System.out.print("Enter the start and end indexes: ");
		int startIndex = sc.nextInt();
		int endIndex = sc.nextInt();
		strBuf.replace(startIndex, endIndex, newWord);
		return strBuf;
	}
	public StringBuffer reverseData() 
	{
		strBuf.reverse();
		return strBuf;
	}
	public void upperAndLowerCase() 
	{
//		int i;
		char nextChar;
		for (int i = 0; i < strBuf.length(); i++)
		{
			nextChar = strBuf.charAt(i);
			if (Character.isUpperCase(nextChar))
				nextChar = Character.toLowerCase(nextChar);
			else if(Character.isLowerCase(nextChar))
				nextChar = Character.toUpperCase(nextChar);
			System.out.print(nextChar);
		}
		System.out.println();
	}

}					


