import java.util.Scanner;

public class Percobaan3 {
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo;
        int tahun;

        System.out.print("Jumlah Saldo awal: ");
        saldo = sc.nextDouble();
        System.out.print("Lama investasi (Tahun): ");
        tahun = sc.nextInt();

        System.out.println("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.println(hitungLaba(saldo, tahun));

        sc.close(); 
    }
}
