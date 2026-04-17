public class TextDocument implements Document {
    private String type;
    private String path;
    private String encoding;
    private int words;

    public TextDocument(String path, String encoding, int words) {
        this.type = "Text";
        this.path = path;
        this.encoding = encoding;
        this.words = words;
        System.out.println("Creating a Text Document prototype.");
    }

    @Override
    public TextDocument clone() {
        return new TextDocument(this.path, this.encoding, this.words);
    }

    public void open() {
        System.out.println("Opening Text Document: " + path + " with encoding: " + encoding + " (" + words + " words)");
        System.out.println("Type: " + type + ", Path: " + path + ", Encoding: " + encoding + ", Words: " + words);
        System.out.println();
    }
}