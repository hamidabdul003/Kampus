package School.management.system;
import java.util.*;
public class upm2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan banyaknya angka : ");
        int n = in.nextInt();
        int  i, j;
        System.out.println("===================================\n");
        for (i=1;i<=n;i++){
            for (j=1;j<=i;j+=2) {
                System.out.print((j-1)%n+1);
            } for (j=i-1;j>=1;j++){
                System.out.print(j);
            } System.out.println("");
        }
    }
}
