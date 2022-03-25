public class tugas4_pemrog3 {
    public static void main(String[] args) {
        tugas4_pemrog3 pemrog = new tugas4_pemrog3();
        System.out.println("===== Pemrograman 3_1 =====");
        pemrog.pemrog3_1();
        System.out.println("===== Pemrograman 3_2 =====");
        pemrog.pemrog3_2();
        System.out.println("===== Pemrograman 3_3 =====");
        pemrog.pemrog3_3();
    }
    void pemrog3_1(){
        String Kalimat = "Pemrograman Java ";
        for (int e = 0 ; e <= Kalimat.length() ; e = e + 1){
            System.out.println(Kalimat.substring(e));
        }
    }

    void pemrog3_2(){
        String Kalimat = "Pemrograman Java ";
        for (int e = 0 ; e <= Kalimat.length() ; e++){
            System.out.println(Kalimat.substring(e,e+1));
            if (e == 15){
                break ;
            }
        }
    }

    void pemrog3_3(){
        String Kalimat = "Pemrograman Java";
        for (int e = Kalimat.length() - 1 ; e >= 0 ; e--){
            System.out.println(Kalimat.substring(e));
        }
    }
}
