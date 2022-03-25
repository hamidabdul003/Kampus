import java.util.Scanner;

public class Pertemuan {
    static void pertemuan11(){
        //int a = 1;
        int i=0;
        do{
            i++;
            System.out.println(i);
        }
        while (i<=10);
    }

    static void pertemuan11_2(){

        Scanner masuk= new Scanner(System.in);
        int m;
        float n, jumlah, x, rata;
        System.out.print("Banyaknya Data : ");
        n = masuk.nextFloat();
        jumlah = 0;
        m=1;
        do {
            System.out.print("Data ke-"+m+" : ");
            x=masuk.nextFloat();
            jumlah+=x;
            m++;
        } while (m<=n);
        {
            System.out.println("Rata - rata : "+jumlah/n);
        }
    }
    public static void main (String[] args){
    pertemuan11_2();
    }
}
