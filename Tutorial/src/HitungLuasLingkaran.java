import java.util.Scanner;

class HitungLuasLingkaran {
	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		double jari_jari = input.nextDouble();
//		System.out.println("Luas lingkaran dengan jari-jari " + jari_jari + " adalah " + (jari_jari * jari_jari * 22 / 7));
		int a = 2;
		int b = 3;
		double c = a/(b*1.0);

		System.out.println(c);
	}

}