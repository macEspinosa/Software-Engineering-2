import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ShippingLabelGenerator implements ShippingVisitor {
    private static int labelCounter = 1000;
    
    @Override
    public double visitChair(Chair chair) {
        String label = generateLabel("CHAIR", chair.getDescription());
        System.out.println("Shipping Label:\n" + label);
        return 0; // Return 0 as this visitor doesn't calculate cost
    }
    
    @Override
    public double visitTable(Table table) {
        String specialHandling = table.getMaterial().toLowerCase().contains("glass") ? 
                                "FRAGILE - HANDLE WITH CARE" : "STANDARD HANDLING";
        String label = generateLabel("TABLE", table.getDescription(), specialHandling);
        System.out.println("Shipping Label:\n" + label);
        return 0;
    }
    
    @Override
    public double visitSofa(Sofa sofa) {
        String specialHandling = sofa.isSectional() ? 
                                "SECTIONAL - REQUIRES 2 PERSONS" : "BULKY ITEM - TEAM LIFT REQUIRED";
        String label = generateLabel("SOFA", sofa.getDescription(), specialHandling);
        System.out.println("Shipping Label:\n" + label);
        return 0;
    }
    
    private String generateLabel(String type, String description) {
        return generateLabel(type, description, "STANDARD HANDLING");
    }
    
    private String generateLabel(String type, String description, String specialHandling) {
        labelCounter++;
        LocalDate date = LocalDate.now().plusDays(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        
        return "┌─────────────────────────┐\n" +
               "│   SHIPPING LABEL         │\n" +
               "├─────────────────────────┤\n" +
               "│ Label #: " + labelCounter + "               │\n" +
               "│ Type: " + type + "                     │\n" +
               "│ Item: " + description + " │\n" +
               "│ Est. Delivery: " + date.format(formatter) + "      │\n" +
               "│ Handling: " + specialHandling + " │\n" +
               "└─────────────────────────┘";
    }
}