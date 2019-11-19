import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah menit: ");
        long minutes = input.nextLong();
        long hours = minutes/60;
        long minRemain = minutes % 60;
        long days = hours/24;
        hours %= 24;
        long years = days / 365;
        days %= 365;
        System.out.println(minutes + " menit sama dengan " + years + " tahun " + days + " hari " + hours + " jam " + minRemain + " menit");
    }
}
