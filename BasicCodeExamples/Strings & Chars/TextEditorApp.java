import java.util.Scanner;
public class TextEditorApp 
{
	public static void main(String[] args) 
	{
		TextEditor textEditor = new TextEditor();
		String command;
		int option = 0 ;
		Scanner sc = new Scanner(System.in);

		textEditor.readTextString();
		textEditor.displayCommands();
		do {
			System.out.print("Command> ");
			command = sc.next();
			if (command.equalsIgnoreCase("HELP"))
				textEditor.displayCommands();
			else if (command.equalsIgnoreCase("INSERT"))	
				System.out.println(textEditor.insertWord());
			else if (command.equalsIgnoreCase ("REPLACE"))
			{
				System.out.print("Enter 1 - to replace character " + "or 2 - to replace word: ");
				option = sc.nextInt();
				if (option == 1)
					System.out.println(textEditor.replaceChar());
				else if (option == 2)
					System.out.println(textEditor.replaceWord());
			}
			else if (command.equalsIgnoreCase("DELETE"))
			{
				System.out.print("Enter 1 - to delete char " +	"or 2 - to delete word: ");
				option = sc.nextInt();
				if (option == 1)	
					System.out.println(textEditor.deleteChar());
				else if (option == 2)	
					System.out.println(textEditor.deleteWord());
			}
			else if (command.equalsIgnoreCase("REVERSE"))
			{
				System.out.println("The reversed sentnce: ");
				System.out.println(textEditor.reverseData());
			}
			else if (command.equalsIgnoreCase("CHANGE"))
				textEditor.upperAndLowerCase();
			else if (command.equalsIgnoreCase("DISPLAY"))
				textEditor.displayTextString();
		} while (!command.equalsIgnoreCase("QUIT"));
		System.out.println("Thank You !!");
	}	
	
	
}				


