package School.management.system;

import java.util.Scanner;

public class testis {
    public static void main (String[] args){
        Scanner User = new Scanner(System.in);
        int nilai;
        String matkul, algoritma, pemrograman;

        System.out.print("Masukkan Mata Kuliah (algoritma/pemrograman) : ");
        matkul = User.nextLine();
        switch (matkul) {
            case ("algoritma"):
                System.out.println("Masukkan Nilai : ");
                nilai = User.nextInt();
                if (nilai <= 69) {
                    System.out.println("Logika Kurang Baik");
                } else {
                    System.out.println("Logika Baik");
                }

                break;
            case ("pemrograman"):
                System.out.println("Masukkan Nilai : ");
                nilai = User.nextInt();
                if (nilai <= 50) {
                    System.out.println("Penguasaan Program sangat kurang");
                } else if (nilai <= 74) {
                    System.out.println("Penguasaan Program Kurang");
                } else {
                    System.out.println("Penguasaan Program Baik");
                }
        }
    }
}

