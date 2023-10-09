package task11;

import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 String password = "login";
				 
				 System.out.println("Enter the password : ");
				 String enterpass = input.next();
				 try {
					 if(!password.equals(enterpass)){
						 throw new IncorrectPasswordException("Incorrect password entered");
					 }else {
					
					 
						 System.out.println("Login successfully.");
					 }
					 
					 }catch(IncorrectPasswordException  e) {
						 System.err.println(e.getMessage());
	}finally{
		input.close();	
	}
	}

}
class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }
}