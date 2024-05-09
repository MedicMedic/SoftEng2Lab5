package solidPrinciples;

public class InvoiceGenerator implements InvoiceGeneration 
{
    @Override
    public void generateInvoice(String fileName) 
    {
        System.out.println("Invoice generated: " + fileName);
    }
}
