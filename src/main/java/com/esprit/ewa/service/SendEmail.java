package com.esprit.ewa.service;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface SendEmail {
	 void SendEmailI() throws AddressException, MessagingException, IOException;

}
