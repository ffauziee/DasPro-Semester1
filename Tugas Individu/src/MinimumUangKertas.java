import java.util.Scanner;

public class MinimumUangKertas {
    public static void main(String[] args) {
        
        int[] denominasi = {1000, 500, 100, 50, 20, 10, 5, 1};
        
    
        Scanner input10 = new Scanner(System.in);
        System.out.print("Masukkan jumlah yang akan dibayar: $");
        int jumlah = input10.nextInt();
        
        
        int[] jumlahUangKertas = new int[8];
        
        
        for (int i = 0; i < denominasi.length; i++) {
            if (jumlah >= denominasi[i]) {
                jumlahUangKertas[i] = jumlah / denominasi[i];
                jumlah %= denominasi[i];
            }
        }
        
        System.out.println("Jumlah minimum uang kertas yang diperlukan:");
        for (int i = 0; i < denominasi.length; i++) {
            if (jumlahUangKertas[i] > 0) {
                System.out.println("$" + denominasi[i] + " x " + jumlahUangKertas[i]);
            }
        }
        
        input10.close();
    }
}
