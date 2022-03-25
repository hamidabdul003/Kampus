import java.util.Scanner;

public class latihan1 {
    public static void main(String [] args){
        int a,b,nilai;
        String lampu,A,B,C ;
        System.out.println("======Program Hitung Nilai Mapel======");
        Scanner in = new Scanner(System.in);
        A = "Mapel Logika Matematika";
        System.out.println("1. Mapel Logika Matematika");
        B = "Mapel Agama";
        System.out.println("2. Mapel Agama");
        C = "Mapel Simulasi Digital";
        System.out.println("3. Mapel Simulasi Digital");
        System.out.print("Masukkan Nomor Mapel : ");
        lampu=in.nextLine();
        switch (lampu){
            case "1":
                System.out.println("Anda Memilih "+A);
                System.out.print("Masukkan Nilai : ");
                nilai = in.nextInt();
                if (nilai < 100 & nilai >=85) {
                    System.out.println("Nilai : "+nilai + " - index = A");
                } else if (nilai < 85 & nilai >= 75){
                    System.out.println("Nilai : "+nilai + " - index = B");
                } else if (nilai < 75 & nilai >= 55){
                    System.out.println("Nilai : "+nilai + " - index = C");
                } else if (nilai < 55 & nilai >=45){
                    System.out.println("Nilai : "+nilai + " - index = D");
                } else {
                    System.out.println("Nilai : "+nilai + " - Index = F");
                }
                break;
                    case "2":
                        System.out.println("Anda Memilih "+B);
                        System.out.print("Masukkan Nilai : ");
                        nilai = in.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai Harus diantara 0 - 100");
                            System.exit(0);
                        }
                        if (nilai < 100 & nilai >=85) {
                            System.out.println("Nilai : "+nilai + " - index = A");
                        } else if (nilai < 85 & nilai >= 75){
                            System.out.println("Nilai : "+nilai + " - index = B");
                        } else if (nilai < 75 & nilai >= 55){
                            System.out.println("Nilai : "+nilai + " - index = C");
                        } else if (nilai < 55 & nilai >=45){
                            System.out.println("Nilai : "+nilai + " - index = D");
                        } else {
                            System.out.println("Nilai : "+nilai + " - Index = F");
                        }
                        break;
                    case "3":
                        System.out.println("Anda Memilih "+C);
                        System.out.print("Masukkan Nilai : ");
                        nilai = in.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai Harus diantara 0 - 100");
                            System.exit(0);
                        }
                        if (nilai < 100 & nilai >=85) {
                            System.out.println("Nilai : "+nilai + " - index = A");
                        } else if (nilai < 85 & nilai >= 75){
                            System.out.println("Nilai : "+nilai + " - index = B");
                        } else if (nilai < 75 & nilai >= 55){
                            System.out.println("Nilai : "+nilai + " - index = C");
                        } else if (nilai < 55 & nilai >=45){
                            System.out.println("Nilai : "+nilai + " - index = D");
                        } else {
                            System.out.println("Nilai : "+nilai + " - Index = F");
                        }
                        break;
                    default:
                        System.out.print("Inputan yang anda Masukkan Salah");
            }
        }
    }

