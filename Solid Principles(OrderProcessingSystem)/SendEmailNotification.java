public class SendEmailNotification implements ISendEmailNotification {
    @Override
    public void sendEmailNotification(String email) {
        System.out.println("Email notification sent to: " + email);
    }
}