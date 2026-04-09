public class OrderTest {
    public static void main(String[] args) {
        // Create implementations
        ICalculateTotal calculator = new CalculateTotal();
        IPlaceOrder placer = new PlaceOrder();
        IGenerateInvoice invoiceGenerator = new GenerateInvoice();
        ISendEmailNotification notifier = new SendEmailNotification();

        // Inject dependencies into processor
        OrderProcessor processor = new OrderProcessor(calculator, placer, 
                                                       invoiceGenerator, notifier);
        
        // Process order
        processor.processOrder(10.0, 2, "John Doe", "123 Main St", 
                               "order_123.pdf", "johndoe@example.com");
    }
}