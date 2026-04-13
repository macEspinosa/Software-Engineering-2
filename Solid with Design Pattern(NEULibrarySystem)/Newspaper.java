import java.time.LocalDate;

public class Newspaper implements LibraryResource {
    private String title;
    private LocalDate date;
    private String edition;
    
    public Newspaper(String title, LocalDate date, String edition) {
        this.title = title;
        this.date = date;
        this.edition = edition;
    }
    
    @Override
    public String getTitle() {
        return title + " (" + date + ")";
    }
    
    @Override
    public String getResourceType() {
        return "Newspaper";
    }
    
    public LocalDate getDate() {
        return date;
    }
}