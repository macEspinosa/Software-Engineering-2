public class HazardousWasteCollector extends WasteCollector {
    
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous") && container.isFull()) {
            System.out.println("⚠️ Hazardous Waste Collector: Collecting hazardous waste container");
            System.out.println("   - Wearing protective gear");
            System.out.println("   - Following safety protocols");
            System.out.println("   - Transporting to specialized facility");
            System.out.println("   - Container emptied successfully\n");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else if (container.isFull()) {
            System.out.println("❌ Error: No suitable collector found for " + container.getType() + " waste!\n");
        }
    }
}