package School.management.system;
import java.util.*;
public class upm1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Sebuah Angka : ");
        int n = in.nextInt();
        for (int i=0;i<=n;i++)
        {
            if (i%2==1){
                System.out.println(i+", ini adalah angka ganjil");
            } else{
                System.out.println(i+", ini adalah angka genap");
            }
        } System.out.println("\nHidup Unindra Jaya!");
    }
}
