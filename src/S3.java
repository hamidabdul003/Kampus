public class S3 {
    public static void main(String[] args) {
        int diagnosa = 1;
        switch (diagnosa) {
            case 1:
                System.out.println("Gejala : Demam, Batuk kering, kelelahan");
                break;
            case 2:
                System.out.println("Gejala : Nyeri Tenggorokan, hilang indera perasa dan penciuman");
                break;
            case 3:
                System.out.println("Gejala : Sesak nafas, nyeri dada, hilang kemampuan bicara atau bergerak");
                break;
            default:
                System.out.println("Tidak ada gejala");
        }
                if (diagnosa == 1) {
                    System.out.println("Hasil Diagnosa : Gejala umum ");
                } else if (diagnosa == 2) {
                    System.out.println("Hasil Diagnosa : Gejala tidak umum");
                } else if (diagnosa == 3) {
                    System.out.println("Hasil Diagnosa : Gejala Serius");
                } else {
                    System.out.println("Hasil Diagnosa : Tidak ada gejala");
                }
    }
}