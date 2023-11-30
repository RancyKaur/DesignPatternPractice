public class Main {
    public static void main(String[] args) {
        // Create a new document
        Document doc = new Document("Initial Content");

        System.out.println("Document state: " + doc.getState());

        // Edit the document
       doc.setContent("Updated Content");
       System.out.println("Document content after edit: " + doc.getContent());

        // Try to publish (should fail because it's not in Moderation state)
        doc.getState().publish(doc);

        // Change state to Moderation and try to publish again
        doc.changeState(new ModerationState());
        doc.getState().publish(doc);
        System.out.println("Document state after publishing: " + doc.getState());

        // Archive the document
        doc.getState().archive(doc);
        System.out.println("Document state after archiving: " + doc.getState());
    }
}
