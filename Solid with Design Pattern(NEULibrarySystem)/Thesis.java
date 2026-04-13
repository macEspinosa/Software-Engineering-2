public class Thesis implements LibraryResource {
    private String title;
    private String author;
    private String university;
    
    public Thesis(String title, String author, String university) {
        this.title = title;
        this.author = author;
        this.university = university;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public String getResourceType() {
        return "Thesis";
    }
    
    public String getAuthor() {
        return author;
    }
}