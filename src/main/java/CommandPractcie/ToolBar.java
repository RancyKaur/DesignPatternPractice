package CommandPractcie;

import java.io.File;
import java.util.ArrayList;

public class ToolBar
{
    File sourceFile;
    public void addTextToFile(String text, String fileName)
    {
        String path = "src/main/resources/" + fileName;
        this.sourceFile = new File(path);
        boolean operationStatus = new TextAddition(text,this.sourceFile).execute();
        if(operationStatus)
            System.out.println("Congrats the text is added to given file");
        else
            System.out.println("Unfortunately operation failed");
    }
}
