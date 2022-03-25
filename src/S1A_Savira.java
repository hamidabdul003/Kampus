import java.util.Scanner;
public class S1A_Savira {
    public static void main(String[] args) {
        int menyediakan, bayar, telat, lapor, hari, nilai, total;
        Scanner layanan = new Scanner(System.in);
        System.out.println("========Aplikasi Pajak Online========");
        System.out.println("==============Selamat Datang di Aplikasi Pajak Online==============\n");
        System.out.println("Bayarlah Pajak Tepat Waktu");
        System.out.println("1. PPN");
        System.out.println("2. PPH Final ");
        System.out.println("Pelayanan Yang Kami Sediakan");
        System.out.println("1. Bayar Pajak");
        System.out.println("2. Lapor Pajak");
        System.out.println("Layanan Apa Yang Anda Butuhkan? : ");
        menyediakan = layanan.nextInt();
        if (menyediakan == 1) {
            System.out.println("Anda Ingin Membayar Pajak\n");
            System.out.println("1. PPN");
            System.out.println("2. PPH Final ");
            System.out.println("Silahkan Pilih Pembayaran : ");
            bayar = layanan.nextInt();
            if (bayar == 1) {
                System.out.println("Anda Ingin Membayar Pajak");
                nilai = 10 / 100;
                System.out.println("Masa Pajak Yang Ingin Anda Bayar : ");
                hari = layanan.nextInt();
                if (hari <= 30) {
                    nilai = hari * 100000;
                    System.out.println("Anda Harus Membayar : " +nilai);
                } else {
                    nilai = hari * 100000 * 100 / 10;
                    System.out.println("Anda Telat Bayar, dan Wajib Membayar Denda : " +nilai);
                }
            }
            else if (bayar == 2) {
                System.out.println("Anda Ingin Lapor Pajak");
                telat = 10;
                System.out.println("Masa Pajak Yang Ingin Anda Lapor : ");
                hari = layanan.nextInt();
                if (hari <= 30) {
                    total = hari * 100000;
                    System.out.println("Anda Harus Membayar : " +total);
                } else {
                    total = hari * 100000 * 100 / 10;
                    System.out.println("Anda Telat Lapor, dan Wajib Membayar Denda : " +total);
                }
            }
        }else {
            System.out.println("inputan anda salah");
        }
    }
}
