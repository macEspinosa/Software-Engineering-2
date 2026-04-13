public class Capstone implements LibraryResource {
    private String title;
    private String studentName;
    private String year;
    
    public Capstone(String title, String studentName, String year) {
        this.title = title;
        this.studentName = studentName;
        this.year = year;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public String getResourceType() {
        return "Capstone";
    }
    
    public String getStudentName() {
        return studentName;
    }
}