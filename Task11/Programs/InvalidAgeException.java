package task11;

public class InvalidAgeException extends Exception {
	InvalidAgeException(String message){
		super(message);
	}
	static void vote(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Invalid age");
		}else {
			System.out.println("eligible for vote");
		}
		
	}
	
	
	public static void main(String[] args) {
		try {
			vote(17);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
