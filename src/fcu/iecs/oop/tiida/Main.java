package fcu.iecs.oop.tiida;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		NissanTiida tiida = new NissanTiida(); 
		int number;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a Number: ") ;
		number = scanner.nextInt();
		tiida.loop(number);
		
		scanner.close();
	}

}
