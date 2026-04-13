import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<LibraryResource> borrowedResources;
    
    public Student(String name) {
        this.name = name;
        this.borrowedResources = new ArrayList<>();
    }
    
    // Single method that accepts ANY LibraryResource (DIP applied)
    public void borrow(LibraryResource resource) {
        borrowedResources.add(resource);
        System.out.println(name + " borrowed " + resource.getResourceType() + 
                           ": " + resource.getTitle());
    }
    
    public void showBorrowed() {
        if (borrowedResources.isEmpty()) {
            System.out.println(name + " has no borrowed resources.");
            return;
        }
        
        System.out.println("\n" + name + "'s borrowed resources:");
        for (int i = 0; i < borrowedResources.size(); i++) {
            LibraryResource r = borrowedResources.get(i);
            System.out.println("  " + (i+1) + ". " + r.getResourceType() + 
                               " - " + r.getTitle());
        }
        System.out.println("Total: " + borrowedResources.size() + " resources\n");
    }
    
    public String getName() {
        return name;
    }
}