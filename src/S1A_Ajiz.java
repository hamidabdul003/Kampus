import java.util.Scanner;
public class S1A_Ajiz {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("SELAMAT DATANG DI RESTAURANT PADANG");
        System.out.println("_______________________________________\n");
        System.out.println("MENU MAKANAN & MINUMAN : ");
        System.out.println("_______________________________________");
        System.out.println("No      Nama Paket                      Harga");
        System.out.println("1.  Nasi + Rendang                    Rp 16000,00");
        System.out.println("2.  Nasi + Telor dadar                Rp 10000,00");
        System.out.println("3.  Nasi + Ayam Bakar                 Rp 15000,00");
        System.out.println("4.  Nasi + Ikan Lele                  Rp 15000,00");
        System.out.println("5.  Nasi + Ikan Cue Bakar             Rp 15000,00");
        System.out.println("6.  Nasi + Pindang                    Rp 18000,00");
        System.out.println("7.  Nasi + Rendang + Telor            Rp 23000,00");
        System.out.println("8.  Nasi + Rendang + Perkedel         Rp 21000,00");
        System.out.println("9.  Jus Mangga                        Rp 12000,00");
        System.out.println("10. Jus Alpukat                       Rp 12000,00");
        System.out.println("11. Es Teh Manis                      Rp 5000,00");
        System.out.println("12. Es Jeruk                          Rp 7000,00");
        System.out.println("");


        int harga = 0;

        int h1 = 16000, h2 = 10000, h3 = 15000, h6 = 18000, h7 = 23000, h8 = 21000 ;
        int m1 = 12000, m2 = 5000, m3 = 7000;
        String menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
            System.out.println("_______________________________________");

            System.out.print("Masukkan Nomor Pesanan : ");
            int inNomor = scan.nextInt();
            System.out.println("_______________________________________");

            if (inNomor == 1)
            {

                menu = " Nasi + Rendang ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h1;
            }
            else if (inNomor == 2)
            {

                menu = " Nasi + Telor dadar ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2;
            }
            else if (inNomor == 3)
            {

                menu = " Nasi + Ayam Bakar ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h3;
            }
            else if (inNomor == 4)
            {

                menu = " Nasi + Ikan Lele ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h3;
            }
            else if (inNomor == 5)
            {

                menu = " Nasi + Ikan Cue Bakar ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h3;
            }
            else if (inNomor == 6)
            {

                menu = " Nasi + Pindang ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h6;
            }
            else if (inNomor == 7)
            {

                menu = " Nasi + Rendang + Telor ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h7;
            }
            else if (inNomor == 8)
            {

                menu = " Nasi + Rendang + Perkedel";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h8;
            }else if (inNomor == 9)
            {

                menu = " Jus Mangga ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + m1;
            }else if (inNomor == 10)
            {

                menu = " Jus Alpukat ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + m1;
            }else if (inNomor == 11)
            {

                menu = " Es Teh Manis ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + m2;
            }else if (inNomor == 12)
            {

                menu = "Es Jeruk ";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + m3;
            }
            else

            {
                System.out.println("Nomor yang dipilih tidak ada di menu.");
            }


            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();

        }
        System.out.println("_______________________________________");
        System.out.println("Total yang harus dibayar sebesar " +harga+".");
        System.out.println("Terimakasih Telah Mampir Di Restaurant Kami.");
    }
}

