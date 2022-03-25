import java.util.Scanner;
public class S1A_Ajiz_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("SELAMAT DATANG DI RESTAURANT PADANG");
        System.out.println("___\n");
        System.out.println("MENU MAKANAN  : ");
        System.out.println("___");
        System.out.println("No      Nama Paket                      Harga");
        System.out.println("1.  Nasi + Rendang                    Rp 16000,00");
        System.out.println("2.  Nasi + Telor dadar                Rp 10000,00");
        System.out.println("3.  Nasi + Ayam Bakar                 Rp 15000,00");
        System.out.println("4.  Nasi + Ikan Lele                  Rp 15000,00");
        System.out.println("5.  Nasi + Ikan Cue Bakar             Rp 15000,00");
        System.out.println("6.  Nasi + Pindang                    Rp 18000,00");
        System.out.println("7.  Nasi + Rendang + Telor            Rp 23000,00");
        System.out.println("8.  Nasi + Rendang + Perkedel         Rp 21000,00");
        System.out.println("");
        int harga = 0 , diskonMakanan = 0, jumlahPesananMakanan = 0 , jumlahHarga = 0 ,jumlahPesananMinuman = 0, diskonMinuman = 0;
        int h1 = 16000, h2 = 10000, h3 = 15000, h6 = 18000, h7 = 23000, h8 = 21000 ;
        int m1 = 12000, m2 = 5000, m3 = 7000;
        String menu;
        for (String i = "Y"; i.equals("Y")||i.equals("y"); ) {
            System.out.println("___");
            System.out.print("Masukkan Nomor Pesanan : ");
            int inNomor = scan.nextInt();
            System.out.println("___");
            if (inNomor == 1) {
                menu = " Nasi + Rendang ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = h1;
                System.out.print("Berapa Porsi : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMakanan = h1 * porsi * 10 / 100;
                    jumlahPesananMakanan = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : " +jumlahPesananMakanan);
                }else{
                    jumlahPesananMakanan = harga * porsi;
                }
            } else if (inNomor == 2) {
                menu = " Nasi + Telor dadar ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = h2;
                System.out.print("Berapa Porsi : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMakanan = h2 * porsi * 10 / 100;
                    jumlahPesananMakanan = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : " +jumlahPesananMakanan);
                }else{
                    jumlahPesananMakanan = harga * porsi;
                }
            } else if (inNomor == 3) {
                menu = " Nasi + Ayam Bakar ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = h3;
                System.out.print("Berapa Porsi : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMakanan = h3 * porsi * 10 / 100;
                    jumlahPesananMakanan = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : " +jumlahPesananMakanan);
                }else{
                    jumlahPesananMakanan = harga * porsi;
                }
            } else if (inNomor == 4) {
                menu = " Nasi + Ikan Lele ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = h3;
                System.out.print("Berapa Porsi : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMakanan = h3 * porsi * 10 / 100;
                    jumlahPesananMakanan = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : " +jumlahPesananMakanan);
                }else{
                    jumlahPesananMakanan = harga * porsi;
                }
            } else if (inNomor == 5) {
                menu = " Nasi + Ikan Cue Bakar ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = h3;
                System.out.print("Berapa Porsi : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMakanan = h3 * porsi * 10 / 100;
                    jumlahPesananMakanan = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : " +jumlahPesananMakanan);
                }else{
                    jumlahPesananMakanan = harga * porsi;
                }
            } else if (inNomor == 6) {
                menu = " Nasi + Pindang ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = h6;
                System.out.print("Berapa Porsi : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMakanan = h6 * porsi * 10 / 100;
                    jumlahPesananMakanan = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : " +jumlahPesananMakanan);
                }else{
                    jumlahPesananMakanan = harga * porsi;
                }
            } else if (inNomor == 7) {
                menu = " Nasi + Rendang + Telor ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = h7;
                System.out.print("Berapa Porsi : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMakanan = h7 * porsi * 10 / 100;
                    jumlahPesananMakanan = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : " +jumlahPesananMakanan);
                }else{
                    jumlahPesananMakanan = harga * porsi;
                }
            } else if (inNomor == 8) {
                menu = " Nasi + Rendang + Perkedel";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = h8;
                System.out.print("Berapa Porsi : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMakanan = h8 * porsi * 10 / 100;
                    jumlahPesananMakanan = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : " +jumlahPesananMakanan);
                }else{
                    jumlahPesananMakanan = harga * porsi;
                }
            }
            System.out.println("___");
            System.out.print("mau minum apa, kami menyediakan : \n");
            System.out.println("___");
            System.out.println("MENU MINUMAN  : ");
            System.out.println("___");
            System.out.println("No    Minuman                           Harga");
            System.out.println("1. Jus Mangga                        Rp 12000,00");
            System.out.println("2. Jus Alpukat                       Rp 12000,00");
            System.out.println("3. Es Teh Manis                      Rp 5000,00");
            System.out.println("4. Es Jeruk                          Rp 7000,00");
            System.out.println("");
            System.out.println("___");
            System.out.print("Masukkan Nomor berapa : ");
            int minum = scan.nextInt();
            if (minum == 1) {
                menu = " Jus Mangga ";
                System.out.println("Pilihan anda nomor " +minum + menu);
                harga = m1;
                System.out.print("Berapa Cup : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMinuman = m1 * porsi * 10 / 100;
                    jumlahPesananMinuman = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : "+jumlahPesananMinuman);
                }else{
                    jumlahPesananMinuman = porsi * m1;

                }
            } else if (minum == 2) {
                menu = " Jus Alpukat ";
                System.out.println("Pilihan anda nomor " +minum + menu);
                harga = m1;
                System.out.print("Berapa Cup : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMinuman = m1 * porsi * 10 / 100;
                    jumlahPesananMinuman = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : "+jumlahPesananMinuman);
                }else{
                    jumlahPesananMinuman = porsi * m1;

                }
            } else if (minum == 3) {
                menu = " Es Teh Manis ";
                System.out.println("Pilihan anda nomor " +minum + menu);
                harga = m2;
                System.out.print("Berapa Cup : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMinuman = m2 * porsi * 10 / 100;
                    jumlahPesananMinuman = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : "+jumlahPesananMinuman);
                }else{
                    jumlahPesananMinuman = porsi * m2;

                }
            } else if (minum == 4) {
                menu = "Es Jeruk ";
                System.out.println("Pilihan anda nomor " +minum + menu);
                harga = m3;
                System.out.print("Berapa Cup : ");
                int porsi = scan.nextInt();
                if (porsi > 2){
                    diskonMinuman = m3 * porsi * 10 / 100;
                    jumlahPesananMinuman = harga * porsi;
                    System.out.println("Pemesanan Lebih dari 2 Mendapat Diskon 10% dari : "+jumlahPesananMinuman);
                }else{
                    jumlahPesananMinuman = porsi * m3;

                }
            } else {
                System.out.println("Nomor yang dipilih tidak ada di menu.");
            }
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();
        }
        System.out.println("___");
        jumlahHarga = (jumlahPesananMakanan - diskonMakanan) + (jumlahPesananMinuman - diskonMinuman);
        System.out.println("Total yang harus dibayar sebesar " +jumlahHarga+".");
        System.out.println("Terimakasih Telah Mampir Di Restaurant Kami.");
    }
}