public class RecyclableWasteCollector extends WasteCollector {
    
    @Override
    public void collectWaste(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable") && container.isFull()) {
            System.out.println("♻️ Recyclable Waste Collector: Collecting recyclable waste container");
            System.out.println("   - Sorting recyclable materials");
            System.out.println("   - Sending to recycling facility");
            System.out.println("   - Container emptied successfully\n");
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        }
    }
}