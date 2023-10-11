package src;

import java.util.Scanner;

public class ForKelipatan10 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0;

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        for (int i = 0; i < 100; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;

        
                }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("total bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);

        scan.close();
    }
}
