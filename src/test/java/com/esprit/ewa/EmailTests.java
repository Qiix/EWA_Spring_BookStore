package com.esprit.ewa;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.ewa.service.SendEmail;



@RunWith(SpringRunner.class)

@SpringBootTest
public class EmailTests {
	@Autowired
	SendEmail sendEmailService;
	
	@Test
	public void sendEmail() throws AddressException, MessagingException, IOException
	{
		sendEmailService.SendEmailI();
	}

}
