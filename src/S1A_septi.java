import java.util.Scanner;
public class S1A_septi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        String merkmotor;
        String merkmobil;
        String kendaraan;
        System.out.println("================================");
        System.out.print("Masukan Nama: ");
        nama = input.next();
        System.out.println("================================");
        System.out.print("Masukan Jenis Kendaraan (Motor / Mobil) : ");
        kendaraan = input.next();
        System.out.println("================================");
        if (kendaraan.equals("Motor")) {
            System.out.print("Masukan Merk Motor Anda (Honda / Yamaha) : ");
            merkmotor = input.next();
            System.out.println("================================");
            if (merkmotor.equals("Honda")){
                System.out.println("Biaya = Rp. 100.000 dan di kerjakan dalam 2 hari");
                System.out.println("Terimakasih " +nama+ " telah percaya pada bengkel kami");
                System.out.println("================================");
            }
            else if(merkmotor.equals("Yamaha")) {
                System.out.println("Biaya = Rp. 150.000 dan di kerjakan dalam 1 hari");
                System.out.println("Terimakasih " +nama+ " telah percaya pada bengkel kami");
            }
            else {
                System.out.println("Merk kendaraan tidak sesuai");
            }
        }
        else if (kendaraan.equals("Mobil")){
            System.out.print("Masukan Merk Mobil (Toyota / Honda) : ");
            merkmobil = input.next();
            if (merkmobil.equals("Toyota")){
                System.out.println("Biaya = Rp. 500.000 dan di kerjakan dalam 4 hari");
                System.out.println("Terimakasih " +nama+ " telah percaya pada bengkel kami");
            }
            else if(merkmobil.equals("Honda")) {
                System.out.println("Biaya = Rp. 650.000 dan di kerjakan dalam 3 hari");
                System.out.println("Terimakasih " +nama+ " telah percaya pada bengkel kami");
            }
            else {
                System.out.println("Merk kendaraan tidak sesuai");
            }
        }
    }
}