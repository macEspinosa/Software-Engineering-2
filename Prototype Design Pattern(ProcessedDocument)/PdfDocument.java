public class PdfDocument implements Document {
    private String type;
    private String fileName;
    private String author;
    private int pages;

    public PdfDocument(String fileName, String author, int pages) {
        this.type = "PDF";
        this.fileName = fileName;
        this.author = author;
        this.pages = pages;
        System.out.println("Creating a PDF Document prototype.");
    }

    @Override
    public PdfDocument clone() {
        return new PdfDocument(this.fileName, this.author, this.pages);
    }

    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pages + " pages)");
        System.out.println("Type: " + type + ", File: " + fileName + ", Author: " + author + ", Pages: " + pages);
        System.out.println();
    }
}