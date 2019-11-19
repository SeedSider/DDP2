import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai integer positif i (i > 0):");
		int loop = input.nextInt();
		double piApprox = 0;  //Variabel untuk menyimpan hasil aproksimasi nilai pi
		for (double i = 1; i <= loop; i++) {
			piApprox += (i % 2 == 0) ? -1 / (2* i - 1) : 1 / (2 * i - 1);
			//Kode di atas merupakan if-else conditional untuk mengecek apakah i ganjil atau genap.
			//Jika ganjil, menggunakan 1 sebagai pembilangnya. Sedangkan jika genap, menggunakan -1 sebagai pembilangnya.
		}
		System.out.println(piApprox * 4); //Nilai akhir yang didapatkan dikalikan dengan 4 sesuai dengan rumus aproksimasi nilai pi

	}
}
