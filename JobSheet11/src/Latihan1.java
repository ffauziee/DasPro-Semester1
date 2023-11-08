import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.println("Masukkan nilai N (minimal 3): ");
        int n = input10.nextInt();

        if (n < 3) {
            System.out.println("Nilai N minimal 3");
        } else {
            for (int i = 0; i <= n; i++) {
                for (int j = n ; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k+ "");
                }
                System.out.println();
            }
        }
        
        input10.close();
    }
}
