import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan lebar 1/2 diagonal: "); //input harus integer positif. Tidak ada pengecekan nilai negatif
		int lebar = s.nextInt();
		//For loop untuk setengah piramida atas
		for (int i=1; i<=lebar; i++) {
			for(int j=0; j<lebar-i; j++) {
				System.out.print(" "); //Print spasi selama j kurang atau sama dengan lebar diamond
			}
			for(int j=0; j<i*2-1; j++) {
				System.out.print("*"); //Print asterisk sampai j kurang dari i dikali 2 - 1
			}
			System.out.println();
		}

		//For loop untuk setengah piramida atas
		for(int i=lebar; i>0; i--) {
			for(int j=0; j<lebar-i; j++) { //Duplikasi kode dari setengah piramida atas dengan cara terbalik
				System.out.print(" ");
			}
			for(int j=0; j<i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
