public class Soal4 {
    public static void main(String[] args) {
        long w = 10;
        //int u = w; --> Compile error. Terjadi error karena kapasitas long lebih besar dari integer.
        //Solusi : Melakukan type casting saat inisiasi variabel u atau mengubah tipe variable u menjadi long
        int u = (int) w; //Solusi 1
        long x = w;
        System.out.println(u);
        System.out.println(x);
    }
}
