package com.greatlearning.service;
import java.util.Random;

import com.greatlearning.model.Employee;


public class CredentialService {
	public String generatePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*()_+<>?";

        String allCharacters = capitalLetters + smallLetters + numbers + specialCharacters;

        StringBuilder password = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            password.append(allCharacters.charAt(random.nextInt(allCharacters.length())));
        }

        return password.toString();
    }
	
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee employee, String email, String generatedPassword) {
		System.out.println("Dear "+employee.getFirstName()+ " your generated credentials are as follows ");
		System.out.println("Email --> "+ email);
		System.out.print("Password --> 1"
				+ "");
		System.out.print(generatedPassword);
	}

}
