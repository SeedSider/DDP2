import java.util.Scanner;

/**
 * 
 * @nama: [Usman Sidiq]
 * @npm: [1706039950]
 *
 */
public class Soal6Lab1 {
	/*
	 * Program ini akan melakukan identifikasi nama dan umur
	 * berdasarkan input user
	 * Tapi program ini masih belum selesai 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nama Depan Anda: ");
		String firstName = scanner.next(); // isinya string nama depan dari input
		
		System.out.print("Nama Belakang Anda: ");
		String lastName = scanner.next(); // isinya string nama belakang dari input
		
		System.out.print("Umur Anda: ");
		int age = scanner.nextInt(); // isinya integer positif umur dari input
		
		/**
		 * Harusnya setelah discan input user, yang keluar seperti ini:
		 * 
		 * Nama Anda [nama depan] [nama belakang]
		 * Umur Anda [umur] tahun
		 * Sama dengan [umur dalam bulan] bulan
		 * Sama dengan [umur dalam hari] hari
		 */
		
		System.out.println("Nama Anda " + firstName + " " + lastName);
		System.out.println("Umur Anda " + age + " tahun");
		System.out.println("Sama dengan " + (12*age) + " bulan");
		System.out.println("Sama dengan " + (365*age) + " hari");
		
		// biasakan kalo buka object IO di close ya :)
		scanner.close();
		
		/**
		 * Tidak ada yang error, hanya outputnya salah karena setiap variabel belum diset ke input user dan scannernya belum digunakan.
		 */
		
		/**
		 * Mengubah setiap variabel menjadi sesuai dengan input dari user dengan tipe yang tepat.
		 * Variabel yang tipenya string menggunakan scanner.next() sedangkan yang integer menggunakan scanner.nextInt()
		 */
	}
	

}
