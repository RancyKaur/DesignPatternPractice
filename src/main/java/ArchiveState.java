public class ArchiveState implements DocState{
    @Override
    public void edit(Document doc, String newContent) {
        printError();
    }

    @Override
    public void publish(Document doc) {
        printError();
    }

    @Override
    public void archive(Document doc) {
        printError();
    }

    @Override
    public void printError()
    {
        System.out.println("Document already archived");
    }
}
