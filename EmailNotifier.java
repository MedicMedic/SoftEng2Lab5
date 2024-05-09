package solidPrinciples;

public class EmailNotifier implements EmailNotification 
{
  @Override
  public void sendEmailNotification(String email) 
  {
    System.out.println("Email notification sent to: " + email);
  }
}
