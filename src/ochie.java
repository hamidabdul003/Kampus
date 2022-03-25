public class ochie {
    public static void main(String[] args) {
        ochie pendidikan = new ochie();
        System.out.println("===== SEKOLAH =====");
        pendidikan.Sekolah();
        System.out.println("===== KAMPUS =====");
        pendidikan.Campus();
    }
    void Sekolah(){
        String nama = "Taruna Bhakti";
        String jenjang = "SMK";
        System.out.println("Saya Bekerja di : "+nama);
        System.out.println("Jenjang Sekolah : "+jenjang);
        System.out.println(" ");
    }
    void Campus(){
        String nama = "Universitas Indraprasta PGRI";
        String jenjang = "S1";
        System.out.println("Nama kampus Saya adalah : "+nama);
        System.out.println("Jenjang Saya di Kampus : "+jenjang);
    }
}
