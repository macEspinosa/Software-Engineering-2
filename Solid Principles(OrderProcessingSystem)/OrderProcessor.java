public class OrderProcessor {
    private final ICalculateTotal calculator;
    private final IPlaceOrder placer;
    private final IGenerateInvoice invoiceGenerator;
    private final ISendEmailNotification notifier;

    public OrderProcessor(ICalculateTotal calculator, 
                          IPlaceOrder placer,
                          IGenerateInvoice invoiceGenerator, 
                          ISendEmailNotification notifier) {
        this.calculator = calculator;
        this.placer = placer;
        this.invoiceGenerator = invoiceGenerator;
        this.notifier = notifier;
    }

    public void processOrder(double price, int quantity, 
                            String customerName, String address,
                            String fileName, String email) {
        calculator.calculateTotal(price, quantity);
        placer.placeOrder(customerName, address);
        invoiceGenerator.generateInvoice(fileName);
        notifier.sendEmailNotification(email);
    }
}