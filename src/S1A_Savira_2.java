
import java.util.Scanner;
public class S1A_Savira_2 {
    public static void main(String[] args)throws Exception
    {
        //Membuat Objek Baru
        Scanner input = new Scanner(System.in);

        //Deklarasi
        int kode, J;
        double pajak = 0, tot;
        String nPelayanan, Kategori = null, jenis = null;

        //Info Barang
        System.out.println("            Aplikasi Layanan Pajak Online");
        System.out.println("___________________________________________________________\n");
        System.out.println("Selamat Datang di Aplikasi Layanan Pajak Online\n");
        System.out.println("_____________________________________________________________");
        System.out.println("A. Bayarlah Pajak Tepat Waktu\n");
        System.out.println("1. PPN ");
        System.out.println("2. PPh 21 ");
        System.out.println("3. PPh 23 ");
        System.out.println("4. PPnBM ");
        System.out.println("5. PBB \n");
        System.out.println("--------------------------------\n");
        System.out.println("B. Pelayanan Yang Kami Sediakan\n");
        System.out.println("1. Bayar Pajak");
        System.out.println("2. Lapor Pajak\n");
        System.out.println();
        System.out.print("Masukan Kode Pelayanan (A/B) : ");
        nPelayanan = input.nextLine();
        System.out.print("Masukan Kode  (1/2/3/4/5) : ");
        kode = input.nextInt();
        System.out.println("=========================================");

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
            System.out.print("Masukan Kode Pelayanan (A/B) : \n");
            nPelayanan = input.nextLine();
            System.out.print("Masukan Kode Pajak (1/2/3/4/5) : \n");
            kode = input.nextInt();
            System.out.println("=========================================\n");

            //Kondisi


            if (nPelayanan.equals("A" ))
            {
                Kategori = "Bayarlah Pajak Tepat Waktu";
                switch (kode)
                {
                    case 1 :
                        jenis = "PPN";
                        pajak = 0.1;
                        break;
                    case 2 :
                        jenis = "PPh 21";
                        pajak = 0.05;
                        break;
                    case 3 :
                        jenis = "PPh 23";
                        pajak = 0.02;
                        break;
                    case 4 :
                        jenis = "PPnBM";
                        pajak = 0.4;
                        break;
                    case 5 :
                        jenis = "PBB";
                        pajak = 0.005;
                        break;
                    default :
                        System.out.println("Masukan Kembali Kode Angka");
                }
            }
            if (nPelayanan.equals("B"))
            {
                Kategori = "Pelayanan Tersedia";
                switch (kode)
                {
                    case 1 :
                        pajak = 0;
                        break;
                    case 2 :
                        pajak = 0;
                        break;
                    case 3 :
                        pajak = 0;
                        break;
                    case 4 :
                        pajak = 0;
                        break;
                    case 5 :
                        pajak = 0;
                        break;
                    default :
                        System.out.println("Masukan Kembali Kode Angka");
                }
            }

            //Hasil
            System.out.println("Anda Memilih : " + Kategori );
            System.out.println("Pajak " + jenis + " Sebesar : " + pajak);
            System.out.print("Masukan Jumlah Uang : ");
            J = input.nextInt();
            tot = (J * pajak) ;
            System.out.println("Total Yang Harus Dibayar Sebesar : Rp." + tot);

            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = input.next();

            System.out.println("_______________________________________");
            System.out.println("Total Yang Harus Anda Bayar Sebesar " + tot +".");
            System.out.println("Terimakasih Sudah Melakukan Transaksi Pajak");


        }
    }

}