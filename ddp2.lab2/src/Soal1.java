import java.util.Scanner;


public class Soal1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Versi 1 pengerjaan soal (dengan math.random dan if-else condition)
		int card2 = (int) (Math.random() * 13);
		int type2 = (int) (Math.random() * 4);
		String command = input.next();
		if(command.equals("ambil")) {
			System.out.print("Anda mengambil kartu ");
			if(card2 == 1) {
				System.out.print("A");
			}
			else if(card2 == 11) {
				System.out.print("J");
			}
			else if(card2 == 12) {
				System.out.print("Q");
			}
			else if(card2 == 13) {
				System.out.print("K");
			}
			else {
				System.out.print(card2);
			}

			if(type2 == 0) {
				System.out.println("\u2660");
			}
			else if(type2 == 1) {
				System.out.println("\u2665");
			}
			else if(type2 == 2) {
				System.out.println("\u2666");
			}
			else if(type2 == 3) {
				System.out.println("\u2663");
			}

		}
		else if(command.equals("lewat")) {
			System.out.println("Anda tidak mengambil kartu");
		}
		else {
			System.out.println("Hanya menerima input \"ambil\" dan \"lewat\"");
		}

		//Versi 2 pengerjaan soal (Dengan menggunakan array dan math.random)
		//uncomment code below and comment code above

//		String[] card = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
//		String[] type = {"\u2665", "\u2666", "\u2663", "\u2660"};
//
//		String command = input.next();
//		if(command.equals("ambil")) {
//			System.out.println("Anda mengambil kartu " + card[(int) (Math.random() * card.length)]
//					+ type[(int) (Math.random() * type.length)]);
//		} else if(command.equals("lewat")) {
//			System.out.println("Anda tidak mengambil kartu");
//		} else {
//			System.out.println("Hanya menerima input \"ambil\" dan \"lewat\"");
//		}
		input.close();
	}
}
