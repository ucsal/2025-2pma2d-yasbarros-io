package br.com.mariojp.solid.dip;

public class NoopSender extends MailSender {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("DRY_RUN: email simulado para " + to);
    }
}
