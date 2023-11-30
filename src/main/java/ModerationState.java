public class ModerationState implements DocState {
    @Override
    public void edit(Document doc, String newContent) {
        doc.setContent(newContent);
        System.out.println("Document is edited");
    }

    @Override
    public void publish(Document doc) {
        doc.changeState(new PublishState());
        System.out.println("Document is now published");
    }

    @Override
    public void archive(Document doc) {
        printError();
    }

}
