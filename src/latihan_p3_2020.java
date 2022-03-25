public class latihan_p3_2020 {
    public static void main(String[] args) {
        String namaMhs[]={"Aham","Abdul","Hamid"};
        String kelas[]={"Reguler","Ekstensi","Reguler"};
        String Waktu[]={"Pagi","Pagi","Sore"};

        for (int i=0; i<namaMhs.length; i++){
            if (kelas[i].equals("Ekstensi")){
                Waktu[i]="Malam";
            } else {
                Waktu[i]="Pagi/Siang";

            }
        }
        System.out.println("DAFTAR NAMA MAHASISWA BARU");
        System.out.println("=========================");
        System.out.println("NO     NAMA    KELAS    WAKTU");
        System.out.println("=========================");
        for (int i=0; i<namaMhs.length; i++){
            System.out.println((i+1)+"      "+namaMhs[i]+"    "+kelas[i]+"       "+Waktu[i]);
        }
        System.out.println("");
    }
}
