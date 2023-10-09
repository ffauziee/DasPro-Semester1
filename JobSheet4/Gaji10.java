import java.util.Scanner;

public class Gaji10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk;
        double totgaji;
        int gaji, potGaji;

        System.out.println("Masukkan jumlah hari masuk kerja anda: ");
        jmlMasuk = input.nextInt();

        System.out.println("Masukkan jumlah hari tidak masuk kerja anda: ");
        jmlTdkMasuk = input.nextInt();

        System.out.println("Masukkan jumlah gaji anda: ");
        gaji = input.nextInt();

        System.out.println("Masukkan potongan gaji anda jika anda absen: ");
        potGaji = input.nextInt();


        totgaji=(jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);

        System.out.println("Gaji yang anda terima adalah Rp." + totgaji + "00,00");

        input.close();
    }
}
