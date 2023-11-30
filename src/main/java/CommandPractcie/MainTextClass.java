package CommandPractcie;

import java.util.Scanner;

public class MainTextClass
{
    public static void main(String[] args)
    {
        System.out.println("The Text Editor Class");
        Scanner inp = new Scanner(System.in);
        boolean loopvar= true;
        String newfile;

        while(loopvar) {
            System.out.println("Select 1 to Format text in the file, Select 2 for Toolbar and 3 to exit");
            int choice = Integer.parseInt(inp.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("You can format the file");
                    break;
                }
                case 2: {
                    System.out.println("Enter file name: ");
                    String fileName = inp.nextLine();
                    System.out.println("Enter text to enter2");
                    String text = inp.nextLine();
                    new ToolBar().addTextToFile(text, fileName);
                    break;
                }
                case 3:
                    loopvar = false;
                    break;
                default:
                    System.out.println("Wrong choice entered");
                    break;
            }
        }
    }
}
