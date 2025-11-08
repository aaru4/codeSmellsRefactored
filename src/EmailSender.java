import java.util.logging.Logger;
public class EmailSender {
      private EmailSender() {
        throw new IllegalStateException("Utility class, must not be instantiated!");
      }

    public static void sendEmail(String customerEmail, String subject, String message){
        logger.info("Email to: " + customerEmail);
        logger.info("Subject: " + subject);
        logger.info("Body: " + message);
    }
}
