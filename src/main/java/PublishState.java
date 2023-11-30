public class PublishState implements DocState{

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
        doc.changeState(new ArchiveState());
        System.out.println("Document is now archived");
    }
}
