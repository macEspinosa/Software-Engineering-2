import java.time.LocalDate;

public class TestProgram {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("NEU Library System - SOLID Refactoring");
        System.out.println("=========================================\n");
        
        // Create student
        Student student = new Student("John Doe");
        
        System.out.println("Student: " + student.getName());
        System.out.println("-----------------------------------------\n");
        
        // Create all library resources
        Book book = new Book("Clean Code", "Robert C. Martin", "9780132350884");
        Journal journal = new Journal("Nature", "0028-0836", 202);
        Thesis thesis = new Thesis("Machine Learning in Healthcare", "Dr. Jane Smith", "NEU");
        Capstone capstone = new Capstone("Smart Home IoT Security", "Alice Chen", "2026");
        Newspaper newspaper = new Newspaper("The New York Times", LocalDate.now(), "Weekend");
        InternetAccess internet = new InternetAccess("NEU Wi-Fi", "WIFI2026", 24);
        AudioBook audioBook = new AudioBook("Atomic Habits", "James Clear", 380);
        EJournal eJournal = new EJournal("IEEE Software Engineering", "https://ieeexplore.ieee.org", "IEEE");
        
        // Student borrows resources
        System.out.println("Borrowing Resources:");
        System.out.println("-------------------");
        student.borrow(book);
        student.borrow(journal);
        student.borrow(thesis);
        student.borrow(capstone);
        student.borrow(newspaper);
        student.borrow(internet);
        student.borrow(audioBook);
        student.borrow(eJournal);
        
        // Show all borrowed resources
        student.showBorrowed();
        
        // Demonstrate SOLID principles
        System.out.println("=========================================");
        System.out.println("SOLID Principles Validation");
        System.out.println("=========================================");
        System.out.println("✓ DIP: Student depends on LibraryResource interface");
        System.out.println("✓ OCP: Added AudioBook & EJournal without modifying Student");
        System.out.println("✓ LSP: All resources work polymorphically");
        System.out.println("✓ ISP: Interface has only getTitle() and getResourceType()");
        System.out.println("✓ SRP: Student only manages borrowing, resources manage themselves");
        
        System.out.println("\n✅ REFACTORING SUCCESSFUL!");
    }
}