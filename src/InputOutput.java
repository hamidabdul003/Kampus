import javax.swing.JOptionPane;
import java.util.Scanner;
public class InputOutput {
    static void Scan(){
        //Program Menghitung luas segitiga Scanner
        double alas, tinggi, luas;
        Scanner in = new Scanner(System.in);
        System.out.println("======Menghitung Luas Segitiga=======");
        System.out.print("Masukkan Nilai Alas nya : ");
        alas = in.nextInt();
        System.out.print("Masukkan Nilai Tingginnya : ");
        tinggi=in.nextInt();
        luas = 0.5 * alas * tinggi;
        System.out.println("Jadi, luas segitiga adalah : "+luas);

        /*System.out.println("String "+1+2+3);       //6
        System.out.println("String "+(1+2+3));     //6
        System.out.println(1+2+3+" String "+1+2+3);  //12*/
    }

    static void Optionpane(){
        //Program Menghitung luas segitiga menggunakan OptionPane
        String Nilai;
        int nilai;
        Nilai = JOptionPane.showInputDialog("Masukkan Nilai [0-100] : ");
        nilai = Integer.parseInt(Nilai);
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai Harus diantara 0 - 100");
            System.exit(0);
        }
        if (nilai < 100 & nilai >=85) {
            System.out.println("Nilai : "+nilai + " - index = A");
        } else if (nilai < 85 & nilai >= 75){
            System.out.println("Nilai : "+nilai + " - index = B");
        } else if (nilai < 75 & nilai >= 55){
            System.out.println("Nilai : "+nilai + " - index = C");
        } else if (nilai < 55 & nilai >=45){
            System.out.println("Nilai : "+nilai + " - index = D");
        } else {
            System.out.println("Nilai : "+nilai + " - Index = F");
        }
    }

    public static void main(String [] args){
        Optionpane();
    }
}
