public class Soal1 {
    public static void main(String[] args) {
        //int x = 2.1;  --> Compile error. Terjadi error incompatible types
        //Solusi: mengubah tipe variable menjadi double atau melakukan type casting ke integer dengan konsekuensi
        //akurasi nilai berkurang (angka di belakang koma dihilangkan)

        double x = 2.1; //solusi 1
        int y = (int) 2.1; //solusi 2

        System.out.println(x);
        System.out.println(y);

    }
}
