import java.util.Scanner;

public class Pemilihan2Percobaan210 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan ukuran sudut 1: ");
        sudut1 = input10.nextFloat();
        System.out.print("Masukkan ukuran sudut 2: ");
        sudut2 = input10.nextFloat();
        System.out.print("Masukkan ukuran sudut 3: ");
        sudut3 = input10.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90)  || (sudut3 == 90)) {
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");}

            else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3)) {
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");}

            else if (sudut1 == sudut2 && sudut2 == sudut3) {
            System.out.println("Segetiga tersebut adalah segitiga sama sisi");}
            
            else
            System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
        System.out.println("Bukan segitiga");

        input10.close();
    }
}
