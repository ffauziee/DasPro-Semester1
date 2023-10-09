import java.util.Scanner;
public class Segitiga10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int alas, tinggi;
            float luas;
            System.out.println("masukkan alas: ");
            alas = sc.nextInt();
            System.out.println("masukkan tinggi: ");
            tinggi = sc.nextInt();

            luas = alas * tinggi / 2;
            System.out.println("Luas segitiga: " + luas);
        }
    }
}
