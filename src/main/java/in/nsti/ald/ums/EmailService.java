package in.nsti.ald.ums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(Email email) {
        try {
            // Check if recipient email is null or empty
            if (email.getTo() == null || email.getTo().isEmpty()) {
                throw new IllegalArgumentException("Recipient email address must not be null or empty.");
            }

            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message);

            helper.setFrom("anjalikesherwani792@gmail.com");

            helper.setTo(email.getTo());  // Ensure the email address is valid
            helper.setSubject(email.getSubject());
            helper.setText(email.getMessage());

            javaMailSender.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
