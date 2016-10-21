
package fcu.iecs.oop.password;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String password= null;
		Scanner scanner = new Scanner(System.in);
		PasswordEncorder pass1 = new PasswordEncorder();
		do{
		System.out.print("Please enter a password: ") ;
		password = scanner.next();
		pass1.change(password);
		}while(!password.equals("exit"));
		scanner.close();
	}	
}
