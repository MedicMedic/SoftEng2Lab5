package solidPrinciples;

public class OrderPlacer implements OrderPlacement 
{
    @Override
    public void placeOrder(String customerName, String address) 
    {
        System.out.println("Order placed for " + customerName + " at " + address);
    }
}
