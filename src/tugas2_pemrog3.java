public class tugas2_pemrog3 {
    public static void main(String[] args) {
        String nama[]={"   Aham","  Abdul","  Hamid","Hamidun"};
        int nilai[]={92,82,72,60};
        String grade[]={"A","B","C","D"};
        String status[]={"Lulus","Lulus","Lulus","Mengulang"};

        for (int i=0; i<nilai.length; i++){
            if (nilai[i]>=85){
                grade[i]="A";
            } else if (nilai[i]>=75){
                grade[i]="B";
            } else if (nilai[i]>=65){
                grade[i]="C";
            } else {
                grade[i]="D";
            }
        }
        System.out.println("");
        System.out.println("  Nilai Ujian Mata Kuliah Pemrograman 3");
        System.out.println("=========================================");
        System.out.println("   NAMA   |   NILAI   |   GRADE   |   STATUS");
        System.out.println("=========================================");
        for (int i=0; i<nilai.length; i++){
            System.out.println(nama[i]+"   |   "+nilai[i]+"   |   "+grade[i]+"   |   "+status[i]);
        }
        System.out.println("");
    }
}
