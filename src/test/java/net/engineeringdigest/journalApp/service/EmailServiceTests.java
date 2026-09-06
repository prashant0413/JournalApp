package net.engineeringdigest.journalApp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

    @Test
    public void testSendMail() {
        emailService.sendMail(
                "fidan47382@94an.com",
            "Emergency",
                "Your bank account balance is: Zero"
        );
    }
}
