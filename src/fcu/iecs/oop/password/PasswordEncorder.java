package fcu.iecs.oop.password;

public class PasswordEncorder {
	public void change(String password){
		password = password.replace("A", "4").replace("a", "4");
		password = password.replace("E", "3").replace("e", "3");
		password = password.replace("I", "1").replace("i", "1");
		password = password.replace("O", "0").replace("o", "0");
		password = password.replace("T", "7").replace("t", "7");
		System.out.println(password);
	}
}
