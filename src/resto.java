import java.util.Scanner;
/**
 * @author Abdul Hamid
 * @NPM 201943502765
 * @Kelas S2A
 */
//Aplikasi Tugas Pemrograman 2 Abdul Hamid Tentang Restauran Sederhana Tradisional
    //Menggunakan IF Majemuk dan If Bersarang
public class resto {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in); // Variable in digunakan untuk Scanner
        int menu,pilih,total,makan,buat,minum;
        System.out.println("==========Aplikasi Restoran=========="); //Opening
        System.out.println("===Selamat Datang di Restoran Kami===\n\r"); //Opening 2
        System.out.println("|| == Menyediakan Beberapa Menu == ||");
        System.out.println("|| 1. Nasi Rames  (5000)           ||");
        int rames = 5000; //harga Nasi Rames
        String nrames = "Nasi Rames (5000)"; //String nasi Rames
        System.out.println("|| 2. Nasi Uduk   (4000)           ||");
        int uduk = 4000; //harga Nasi Uduk
        String nuduk = "Nasi Uduk (4000)"; //String nasi Uduk
        System.out.println("|| 3. Nasi Kuning (6000)           ||");
        int kuning = 6000; //harga Nasi Kuning
        String nkuning = "Nasi Kuning (6000)"; //String nasi Kuning
        System.out.println("||=================================||\n\r");
        System.out.print("Pilih : ");
        menu = in.nextInt(); //inputan menu pada Scanner in
        System.out.println("=================================\n\r");
        if (menu == 1){
            System.out.println("Anda Memilih "+nrames);
            System.out.println("Apakah Anda Memiliki Kartu member?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak\n\r");
            System.out.print("Pilih : ");
            pilih = in.nextInt(); //inputan pilih pada Scanner in
            System.out.println("=================================\n\r");
            if (pilih == 1) {
                System.out.println("Makan disini apa dibawa pulang?");
                System.out.println("1. Makan disini");
                System.out.println("2. Dibawa Pulang\n\r");
                System.out.print("Pilih : ");
                makan = in.nextInt(); //inputan makan pada Scanner in
                System.out.println("=================================\n\r");
                if (makan == 1) {
                    System.out.println("|| == Menyediakan Beberapa Minum == ||");
                    System.out.println("|| 1. Es Jeruk          (4000)      ||");
                    int esjeruk = 4000; //harga esJeruk
                    String esjeruks = "Es Jeruk (4000)";
                    System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                    int jerukanget = 3000;
                    String jerukangets = "Jeruk Anget (3000)";
                    System.out.println("|| 3. Es Teh manis      (4000)      ||");
                    int esteh = 4000;
                    String estehs = "Es Teh (4000)";
                    System.out.println("|| 4. Teh Anget         (2000)      ||");
                    int tehanget = 2000;
                    String tehangets = "Teh Anget (2000)";
                    System.out.println("|| 5. Tidak Terimakasih             ||");
                    System.out.println("||==================================||\n\r");
                    System.out.print("Pilih : ");
                    minum = in.nextInt();
                    System.out.println("=================================\n\r");
                    int diskon = 0; //diskon jika memiliki Kartu Member
                    if (minum == 1){
                        System.out.println("Anda Memilih "+nrames+"\n\r" +esjeruks);
                        System.out.println("=================================\n\r");
                        total = diskon + rames + esjeruk;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 2){
                        System.out.println("Anda Memilih "+nrames+"\n\r"+jerukangets);
                        System.out.println("=================================\n\r");
                        total = diskon + rames + jerukanget;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 3){
                        System.out.println("Anda Memilih "+nrames+"\n\r"+estehs);
                        System.out.println("=================================\n\r");
                        total = diskon + rames + esteh;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 4){
                        System.out.println("Anda Memilih "+nrames+"\n\r"+tehangets);
                        System.out.println("=================================\n\r");
                        total = diskon + rames + tehanget;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else {
                        System.out.println("Anda Memilih "+nrames);
                        System.out.println("=================================\n\r");
                        total = diskon + rames;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    }
                } else if (makan == 2) {
                    System.out.println("|| == Menyediakan Beberapa Minum == ||");
                    System.out.println("|| 1. Es Jeruk          (4000)      ||");
                    int esjeruk = 4000; //harga esJeruk
                    String esjeruks = "Es Jeruk (4000)";
                    System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                    int jerukanget = 3000;
                    String jerukangets = "Jeruk Anget (3000)";
                    System.out.println("|| 3. Es Teh manis      (4000)      ||");
                    int esteh = 4000;
                    String estehs = "Es Teh (4000)";
                    System.out.println("|| 4. Teh Anget         (2000)      ||");
                    int tehanget = 2000;
                    String tehangets = "Teh Anget (2000)";
                    System.out.println("|| 5. Tidak Terimakasih             ||");
                    System.out.println("||==================================||\n\r");
                    System.out.print("Pilih : ");
                    minum = in.nextInt();
                    System.out.println("=================================\n\r");
                    int diskon = 0; //diskon jika memiliki Kartu Member
                    if (minum == 1) {
                        System.out.println("Anda Memilih " + nrames + "\n\r" + esjeruks);
                        System.out.println("=================================\n\r");
                        total = diskon + rames + esjeruk;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 2) {
                        System.out.println("Anda Memilih " + nrames + "\n\r" + jerukangets);
                        System.out.println("=================================\n\r");
                        total = diskon + rames + jerukanget;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 3) {
                        System.out.println("Anda Memilih " + nrames + "\n\r" + estehs);
                        System.out.println("=================================\n\r");
                        total = diskon + rames + esteh;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 4) {
                        System.out.println("Anda Memilih " + nrames + "\n\r" + tehangets);
                        System.out.println("=================================\n\r");
                        total = diskon + rames + tehanget;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else {
                        System.out.println("Anda Memilih " + nrames);
                        System.out.println("=================================\n\r");
                        total = diskon + rames;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    }
                } else {
                    System.out.println("Inputan Anda Salah !");
                }
            } else if (pilih == 2) {
                System.out.println("Apakah Anda Ingin membuat Kartu Member?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak\n\r");
                System.out.print("Pilih : ");
                buat = in.nextInt(); //inputan buat Kartu Member pada Scanner in
                System.out.println("=================================\n\r");
                if (buat == 1){
                    System.out.println("===Maaf, database belum dibuat===");
                    System.out.println("Makan disini apa dibawa pulang?");
                    System.out.println("1. Makan disini");
                    System.out.println("2. Dibawa Pulang\n\r");
                    System.out.print("Pilih : ");
                    makan = in.nextInt(); //inputan makan pada Scanner in
                    System.out.println("=================================\n\r");
                    if (makan == 1) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1){
                            System.out.println("Anda Memilih "+nrames+"\n\r" +esjeruks+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + esjeruk;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2){
                            System.out.println("Anda Memilih "+nrames+"\n\r"+jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + jerukanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3){
                            System.out.println("Anda Memilih "+nrames+"\n\r"+estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + esteh;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4){
                            System.out.println("Anda Memilih "+nrames+"\n\r"+tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + tehanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih "+nrames+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    } else if (makan == 2) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1) {
                            System.out.println("Anda Memilih " + nrames + "\n\r" + esjeruks+ " +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + esjeruk;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2) {
                            System.out.println("Anda Memilih " + nrames + "\n\r" + jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + jerukanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3) {
                            System.out.println("Anda Memilih " + nrames + "\n\r" + estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + esteh;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4) {
                            System.out.println("Anda Memilih " + nrames + "\n\r" + tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + tehanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih " + nrames+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    }
                } else if (buat == 2) {
                    System.out.println("Makan disini apa dibawa pulang?");
                    System.out.println("1. Makan disini");
                    System.out.println("2. Dibawa Pulang\n\r");
                    System.out.print("Pilih : ");
                    makan = in.nextInt(); //inputan makan pada Scanner in
                    System.out.println("=================================\n\r");
                    if (makan == 1) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1){
                            System.out.println("Anda Memilih "+nrames+"\n\r" +esjeruks+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + esjeruk;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2){
                            System.out.println("Anda Memilih "+nrames+"\n\r"+jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + jerukanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3){
                            System.out.println("Anda Memilih "+nrames+"\n\r"+estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + esteh;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4){
                            System.out.println("Anda Memilih "+nrames+"\n\r"+tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + tehanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih "+nrames+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    } else if (makan == 2) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1) {
                            System.out.println("Anda Memilih " + nrames + "\n\r" + esjeruks+ " +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + esjeruk;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2) {
                            System.out.println("Anda Memilih " + nrames + "\n\r" + jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + jerukanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3) {
                            System.out.println("Anda Memilih " + nrames + "\n\r" + estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + esteh;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4) {
                            System.out.println("Anda Memilih " + nrames + "\n\r" + tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames + tehanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih " + nrames+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + rames;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    }
                } else {
                    System.out.println("Inputan Anda Salah !"); //Kalimat ini tampil jika inputan Salah
                }
            } else {
                System.out.println("Input yang anda Masukkan Salah !"); //Kalimat ini tampil jika inputan Salah
            }
        } else if (menu == 2){
            System.out.println("Anda Memilih "+nuduk);
            System.out.println("Apakah Anda Memiliki Kartu member?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak\n\r");
            System.out.print("Pilih : ");
            pilih = in.nextInt(); //inputan pilih pada Scanner in
            System.out.println("=================================\n\r");
            if (pilih == 1) {
                System.out.println("Makan disini apa dibawa pulang?");
                System.out.println("1. Makan disini");
                System.out.println("2. Dibawa Pulang\n\r");
                System.out.print("Pilih : ");
                makan = in.nextInt(); //inputan makan pada Scanner in
                System.out.println("=================================\n\r");
                if (makan == 1) {
                    System.out.println("|| == Menyediakan Beberapa Minum == ||");
                    System.out.println("|| 1. Es Jeruk          (4000)      ||");
                    int esjeruk = 4000; //harga esJeruk
                    String esjeruks = "Es Jeruk (4000)";
                    System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                    int jerukanget = 3000;
                    String jerukangets = "Jeruk Anget (3000)";
                    System.out.println("|| 3. Es Teh manis      (4000)      ||");
                    int esteh = 4000;
                    String estehs = "Es Teh (4000)";
                    System.out.println("|| 4. Teh Anget         (2000)      ||");
                    int tehanget = 2000;
                    String tehangets = "Teh Anget (2000)";
                    System.out.println("|| 5. Tidak Terimakasih             ||");
                    System.out.println("||==================================||\n\r");
                    System.out.print("Pilih : ");
                    minum = in.nextInt();
                    System.out.println("=================================\n\r");
                    int diskon = 0; //diskon jika memiliki Kartu Member
                    if (minum == 1){
                        System.out.println("Anda Memilih "+nuduk+"\n\r" +esjeruks);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk + esjeruk;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 2){
                        System.out.println("Anda Memilih "+nuduk+"\n\r"+jerukangets);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk + jerukanget;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 3){
                        System.out.println("Anda Memilih "+nuduk+"\n\r"+estehs);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk + esteh;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 4){
                        System.out.println("Anda Memilih "+nuduk+"\n\r"+tehangets);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk + tehanget;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else {
                        System.out.println("Anda Memilih "+nuduk);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    }
                } else if (makan == 2) {
                    System.out.println("|| == Menyediakan Beberapa Minum == ||");
                    System.out.println("|| 1. Es Jeruk          (4000)      ||");
                    int esjeruk = 4000; //harga esJeruk
                    String esjeruks = "Es Jeruk (4000)";
                    System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                    int jerukanget = 3000;
                    String jerukangets = "Jeruk Anget (3000)";
                    System.out.println("|| 3. Es Teh manis      (4000)      ||");
                    int esteh = 4000;
                    String estehs = "Es Teh (4000)";
                    System.out.println("|| 4. Teh Anget         (2000)      ||");
                    int tehanget = 2000;
                    String tehangets = "Teh Anget (2000)";
                    System.out.println("|| 5. Tidak Terimakasih             ||");
                    System.out.println("||==================================||\n\r");
                    System.out.print("Pilih : ");
                    minum = in.nextInt();
                    System.out.println("=================================\n\r");
                    int diskon = 0; //diskon jika memiliki Kartu Member
                    if (minum == 1) {
                        System.out.println("Anda Memilih " + nuduk + "\n\r" + esjeruks);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk + esjeruk;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 2) {
                        System.out.println("Anda Memilih " + nuduk + "\n\r" + jerukangets);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk + jerukanget;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 3) {
                        System.out.println("Anda Memilih " + nuduk + "\n\r" + estehs);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk + esteh;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 4) {
                        System.out.println("Anda Memilih " + nuduk + "\n\r" + tehangets);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk + tehanget;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else {
                        System.out.println("Anda Memilih " + nuduk);
                        System.out.println("=================================\n\r");
                        total = diskon + uduk;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    }
                } else {
                    System.out.println("Inputan Anda Salah !");
                }
            } else if (pilih == 2) {
                System.out.println("Apakah Anda Ingin membuat Kartu Member?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak\n\r");
                System.out.print("Pilih : ");
                buat = in.nextInt(); //inputan buat Kartu Member pada Scanner in
                System.out.println("=================================\n\r");
                if (buat == 1){
                    System.out.println("===Maaf, database belum dibuat===");
                    System.out.println("Makan disini apa dibawa pulang?");
                    System.out.println("1. Makan disini");
                    System.out.println("2. Dibawa Pulang\n\r");
                    System.out.print("Pilih : ");
                    makan = in.nextInt(); //inputan makan pada Scanner in
                    System.out.println("=================================\n\r");
                    if (makan == 1) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1){
                            System.out.println("Anda Memilih "+nuduk+"\n\r" +esjeruks+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + esjeruk;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2){
                            System.out.println("Anda Memilih "+nuduk+"\n\r"+jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + jerukanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3){
                            System.out.println("Anda Memilih "+nuduk+"\n\r"+estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + esteh;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4){
                            System.out.println("Anda Memilih "+nuduk+"\n\r"+tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + tehanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih "+nuduk+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    } else if (makan == 2) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1) {
                            System.out.println("Anda Memilih " + nuduk + "\n\r" + esjeruks+ " +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + esjeruk;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2) {
                            System.out.println("Anda Memilih " + nuduk + "\n\r" + jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + jerukanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3) {
                            System.out.println("Anda Memilih " + nuduk + "\n\r" + estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + esteh;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4) {
                            System.out.println("Anda Memilih " + nuduk + "\n\r" + tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + tehanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih " + nuduk+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    }
                } else if (buat == 2) {
                    System.out.println("Makan disini apa dibawa pulang?");
                    System.out.println("1. Makan disini");
                    System.out.println("2. Dibawa Pulang\n\r");
                    System.out.print("Pilih : ");
                    makan = in.nextInt(); //inputan makan pada Scanner in
                    System.out.println("=================================\n\r");
                    if (makan == 1) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1){
                            System.out.println("Anda Memilih "+nuduk+"\n\r" +esjeruks+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + esjeruk;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2){
                            System.out.println("Anda Memilih "+nuduk+"\n\r"+jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + jerukanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3){
                            System.out.println("Anda Memilih "+nuduk+"\n\r"+estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + esteh;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4){
                            System.out.println("Anda Memilih "+nuduk+"\n\r"+tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + tehanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih "+nuduk+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    } else if (makan == 2) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1) {
                            System.out.println("Anda Memilih " + nuduk + "\n\r" + esjeruks+ " +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + esjeruk;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2) {
                            System.out.println("Anda Memilih " + nuduk + "\n\r" + jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + jerukanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3) {
                            System.out.println("Anda Memilih " + nuduk + "\n\r" + estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + esteh;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4) {
                            System.out.println("Anda Memilih " + nuduk + "\n\r" + tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk + tehanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih " + nuduk+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + uduk;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    }
                } else {
                    System.out.println("Inputan Anda Salah !"); //Kalimat ini tampil jika inputan Salah
                }
            } else {
                System.out.println("Input yang anda Masukkan Salah !"); //Kalimat ini tampil jika inputan Salah
            }
        } else if (menu == 3){
            System.out.println("Anda Memilih "+nkuning);
            System.out.println("Apakah Anda Memiliki Kartu member?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak\n\r");
            System.out.print("Pilih : ");
            pilih = in.nextInt(); //inputan pilih pada Scanner in
            System.out.println("=================================\n\r");
            if (pilih == 1) {
                System.out.println("Makan disini apa dibawa pulang?");
                System.out.println("1. Makan disini");
                System.out.println("2. Dibawa Pulang\n\r");
                System.out.print("Pilih : ");
                makan = in.nextInt(); //inputan makan pada Scanner in
                System.out.println("=================================\n\r");
                if (makan == 1) {
                    System.out.println("|| == Menyediakan Beberapa Minum == ||");
                    System.out.println("|| 1. Es Jeruk          (4000)      ||");
                    int esjeruk = 4000; //harga esJeruk
                    String esjeruks = "Es Jeruk (4000)";
                    System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                    int jerukanget = 3000;
                    String jerukangets = "Jeruk Anget (3000)";
                    System.out.println("|| 3. Es Teh manis      (4000)      ||");
                    int esteh = 4000;
                    String estehs = "Es Teh (4000)";
                    System.out.println("|| 4. Teh Anget         (2000)      ||");
                    int tehanget = 2000;
                    String tehangets = "Teh Anget (2000)";
                    System.out.println("|| 5. Tidak Terimakasih             ||");
                    System.out.println("||==================================||\n\r");
                    System.out.print("Pilih : ");
                    minum = in.nextInt();
                    System.out.println("=================================\n\r");
                    int diskon = 0; //diskon jika memiliki Kartu Member
                    if (minum == 1){
                        System.out.println("Anda Memilih "+nkuning+"\n\r" +esjeruks);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning + esjeruk;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 2){
                        System.out.println("Anda Memilih "+nkuning+"\n\r"+jerukangets);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning + jerukanget;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 3){
                        System.out.println("Anda Memilih "+nkuning+"\n\r"+estehs);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning + esteh;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 4){
                        System.out.println("Anda Memilih "+nkuning+"\n\r"+tehangets);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning + tehanget;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else {
                        System.out.println("Anda Memilih "+nkuning);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning;
                        System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    }
                } else if (makan == 2) {
                    System.out.println("|| == Menyediakan Beberapa Minum == ||");
                    System.out.println("|| 1. Es Jeruk          (4000)      ||");
                    int esjeruk = 4000; //harga esJeruk
                    String esjeruks = "Es Jeruk (4000)";
                    System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                    int jerukanget = 3000;
                    String jerukangets = "Jeruk Anget (3000)";
                    System.out.println("|| 3. Es Teh manis      (4000)      ||");
                    int esteh = 4000;
                    String estehs = "Es Teh (4000)";
                    System.out.println("|| 4. Teh Anget         (2000)      ||");
                    int tehanget = 2000;
                    String tehangets = "Teh Anget (2000)";
                    System.out.println("|| 5. Tidak Terimakasih             ||");
                    System.out.println("||==================================||\n\r");
                    System.out.print("Pilih : ");
                    minum = in.nextInt();
                    System.out.println("=================================\n\r");
                    int diskon = 0; //diskon jika memiliki Kartu Member
                    if (minum == 1) {
                        System.out.println("Anda Memilih " + nkuning + "\n\r" + esjeruks);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning + esjeruk;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 2) {
                        System.out.println("Anda Memilih " + nkuning + "\n\r" + jerukangets);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning + jerukanget;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 3) {
                        System.out.println("Anda Memilih " + nkuning + "\n\r" + estehs);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning + esteh;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else if (minum == 4) {
                        System.out.println("Anda Memilih " + nkuning + "\n\r" + tehangets);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning + tehanget;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    } else {
                        System.out.println("Anda Memilih " + nkuning);
                        System.out.println("=================================\n\r");
                        total = diskon + kuning;
                        System.out.println("Silahkan Langsung bayar dikasir\n\r");
                        System.out.println("=================================\n\r");
                        System.out.println("Anda Mendapat Diskon.\n\rTotal yang anda bayar : " + total); //hasil
                        System.out.println("=================================\n\r");
                    }
                } else {
                    System.out.println("Inputan Anda Salah !");
                }
            } else if (pilih == 2) {
                System.out.println("Apakah Anda Ingin membuat Kartu Member?");
                System.out.println("1. Ya");
                System.out.println("2. Tidak\n\r");
                System.out.print("Pilih : ");
                buat = in.nextInt(); //inputan buat Kartu Member pada Scanner in
                System.out.println("=================================\n\r");
                if (buat == 1){
                    System.out.println("===Maaf, database belum dibuat===");
                    System.out.println("Makan disini apa dibawa pulang?");
                    System.out.println("1. Makan disini");
                    System.out.println("2. Dibawa Pulang\n\r");
                    System.out.print("Pilih : ");
                    makan = in.nextInt(); //inputan makan pada Scanner in
                    System.out.println("=================================\n\r");
                    if (makan == 1) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1){
                            System.out.println("Anda Memilih "+nkuning+"\n\r" +esjeruks+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + esjeruk;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2){
                            System.out.println("Anda Memilih "+nkuning+"\n\r"+jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + jerukanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3){
                            System.out.println("Anda Memilih "+nkuning+"\n\r"+estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + esteh;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4){
                            System.out.println("Anda Memilih "+nkuning+"\n\r"+tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + tehanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih "+nkuning+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    } else if (makan == 2) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1) {
                            System.out.println("Anda Memilih " + nkuning + "\n\r" + esjeruks+ " +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + esjeruk;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2) {
                            System.out.println("Anda Memilih " + nkuning + "\n\r" + jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + jerukanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3) {
                            System.out.println("Anda Memilih " + nkuning + "\n\r" + estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + esteh;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4) {
                            System.out.println("Anda Memilih " + nkuning + "\n\r" + tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + tehanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih " + nkuning+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    }
                } else if (buat == 2) {
                    System.out.println("Makan disini apa dibawa pulang?");
                    System.out.println("1. Makan disini");
                    System.out.println("2. Dibawa Pulang\n\r");
                    System.out.print("Pilih : ");
                    makan = in.nextInt(); //inputan makan pada Scanner in
                    System.out.println("=================================\n\r");
                    if (makan == 1) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1){
                            System.out.println("Anda Memilih "+nkuning+"\n\r" +esjeruks+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + esjeruk;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2){
                            System.out.println("Anda Memilih "+nkuning+"\n\r"+jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + jerukanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3){
                            System.out.println("Anda Memilih "+nkuning+"\n\r"+estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + esteh;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4){
                            System.out.println("Anda Memilih "+nkuning+"\n\r"+tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + tehanget;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih "+nkuning+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning;
                            System.out.println("Silahkan Tunggu di Meja Makan yang sudah disediakan.\n\rBayar setelah makan\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    } else if (makan == 2) {
                        System.out.println("|| == Menyediakan Beberapa Minum == ||");
                        System.out.println("|| 1. Es Jeruk          (4000)      ||");
                        int esjeruk = 4000; //harga esJeruk
                        String esjeruks = "Es Jeruk (4000)";
                        System.out.println("|| 2. Jeruk Anget       (3000)      ||");
                        int jerukanget = 3000;
                        String jerukangets = "Jeruk Anget (3000)";
                        System.out.println("|| 3. Es Teh manis      (4000)      ||");
                        int esteh = 4000;
                        String estehs = "Es Teh (4000)";
                        System.out.println("|| 4. Teh Anget         (2000)      ||");
                        int tehanget = 2000;
                        String tehangets = "Teh Anget (2000)";
                        System.out.println("|| 5. Tidak Terimakasih             ||");
                        System.out.println("||==================================||\n\r");
                        System.out.print("Pilih : ");
                        minum = in.nextInt();
                        System.out.println("=================================\n\r");
                        int ppn = 1000; //tidak diskon jika tidak memiliki Kartu Member
                        if (minum == 1) {
                            System.out.println("Anda Memilih " + nkuning + "\n\r" + esjeruks+ " +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + esjeruk;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 2) {
                            System.out.println("Anda Memilih " + nkuning + "\n\r" + jerukangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + jerukanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 3) {
                            System.out.println("Anda Memilih " + nkuning + "\n\r" + estehs+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + esteh;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else if (minum == 4) {
                            System.out.println("Anda Memilih " + nkuning + "\n\r" + tehangets+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning + tehanget;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        } else {
                            System.out.println("Anda Memilih " + nkuning+" +PPN");
                            System.out.println("=================================\n\r");
                            total = ppn + kuning;
                            System.out.println("Silahkan Langsung bayar dikasir\n\r");
                            System.out.println("=================================\n\r");
                            System.out.println("Total yang anda bayar : " + total); //hasil
                            System.out.println("=================================\n\r");
                        }
                    }
                } else {
                    System.out.println("Inputan Anda Salah !"); //Kalimat ini tampil jika inputan Salah
                }
            } else {
                System.out.println("Input yang anda Masukkan Salah !"); //Kalimat ini tampil jika inputan Salah
            }
        } else {
            System.out.println("Input yang anda Masukkan Salah !");
        }
    }
}
