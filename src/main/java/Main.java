import br.com.mariojp.solid.dip.EmailNotifier;
import br.com.mariojp.solid.dip.MailSender;
import br.com.mariojp.solid.dip.NoopSender;
import br.com.mariojp.solid.dip.SmtpClient;
import br.com.mariojp.solid.dip.User;

public class Main {

    public static void main(String[] args) {
        System.setProperty("DRY_RUN", "true"); // Simula DRY_RUN

        MailSender sender;
        if ("true".equalsIgnoreCase(System.getProperty("DRY_RUN"))) {
            sender = new NoopSender();
        } else {
            sender = new SmtpClient();
        }

        var notifier = new EmailNotifier(sender); // <-- passa o sender
        notifier.welcome(new User("Ana", "ana@example.com"));
        System.out.println("Email enviado!");
    }
}
