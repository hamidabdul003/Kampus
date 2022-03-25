import java.util.Scanner;

public class pernyataanjika {
    static void Latihan1_if(){
        int nilai;
        Scanner in = new Scanner(System.in);
        System.out.println("======Mencari Lulus dan Gagal======");
        System.out.print("Masukkan Nilai Anda : ");
        nilai = in.nextInt();
        if (nilai >= 80) {
            System.out.println("Memuaskan ");
        } else if (nilai >= 60) {
            System.out.println("Cukup, tingkatkan lagi");
        } else {
            System.out.println(" Anda Gagal (Coba lagi !!!!) \n");
        }
    }

    static void Latihan2_indexnilai(){
        double tugas, uts,uas, nilaiTotal;
        String nilaiHuruf;
        Scanner in = new Scanner(System.in);

        System.out.println("======Mencari Index Nilai======");
        System.out.print("Masukkan Nilai Tugas : ");
        tugas = in.nextFloat();
        tugas *= 0.2; //tugas = tugas * 0.2
        System.out.println("Point Tugas Anda Adalah "+tugas);
        System.out.print("Masukkan Nilai UTS : ");
        uts = in.nextFloat();
        uts *= 0.3;
        System.out.println("Point UTS Anda adalah : "+uts);
        System.out.print("Masukkan Nilai UAS : ");
        uas = in.nextFloat();
        uas *= 0.5;
        System.out.println("Point UAS Anda adalah : "+uas+"\n");

        System.out.println("======Total Nilai Anda=======");
        nilaiTotal = tugas + uts + uas;
        System.out.printf("Jumlah Nilai Total Point Anda : %.2f \n",nilaiTotal);

        if (nilaiTotal>80){
            nilaiHuruf = "A";
        } else if (nilaiTotal>70){
            nilaiHuruf = "B";
        } else if (nilaiTotal>60){
            nilaiHuruf = "C";
        } else {
            nilaiHuruf = "E";
        } System.out.println("Nilai Anda Adalah : "+nilaiHuruf);
    }

    static void Latihan3_Sales(){
        String Nama,Pesan;
        double Jual, Bonus;
        Scanner in = new Scanner(System.in);
        System.out.println("======Menghitung Bonus======");
        System.out.print("Masukkan Nama Anda : ");
        Nama = in.nextLine();
        System.out.print("Masukkan Penjualan Anda Sebulan : ");
        Jual = in.nextDouble();
        System.out.print("\n");
        if (Jual>100000){
            Bonus=0.1*Jual;
            Pesan="Selamat !!";
        } else {
            Bonus=0;
            Pesan="Anda Harus Lebih Giat Lagi";
        } System.out.println("Saudara "+Nama);
        System.out.println("Bonus Anda Sebesar : "+Bonus);
        System.out.println(Pesan);
    }

    static void Latihan4_GanjilGenap(){
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("======Bilangan Ganjil Genap======");
        System.out.print("Masukkan Nilai : ");
        a = in.nextInt();
        if (a % 2==0){
            System.out.println("Nilai Tersebut adalah Bilangan Genap");
        } else {
            System.out.println("Nilai Tersebut adalah Bilangan Ganjil");
        }
    }

    static void Latihan5_ifdalamif(){
        double hargaSewaDVD = 5000, jumlahDVD, denda = 0.1, hargaTotal, lamaSewa, dendaNya;
        Scanner in = new Scanner(System.in);

        System.out.println("======Sewa DVD======");
        System.out.print("Masukkan Jumlah DVD : ");
        jumlahDVD = in.nextFloat();
        if (jumlahDVD <= 5) {
            System.out.print("Masukkan Lama Sewa : ");
            lamaSewa = in.nextFloat();
            if (lamaSewa <= 3) {
                hargaTotal = hargaSewaDVD * jumlahDVD;
                System.out.println("Harga Total yang harus Anda Bayar adalah : " + hargaTotal);
            } else {
                dendaNya = (hargaSewaDVD * jumlahDVD) * denda;
                hargaTotal = (hargaSewaDVD * jumlahDVD) + dendaNya;
                System.out.println("Denda Anda Adalah : " + dendaNya);
                System.out.println("harga plus denda Anda Adalah : " + hargaTotal);
            }
        } else {
            System.out.println("DVD Anda terlalu Banyak !!");
        }
    }

    public static void main (String [] args){
        Latihan1_if();
    }
}
