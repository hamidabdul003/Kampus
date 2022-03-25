package School.management.system;

import java.util.Scanner;

public class Uas3No1 {
    public static void main (String[] args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Digit Terakhir NPM Anda : "); int npm=abc.nextInt();
        System.out.println(fungsi(npm));
    }
    static int fungsi(int a){
        if (a==0) return 3;
        else return 2*fungsi(a-1)-3;
    }
}
