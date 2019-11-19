/**
 * @author Usman Sidiq
 * @npm 1706039950
 *
 *
 * Petunjuk pengerjaan :
 * - Boleh ditambahkan method baru
 * - Method yang sudah ada tidak boleh dihapus
 * - Untuk 3 method selain main, diperbolehkan untuk
 *      mengganti parameter dan hasil return yang
 *      dihasilkan
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class TP1 {

	public static void main(String[] args) throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
        /*
        Kode untuk input. Validasi input dengan do-while loop.
        Akan terus meminta input sampai memenuhi format input yang diberikan.
         */
        int player;
		do {
			System.out.print("Tentukan jumlah pemain: ");
			while (!sc.hasNextInt()) {
				System.out.println("Format input anda salah. Player hanya boleh dalam format integer positif.");
				System.out.print("Tentukan jumlah pemain: ");
				sc.next();
			}
			player = sc.nextInt();
			if(player <= 0) System.out.println("Jumlah player tidak boleh kurang dari 1 orang.");
			else if(player > 52) System.out.println("Maaf, hanya maksimal 52 orang yang dapat ikut dalam permainan.");
		} while (player <= 0 || player > 52);

		// membuat deck
		int[][] deck = createDeck();

		// mengocok deck
		shuffleDeck(deck);

		// membagikan kartu ke pemain
		int[][] hands = distributeCards(deck, player);

		/*
		Kode untuk memberikan output.
		Jenis kartu juga diperiksa ketika ingin diprint.
		Metode yang digunakan untuk mengecek tipe kartu adalah dengan melakukan operasi modulo dan pembagian.
		Dengan membagi kartu dengan 13, kita dapat mengetahui tipe kartunya.
		Sedangkan dengan modulo, kita dapat mengetahui angka kartunya.
		 */
		int suit = 0;
		String suitType = "";
		int card = 0;
		for(int i = 0; i < hands.length; i++) {
			System.out.printf("Player %d's hand:\n", i+1);
			for(int j = 0; j < hands[i].length; j++) {
				suit = (hands[i][j] - 1) / 13;
				if(suit == 0) suitType = "Hearts";
				else if(suit == 1) suitType = "Diamonds";
				else if(suit == 2) suitType = "Clovers";
				else suitType = "Spades";

				card = (hands[i][j]) % 13;
				if(card == 1) System.out.println("Ace of " + suitType);
				else if(card == 11) System.out.println("Jack of " + suitType);
				else if(card == 12) System.out.println("Queen of " + suitType);
				else if(card == 0) System.out.println("King of " + suitType);
				else System.out.println(card + " of " + suitType);
			}
			System.out.println();
		}

	}

	/**
	 * Method untuk membuat deck. Deck dibuat secara berurutan dari angka 1-52.
	 * @return deck yang dihasilkan
	 */
	public static int[][] createDeck() {
		int[][] deck = new int[4][13]; //Membuat array yang bisa menampung 4x13 kartu (52 kartu per deck)
		for(int i = 0; i < deck.length; i++) {
			for(int j = 0; j < deck[i].length; j++) {
				deck[i][j] = j + 1 + (i * 13);
			}
		}
		return deck;
	}

	/**
	 * Method untuk mengocok deck. Mengambil angka random dari 1-52 dan ditukar dengan angka yang ada di array.
	 * @param deck yang telah dibuat pada fungsi main
	 */
	public static void shuffleDeck(int[][] deck) {
		Random random = new Random();

		for(int i = 0; i < 52; i++) {
			int r = i + random.nextInt(52 - i);

			int temp = deck[r/13][r%13]; // r/13 dan r%13 untuk mengetahui letak angka di array
			deck[r/13][r%13] = deck[i/13][i%13];
			deck[i/13][i%13] = temp;
		}
	}


	/**
	 * Method untuk membagikan deck
	 * @param deck yang telah di shuffle
	 * @param players jumlah player dari input
	 * @return kartu yang telah dimiliki tiap pemain
	 */
	public static int[][] distributeCards(int[][] deck, int players) {
		int[][] hands = new int[players][52/players];
		int deckLength = deck[0].length;
		int handLength = hands[0].length;
		int pointer = 0;

		//Cara mendistribusikan kartu berbeda tergantung jumlah player.
		for(int i = 0; i < players; i++) {
			if(deckLength > handLength) {
				for(int j = 0; j < handLength; j++) {
					hands[i][j] = deck[pointer/deckLength][pointer%deckLength];
					pointer++;
				}
			}
			else if(deckLength <= handLength) {
				for(int j = 0; j < handLength; j++) {
					hands[i][j] = deck[pointer/deckLength][pointer%deckLength];
					pointer++;
				}
			}
		}



        /*
        Buat kodemu disini
         */

		return hands;
	}

}