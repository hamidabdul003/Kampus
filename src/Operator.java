public class Operator {
    static void Latihan4_Aritmatika() {
        int a = 25;
        int b = 10;
        System.out.println("Penggunaan Operator Aritmatika ");
        System.out.println("Nilai Awal a adalah     : " +a);
        System.out.println("Nilai Awal b adalah     : " +b);
        System.out.println("Hasil dari a + b adalah : " +(a + b));
        System.out.println("Hasil dari a - b adalah : " +(a - b));
        System.out.println("Hasil dari a / b adalah : " +(a / b));
        System.out.println("Hasil dari a * b adalah : " +(a * b));
        System.out.println("Hasil dari a % b adalah : " +(a % b)+"\n");
    }

    static void Latihan5_IncrementDecrement() {
        int i = 1;
        System.out.println("Nilai dari i adalah   : " + i);
        System.out.println("Nilai dari ++i adalah : " + ++i);
        System.out.println("Nilai dari i++ adalah : " + i++);
        System.out.println("Nilai dari i adalah   : " + i);
        System.out.println("Nilai dari --i adalah : " + --i);
        System.out.println("Nilai dari i-- adalah : " + i--);
        System.out.println("Nilai dari i adalah   : " + i+"\n");
    }

    static void Latihan6_Assigment(){
        int var = 10;
        int a,b,c;
        a = b = c = 100;
        int d,e,f;
        f = 200;
        e = f;
        d = e;
        System.out.println("Nilai var      : " + var);
        System.out.println("Nilai a adalah : " + a);
        System.out.println("Nilai b adalah : " + b);
        System.out.println("Nilai c adalah : " + c);
        System.out.println("Nilai f adalah : " + f);
        System.out.println("Nilai e adalah : " + e);
        System.out.println("Nilai d adalah : " + d);

        int z;
        char Teks1 = 'a'; //dalam Unicode character 'a' direpresentasikan dengan
        // angka 97
        z = Teks1 * a; //z = 97 * 100
        System.out.println("Nilai Teks1    : " + Teks1);
        System.out.println("Nilai z adalah : " + z+"\n");
    }

    static void Latihan7_Relasi() {
        int x,y,z;
        x = 100;
        y = 99;
        z = 99;
        System.out.println("Nilai x adalah : " + x);
        System.out.println("Nilai y adalah : " + y);
        System.out.println("Nilai z adalah : " + z + "\n");
        //Operator Sama dengan (==)
        System.out.println("operator sama dengan (==)");
        System.out.println("Perbandingan antara y dan z");
        if (y == z) {
            System.out.println("y sama dengan z\n");
        } else {
            System.out.println(" y tidak sama dengan z");
        }
        //Operator tidak sama dengan (!=)
        System.out.println("operator tidak sama dengan (!=)");
        System.out.println("Perbandingan antara x dan y");
        if (y != z) {
            System.out.println("x tidak sama dengan y");
        } else {
            System.out.println("x sama dengan y \n");
        }
        //Operator Lebih besar (>)
        System.out.println("operator Lebih besar (>)");
        System.out.println("Perbandingan antara x dan y");
        if (x > y) {
            System.out.println("x lebih besar dari y\n");
        } else {
            System.out.println("x lebih kecil dari y \n");
        }
        //Operator Lebih kecil (<)
        System.out.println("Operator Lebih kecil (<)");
        System.out.println("Perbandingan antara x dan y");
        if (x < y) {
            System.out.println("y lebih kecil dari x");
        } else {
            System.out.println("y lebih besar dari x \n");
        }
        //Operator lebih besar dari atau sama dengan
        System.out.println("Operator lebih besar dari atau sama dengan (>=)");
        System.out.println("Perbandingan antara x dan y");
        if (x >= y) {
            System.out.println("x lebih besar dari atau sama dengan y\n");
        } else {
            System.out.println("x lebih kecil dari atau sama dengan y ");
        }
        //Operator lebih kecil dari atau sama dengan
        System.out.println("Operator lebih kecil dari atau sama dengan (<=)");
        System.out.println("Perbandingan antara y dan x");
        if (y <= x) {
            System.out.println("y lebih kecil dari atau sama dengan x");
        } else {
            System.out.println("y lebih besar dari atau sama dengan x\n");
        }
    }

    static void Latihan8_logik(){
        boolean BENAR = true;
        boolean SALAH = false;
        System.out.println("Hubungan OR (||)");
        System.out.println("Benar || Benar : " +(BENAR || BENAR));
        System.out.println("Benar || Salah : " +(BENAR || SALAH));
        System.out.println("Salah || Benar : " +(SALAH || BENAR));
        System.out.println("Salah || Salah : " +(SALAH || SALAH)+"\n");

        System.out.println("Hubungan AND (&&)");
        System.out.println("Benar && Benar : " +(BENAR && BENAR));
        System.out.println("Benar && Salah : " +(BENAR && SALAH));
        System.out.println("Salah && Benar : " +(SALAH && BENAR));
        System.out.println("Salah && Salah : " +(SALAH && SALAH)+"\n");

        System.out.println("Hubungan NOT (!)");
        System.out.println("Kebalikan (NOT) dari Benar adalah : "+!BENAR);
        System.out.println("Kebalikan (NOT) dari Salah adalah : "+!SALAH+"\n");
    }

    public static void main(String[] args){
        Latihan4_Aritmatika();
    }
}
