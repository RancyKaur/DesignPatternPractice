public class Document {
    private String content;
    private DocState state;

    public Document(String content) {
        this.content = content;
        this.state = new DraftState();
    }

    public void changeState(DocState ds) {
        this.state = ds;
    }

    public DocState getState()
    {
        return this.state;
    }

    public void setContent(String p_content)
    {
        this.content = p_content;
    }

    public String getContent()
    {
        return this.content;
    }
}

