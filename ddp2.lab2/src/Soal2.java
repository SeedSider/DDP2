import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an ISBN number: ");
		long remainder;
		long sum = 0;
		long input = scanner.nextLong();

		/* - Loop untuk melakukan penghitungan semua digit secara berurut dari digit paling kanan ke kiri.
		   - Digitnya diambil dengan melakukan modulo 10 pada angka ISBN nya.
		   - Digit angka dipastikan 10, sehingga diloop 10 kali
		*/
		for(int i = 0; i < 10; i++) {
			remainder = input % 10;
			input = input / 10;
			sum += remainder * (i+1);
		}

		if(sum % 11 == 0) {
			System.out.println("Your number is valid");
		}
		else {
			System.out.println("Your number is invalid");
		}
	}
}
