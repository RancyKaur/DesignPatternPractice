public interface DocState {
    public void edit(Document doc, String newContent);
    public void publish(Document doc);
    public void archive(Document doc);
    public default void printError()
    {
        System.out.println("Invalid Method called, not suppored in current state");
    }
}
