import java.util.Scanner;

public class coba5 {
    public static void main(String [] args){
        int nilai;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nilai Anda : ");
        nilai = in.nextInt();
        if (nilai > 80){
            System.out.println("Nilai Anda Memuaskan");
        } else if (nilai > 60){
            System.out.println("Nilai Anda Cukup");
        } else {
            System.out.println("Nilai Anda Kurang, Silahkan Coba lagi");
        }
    }
}
