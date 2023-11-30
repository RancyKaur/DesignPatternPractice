public class DraftState implements DocState {


    @Override
    public void edit(Document doc, String newContent) {
        doc.setContent(newContent);
        System.out.println("Document is edited");
    }

    @Override
    public void publish(Document doc) {
        printError();
    }

    @Override
    public void archive(Document doc) {
        printError();
    }
}