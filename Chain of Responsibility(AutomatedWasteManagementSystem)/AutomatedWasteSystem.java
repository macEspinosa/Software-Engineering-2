public class AutomatedWasteSystem {
    public static void main(String[] args) {
        System.out.println("🏭 AUTOMATED WASTE MANAGEMENT SYSTEM");
        System.out.println("=======================================\n");
        
        // Initialize the waste management system
        WasteManagementSystem system = new WasteManagementSystem();
        
        // Create different types of waste containers
        System.out.println("📦 Creating waste containers...");
        
        WasteContainer organic1 = new WasteContainer("organic", 100);
        WasteContainer organic2 = new WasteContainer("organic", 150);
        WasteContainer recyclable1 = new WasteContainer("recyclable", 200);
        WasteContainer recyclable2 = new WasteContainer("recyclable", 120);
        WasteContainer hazardous1 = new WasteContainer("hazardous", 50);
        WasteContainer hazardous2 = new WasteContainer("hazardous", 75);
        WasteContainer unknown1 = new WasteContainer("electronic", 80); // No handler for this type
        
        // Simulate waste accumulation
        System.out.println("📈 Simulating waste accumulation...\n");
        
        organic1.fill(100);  // Full
        organic2.fill(100);  // Not full
        recyclable1.fill(200); // Full
        recyclable2.fill(80);  // Not full
        hazardous1.fill(50);    // Full
        hazardous2.fill(40);    // Not full
        unknown1.fill(80);      // Full but no handler
        
        // Register containers with the system
        system.addContainer(organic1);
        system.addContainer(organic2);
        system.addContainer(recyclable1);
        system.addContainer(recyclable2);
        system.addContainer(hazardous1);
        system.addContainer(hazardous2);
        system.addContainer(unknown1);
        
        // Display initial status
        system.displayContainerStatus();
        
        // Trigger waste collection process
        System.out.println("🚛 INITIATING WASTE COLLECTION PROCESS");
        System.out.println("========================================");
        system.checkAndCollectWaste();
        
        // Display final summary
        System.out.println("📋 COLLECTION SUMMARY");
        System.out.println("=====================");
        System.out.println("✅ Organic waste: Collected and sent to composting facility");
        System.out.println("✅ Recyclable waste: Collected and sent to recycling center");
        System.out.println("✅ Hazardous waste: Collected with safety protocols");
        System.out.println("⚠️ Electronic waste: No specialized collector available - requires manual handling\n");
        
        System.out.println("=======================================");
        System.out.println("🎯 Automated waste collection cycle completed!");
        System.out.println("🔄 System ready for next collection cycle.");
    }
}