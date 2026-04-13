public class Journal implements LibraryResource {
    private String title;
    private String issn;
    private int volume;
    
    public Journal(String title, String issn, int volume) {
        this.title = title;
        this.issn = issn;
        this.volume = volume;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public String getResourceType() {
        return "Journal";
    }
    
    public int getVolume() {
        return volume;
    }
}