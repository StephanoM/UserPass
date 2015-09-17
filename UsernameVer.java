
import java.util.Scanner;
public class UsernameVer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Username;
		String Password; //User in
		
		String UsernameR = "Stephano";
		String PasswordR = "Password";// Set
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Enter Username & Passsword");
		
		System.out.println("Username:");
		Username = keyboard.next();
		
		System.out.println("Password:");
		Password = keyboard.next();
		
		if (Username.equals(UsernameR) && (Password.equals(PasswordR))) {
			System.out.println("Welcome" + UsernameR);
		}
		else {
			System.err.println("Wrong Username & Password");
		}
		
		
		

	}

}
