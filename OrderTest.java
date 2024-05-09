package solidPrinciples;
public class OrderTest 
{
  public static void main(String[] args) 
  {
    OrderCalculation totalCalculator = new OrderCalculator();
    OrderPlacement orderPlacer = new OrderPlacer();
    InvoiceGeneration invoiceGenerator = new InvoiceGenerator();
    EmailNotification emailNotifier = new EmailNotifier();

    totalCalculator.calculateTotal(10.0, 2);
    orderPlacer.placeOrder("John Doe", "123 Main St");
    invoiceGenerator.generateInvoice("order_123.pdf");
    emailNotifier.sendEmailNotification("johndoe@example.com");
  }
}
