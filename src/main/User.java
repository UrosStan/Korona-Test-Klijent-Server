package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;


public class User {
	
		public String filepath = "members.txt";
    	public String username;
	    public String password;
	    public String email;
	    public String pol;
	 
		public User() {
			
		}
		private static Scanner x;
		public static void registracija(String username,String password,String email,String pol,String filepath) {
			
		}
		
		public void login(String username,String password,String filepath) {
			
			boolean found = false;
			String tempUsername=" ";
			String tempPassword = " ";
			
			
            try {
            	x = new Scanner(new File(filepath));
            	x.useDelimiter("[,\n]");
            	while(x.hasNext() && !found) {
            		tempUsername = x.next();
            		tempPassword = x.next();
            		
            		if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())) {
            			found=true;
            			System.out.println("Uspeh");
        				
            		}
            	}
            	
            	x.close();
            	System.out.println(found);
            }catch (Exception e) {
            	System.out.println("NISMO TE NASLI");
            }
		}
            //Ovde registraciju namesti
		public void registracija(String username, String password, String email, String pol) {
			String sve;
			sve="\n"+ username+",password";
		try {
		    Files.write(Paths.get(filepath), sve.getBytes(), StandardOpenOption.APPEND);
		}catch (IOException e) {
		    //exception handling left as an exercise for the reader
			}
		}
}