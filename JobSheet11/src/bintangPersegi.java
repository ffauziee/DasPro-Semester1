import java.util.Scanner;

public class bintangPersegi {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.println("Masukkan nilai N: ");
        int n = input10.nextInt();

        for (int iOuter = 1; iOuter <= n; iOuter++) {
        for (int i = 0; i<= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        }

        input10.close();
    }
}
