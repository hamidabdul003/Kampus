import java.util.Scanner;

public class S1A_miftah {
    public static void main(String[] args){
        int fasilitas, mobil, hari, total;
        Scanner melayani = new Scanner(System.in);
        System.out.println("=====Aplikasi Rental Mobil=====");
        System.out.println("====Halo Selamat Datang di Rental Mobil 79====\n");
        System.out.println("Mobil yang tersedia");
        System.out.println("1. Mobil Avanza");
        System.out.println("2. Mobil Alphard");
        System.out.println("3. Mobil BMW");
        System.out.println("Kami Memberikan Fasilitas");
        System.out.println("1. Menyewa Mobil");
        System.out.println("2. Mengembalikan Mobil");
        System.out.print("Apa Yang Ingin Anda Lakukan? ");
        fasilitas = melayani.nextInt();
        if (fasilitas == 1){
            System.out.println("Anda Memilih Menyewa Mobil\n");
            System.out.println("1. Mobil Avanza");
            System.out.println("2. Mobil Alphard");
            System.out.println("3. Mobil BMW");
            System.out.println("Silahkan Pilih Mobil Yang Ingin Anda Sewa : ");
            mobil = melayani.nextInt();
            if (mobil == 1){
                System.out.println("Anda Ingin Menyewa Mobil Avanza");
                System.out.println("Berapa hari anda Ingin Menyewa?");
                hari = melayani.nextInt();
                if (hari <= 7){
                    System.out.println("Selamat Jalan, Hati hati Dijalan");
                } else {
                    System.out.println("Jika Penyewaan lebih dari 7 hari, maka akan dikenakan denda 10%");
                    System.out.println("Selamat Jalan, Hati hati Dijalan");
                }
            }
            else if (mobil == 2){
                System.out.println("Anda Ingin Menyewa Mobil Alphard");
                System.out.println("Berapa hari anda Ingin Menyewa?");
                hari = melayani.nextInt();
                if (hari <= 7){
                    System.out.println("Selamat Jalan, Hati hati Dijalan");
                } else {
                    System.out.println("Jika Penyewaan lebih dari 7 hari, maka akan dikenakan denda 10%");
                    System.out.println("Selamat Jalan, Hati hati Dijalan");
                }
            }
            else if (mobil == 3){
                System.out.println("Anda Ingin Menyewa Mobil BMW");
                System.out.println("Berapa hari anda Ingin Menyewa?");
                hari = melayani.nextInt();
                if (hari <= 7){
                    System.out.println("Selamat Jalan, Hati hati Dijalan");
                } else {
                    System.out.println("Jika Penyewaan lebih dari 7 hari, maka akan dikenakan denda 10%");
                    System.out.println("Selamat Jalan, Hati hati Dijalan");
                }
            }
            else {
                System.out.println("Inputan Anda Salah");
            }
        }
        else if (fasilitas == 2){
            System.out.println("Anda Memilih Mengembalikan Mobil\n");
            System.out.println("1. Mobil Avanza");
            System.out.println("2. Mobil Alphard");
            System.out.println("3. Mobil BMW");
            System.out.println("Silahkan Pilih Mobil Yang Anda Sewa : ");
            mobil = melayani.nextInt();
            if (mobil == 1){
                System.out.println("Anda Menyewa Mobil Avanza");
                System.out.println("Berapa hari Anda Menyewa?");
                hari = melayani.nextInt();
                if (hari <= 7){
                    total = hari * 150000;
                    System.out.println("Anda harus membayar :" +total);
                } else {
                    total = hari * 150000 * 100/10;
                    System.out.println("Anda Denda dan Harus Bayar: " +total);
                }
            }
            else if (mobil == 2){
                System.out.println("Anda Menyewa Mobil Alphard");
                System.out.println("Berapa hari Anda Menyewa?");
                hari = melayani.nextInt();
                if (hari <= 7){
                    total = hari * 300000;
                    System.out.println("Anda harus membayar :" +total);
                } else {
                    total = hari * 300000 * 100/10;
                    System.out.println("Anda Denda dan Harus Bayar: " +total);
                }
            }
            else if (mobil == 3){
                System.out.println("Anda Menyewa Mobil BMW");
                System.out.println("Berapa hari Anda Menyewa?");
                hari = melayani.nextInt();
                if (hari <= 7){
                    total = hari * 300000;
                    System.out.println("Anda harus membayar :" +total);
                } else {
                    total = hari * 300000 * 100/10;
                    System.out.println("Anda Denda dan Harus Bayar: " +total);
                }
            }
            else {
                System.out.println("Inputan Anda Salah");
            }
        }
        else {
            System.out.println("Inputan Anda Salah");
        }
    }
}