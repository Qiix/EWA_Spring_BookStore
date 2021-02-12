package com.esprit.ewa.controller;

import java.io.IOException;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.ewa.service.EmpruntService;
import com.esprit.ewa.service.SendEmail;


@RestController
public class RestControllerEmail 
{
	@Autowired
	SendEmail sendEmailService;
	@Autowired
	EmpruntService empruntService;
	
	@PostMapping(value = "/sendemail")
	public String sendEmail() throws AddressException, MessagingException, IOException {
		if (empruntService.NbrEmpruntNonRendus()<=100)
		{
		sendEmailService.SendEmailI();
	   return "Mail envoyé avec succès";  
	   }
		return "Vous n'avez pas atteint le nombre maximum des livres empruntés";
	} 
}