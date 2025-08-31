package br.com.mariojp.solid.dip;

public class SmtpClient extends MailSender {
    @Override
    public void send(String to, String subject, String body) {
        // herda comportamento de MailSender, que lança exceção se SMTP não estiver disponível
        super.send(to, subject, body);
        System.out.println("Email real enviado para " + to);
    }
}
