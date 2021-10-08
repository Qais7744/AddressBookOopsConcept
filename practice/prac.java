package practice;

import java.io.*;

public class prac {
	public static void main(String args[]){    
		Console c=System.console();    
		System.out.println("Enter password: ");    
		char[] ch = null;
		String pass=String.valueOf(ch);//converting char array into string    
		System.out.println("Password is: "+pass);  
		char[] ch1=c.readPassword(); 
		}
	
}


