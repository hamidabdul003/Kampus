import java.util.Scanner;
import javax.swing.*;

public class java_tutor {
    static void tutor1_switch(){
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Saatnya Liburan");
        }
    }

    static void tutor2_whileloop(){
        int i = 0;
        while (i <= 5){
            System.out.println(i);
            i++;
        }
    }

    static void tutor3_whileloop2(){
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i<5);
    }

    static void tutor4_javaworld(){
        String name ="Aham";
        System.out.println("My Name is "+name);
        /* Plus(+) is used to concatnate a value
        with a string
         */
        System.out.println(""+1+2+3); //dianggap sebagai string, karna string di awal, jadi si 123 ini dianggap string
        System.out.println(""+(1+2+3)); //kalau mau menambahkan pakai tanda kurung
        System.out.println(1+2+3+" "+1+2+3); //kalau tidak menggunakan tanda kurung, bisa ditaro di depan
        int y = 10,z=-20;
        System.out.println(+z);
    }

    static void tutor5_coba(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i>0);
    }

    static void tutor6_array1(){
        String[] nama = {"Linda", "santi", "Susan", "Mila", "Ayu"};
        for (int i =0; i<nama.length; i++){
            System.out.println("Nama Ke - "+i+": "+ nama[i]);
        }
    }

    static void tutor7_array2(){
        String[] buah = new String[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < buah.length; i++){
            System.out.print("Buah Ke - "+i+": ");
            buah[i] = in.nextLine();
        }
        System.out.println("======================");

        for (String b : buah ){
            System.out.println(b);
        }
    }

    static void tutor8_gajelas(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        for (int i=1;i<n;i++){
            if (((i % 3) == 0) && ((i % 5) == 0)){
                System.out.println("Abdul Hamid ");
            } else if ((i%3)==0){
                System.out.println("Abdul");
            } else if ((i%5)==0){
                System.out.println("Hamid");
            } else {
                System.out.println(i+" ");
            }
        }
    }
    static void tutor9_hitungkelilingjajargenjang(){
        Scanner in = new Scanner(System.in);
        System.out.println("Rumus menghitung jajargenjang :\n(2 x sisi pendek) + (2 x sisi panjang) \n");
        System.out.print("Masukkan Sisi Pendek  : ");
        int s = in.nextInt(); //s untuk short atau pendek
        System.out.print("Masukkan Sisi Panjang : ");
        int t = in.nextInt(); // t untuk tall atau panjang
        System.out.print("Masukkan Tinggi Jajar Genjang : ");
        int h = in.nextInt(); // h untuk high atau tinggi
        System.out.println("\nKeliling Jajargenjang tersebut adalah : "+((2*s)+(2*t))+" cm");
        System.out.println("||=================================||\n\r");
        System.out.println("Luas Jajargenjang tersebut adalah : "+(t*h)+" cm2");
        System.out.println("||=================================||\n\r");
    }

    static void tutor10_codejava82(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = in.nextInt();
        int i,j,x;
        for(i=(-n+1);i<n;i++){
            x=n-Math.abs(i);
            for (j=x;j<n;j++)
                System.out.print(" ");
            for (j=1;j<=x;j++)
                System.out.print("* ");
            System.out.println("");
        }
    }

    static void p8_1() {
        Scanner sc = new Scanner(System.in);
        char inputan;
        String nama;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Nilai : ");
        String s=sc.next();
        inputan= s.charAt(0);
        System.out.println("\n");        //enter s'byk 1 kolom
        switch(inputan) {
            case 'A':
                System.out.println(nama+" Nilai Anda memuaskan");
            break;
            case 'B':
                System.out.println(nama+" Nilai Anda bagus");
            break;
            case 'C':
                System.out.println(nama+" Nilai Anda cukup");
            break;
            default :
                System.out.println(nama+" Ngulang Tahun depan");
            break;
        }
    }

    static void p8_2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama  : ");
        String nama = in.nextLine();
        System.out.print("Masukkan NIM   : ");
        int nim = in.nextInt();
        System.out.print("Masukkan Nilai : ");
        int nilai = in.nextInt();
        switch ((90 <= nilai && nilai <= 100 ) ? 0 :
                (79 <= nilai && nilai <= 89) ? 1 :
                (60 <= nilai && nilai <= 78) ? 2 : 3) {
        case 0:
        System.out.println("Nilai Anda Sangat Bagus");
        break;
        case 1:
        System.out.println("Nilai Anda Bagus");
        break;
        case 2:
        System.out.println("Nilai Anda Cukup");
        break;
        case 3:
        System.out.println("Anda Gagal");
        break;
        }
    }


    public static void main(String[] args){
        p8_2();
    }
}