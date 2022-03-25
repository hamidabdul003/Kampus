import java.util.Scanner;

public class coba {
    //program Menghitung Luas Segitiga
    public static void main (String[] args){
        double alas, tinggi, luas;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai Alasnya : ");
        alas = in.nextInt();
        System.out.print("Masukkan Nilai Tinggi nya : ");
        tinggi = in.nextInt();
        luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga adalah : "+luas);
    }
}