package CommandPractcie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditMenu {
    FileWriter textFileWriter;
            //fr.write(data);

    public void AddTextinFile(String text, File sourceFile)
    {
        try {
            textFileWriter = new FileWriter(sourceFile);
            textFileWriter.write(text);
            textFileWriter.close();

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void DeleteTextFromFile(String text, File sourceFile)
    {
        try {
            textFileWriter = new FileWriter(sourceFile);
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void CopyTextFromFile(String text, File sourceFile, File targetFile)
    {
        try {
            textFileWriter = new FileWriter(sourceFile);
        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
