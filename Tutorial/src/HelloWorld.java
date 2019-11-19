// Hello world print
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Welcome to Java!");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Hello World, " + x);
	}
}