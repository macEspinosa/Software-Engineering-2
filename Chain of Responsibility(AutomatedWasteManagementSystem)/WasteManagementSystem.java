import java.util.ArrayList;
import java.util.List;

public class WasteManagementSystem {
    private WasteCollector collectionChain;
    private List<WasteContainer> containers;
    
    public WasteManagementSystem() {
        this.containers = new ArrayList<>();
        initializeCollectionChain();
    }
    
    private void initializeCollectionChain() {
        // Create collectors
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();
        
        // Build the chain: Organic -> Recyclable -> Hazardous
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);
        
        this.collectionChain = organicCollector;
    }
    
    public void addContainer(WasteContainer container) {
        containers.add(container);
        System.out.println("✅ Added new container: " + container);
    }
    
    public void checkAndCollectWaste() {
        System.out.println("\n🔍 Checking waste containers for collection...\n");
        
        for (WasteContainer container : containers) {
            if (container.isFull()) {
                System.out.println("⚠️ Container ready for collection: " + container);
                collectionChain.collectWaste(container);
            } else {
                System.out.println("⏳ Container not full: " + container);
            }
        }
    }
    
    public void displayContainerStatus() {
        System.out.println("\n📊 Current Waste Container Status:");
        System.out.println("===================================");
        for (int i = 0; i < containers.size(); i++) {
            WasteContainer container = containers.get(i);
            double fillPercentage = (container.getCurrentFillLevel() / container.getCapacity()) * 100;
            System.out.printf("%d. %s - %.1f%% full\n", 
                i + 1, 
                container.getType(), 
                fillPercentage);
        }
        System.out.println();
    }
}