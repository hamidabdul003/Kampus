import javax.swing.*;

public class coba2 {
    public static void main(String[] args){
        String Nilai;
        int nilai;
        Nilai = JOptionPane.showInputDialog("Masukkan Nilai [0-100] : ");
        nilai = Integer.parseInt(Nilai);

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai Harus diantara 0-100");
            System.exit(0);
        }
        if (nilai < 100 & nilai >= 85){
            System.out.println("Nilai : "+nilai +" - Index = A");
        } else if (nilai < 85 & nilai >= 75){
            System.out.println("Nilai : "+nilai +" - Index = B");
        } else if (nilai < 75 & nilai >= 55){
            System.out.println("Nilai : "+nilai +" - Index = C");
        } else if (nilai <55 & nilai >= 45){
            System.out.println("Nilai : "+nilai +" - Index = D");
        } else {
            System.out.println("Nilai : "+nilai +" - Index = E");
        }
    }
}
