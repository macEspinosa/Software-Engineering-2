public class OrganicWasteCollector extends WasteCollector {
    
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic") && container.isFull()) {
            System.out.println("🚮 Organic Waste Collector: Collecting organic waste container");
            System.out.println("   - Processing organic waste for composting");
            System.out.println("   - Container emptied successfully\n");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}