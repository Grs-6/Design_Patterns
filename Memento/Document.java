public class Document {
    private String content;
    private History history;

    public Document(String content) {
        this.content = content;        
        this.history=new History();
    }

    public void write(String text) {
        this.content += text;
    }

    public void overwrite(String text) {
        this.content = text;
    }

    public String getContent() {
        return this.content;
    }

    public void save() {
        DocumentMemento memento=new DocumentMemento(this.content);        
        this.history.addMemento(memento);  

    }

    public void restore(int index) {
        DocumentMemento memento = this.history.getMemento(index);
        this.content = memento.getSavedContent();
    }
}
