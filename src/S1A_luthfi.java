import java.util.Scanner;


public class S1A_luthfi{
    public static void main (String[] args){
        int makanan,tambahan,minuman,bungkus,total,harga;
        Scanner sedia = new Scanner(System.in);
        System.out.println("========restaurant========");
        System.out.println("====selamat datang di restaurant padang=======\n");
        System.out.println("====kami menyediakan beberapa menu makanan ====");
        System.out.println("1. rendang");
        System.out.println("2. daging cincang");
        System.out.println("3. ayam bakar");
        System.out.println("anda ingin membeli apa\n");
        makanan = sedia.nextInt();
        if (makanan ==1){
            System.out.println("Anda memilih rendang");
            System.out.println("Harga rendang Rp. 15000");
            harga = 15000;
            System.out.println("berapa bungkus yang anda inginkan?: ");
            bungkus = sedia.nextInt();
            if (bungkus >=1 ) {
                total = bungkus * 15000;
                System.out.println("Anda harus membayar :" + total);
            }
            } else if (makanan ==2){
                System.out.println("saya ingin membeli daging cincang");
                System.out.println("Harga daging cincang Rp. 20000");
                harga = 20000;
                System.out.println("berapa bungkus yang anda inginkan?: ");
                bungkus = sedia.nextInt();
                if (bungkus >=1 ){
                    total = bungkus * 20000;
                    System.out.println("Anda harus membayar :"+ total);
                }
            }else if (makanan ==3){
                System.out.println("saya ingin membeli ayam bakar");
                System.out.println("Harga daging cincang Rp. 20000");
                harga = 20000;
                System.out.println("berapa bungkus yang anda inginkan?: ");
                bungkus = sedia.nextInt();
                if (bungkus >=1 ){
                    total = bungkus * 20000;
                    System.out.println("Anda harus membayar :"+ total);
                }
            }
        }
    }