package com.greatelearning.service;

import java.util.Random;
import com.greatlearning.model.Employee;

public class CredentialService {

	
	public char[] generatePassword() {
		
		String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialCharacters="!@#$%^&*_=+-/.?<>";
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random random = new Random();
		int passwordLength = 8;
		
		if(passwordLength > 8)
		{
			throw new IllegalArgumentException("Password length is more than 8");
		}
		
		char[] password=new char[passwordLength];
		for(int i=0;i<passwordLength;i++) 
		{
			password[i]=values.charAt(random.nextInt(values.length()));
			
		}
		return password;	
	}
	
	// Method to generate EmailAddress
	public String generateEmailAddress(String firstName, String lastName, String dept) 
	{
		return firstName + lastName + "@" + dept + ".abc.com";
	}
	
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println(" Hi  " + employee.getFirstName() +   "  your generated credentials are as follows  " );
		System.out.println("Email --> "  +email);
		System.out.println("password --> " +generatedPassword);
	}
}
