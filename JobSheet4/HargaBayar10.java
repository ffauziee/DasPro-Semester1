import java.util.Scanner;

public class HargaBayar10 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String merkBuku;
    int harga, jumlah, halaman;
    double total, bayar, jmlDis, dis;

    System.out.print("Masukkan merk buku yang dibeli: ");
    merkBuku = input.nextLine();

    System.out.print("Masukkan harga buku yang dibeli: ");
    harga = input.nextInt();

    System.out.print("Masukkan jumlah halaman buku yang dibeli: ");
    halaman = input.nextInt();

    System.out.print("Masukkan jumlah barang yang dibeli: ");
    jumlah = input.nextInt();

    System.out.print("Masukkan jumlah diskon: ");
    dis = input.nextDouble();

    total = harga * jumlah;
    jmlDis = total * dis;
    bayar = total - jmlDis;

    System.out.println("Buku yang anda beli:" + merkBuku + "dengan jumlah halaman " + halaman);
    System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
    System.out.println("jumlah yang harus dibayar adalah: Rp." + bayar + "00,00");

    input.close();

}    
}
