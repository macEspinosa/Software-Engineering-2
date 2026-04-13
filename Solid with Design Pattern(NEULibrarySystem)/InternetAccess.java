public class InternetAccess implements LibraryResource {
    private String accessPoint;
    private String accessCode;
    private int durationHours;
    
    public InternetAccess(String accessPoint, String accessCode, int durationHours) {
        this.accessPoint = accessPoint;
        this.accessCode = accessCode;
        this.durationHours = durationHours;
    }
    
    @Override
    public String getTitle() {
        return accessPoint + " (" + durationHours + " hours)";
    }
    
    @Override
    public String getResourceType() {
        return "InternetAccess";
    }
    
    public String getAccessCode() {
        return accessCode;
    }
}