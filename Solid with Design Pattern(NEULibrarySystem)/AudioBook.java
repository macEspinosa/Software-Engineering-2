public class AudioBook implements LibraryResource {
    private String title;
    private String narrator;
    private int durationMinutes;
    
    public AudioBook(String title, String narrator, int durationMinutes) {
        this.title = title;
        this.narrator = narrator;
        this.durationMinutes = durationMinutes;
    }
    
    @Override
    public String getTitle() {
        return title + " (Narrated by " + narrator + ")";
    }
    
    @Override
    public String getResourceType() {
        return "AudioBook";
    }
    
    public int getDurationMinutes() {
        return durationMinutes;
    }
}