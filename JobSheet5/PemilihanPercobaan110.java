import java.util.Scanner;

public class PemilihanPercobaan110 {

    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);

        int angka;
        
        System.out.println("Masukkan angka: ");
        angka = input10.nextInt();

        String hasil =  (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Bilangan " + angka + " adalah bilangan " + hasil);

        input10.close();

    }
}