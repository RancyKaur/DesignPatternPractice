package CommandPractcie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextAddition implements TextCommandInterface {

    String textToAdd;
    File fileToWrite;

    TextAddition(String text, File fileWrite)
    {
        this.textToAdd = text;
        this.fileToWrite = fileWrite;
    }
    @Override
    public boolean execute() {
        new TextEditMenu().AddTextinFile(this.textToAdd, this.fileToWrite);
        return true;
    }

}
