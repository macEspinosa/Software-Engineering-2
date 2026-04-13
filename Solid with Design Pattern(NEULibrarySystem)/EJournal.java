public class EJournal implements LibraryResource {
    private String title;
    private String url;
    private String publisher;
    
    public EJournal(String title, String url, String publisher) {
        this.title = title;
        this.url = url;
        this.publisher = publisher;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public String getResourceType() {
        return "EJournal";
    }
    
    public String getUrl() {
        return url;
    }
}