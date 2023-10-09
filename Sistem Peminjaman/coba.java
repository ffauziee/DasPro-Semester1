import java.util.Scanner;
public class coba {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, barang, NIM;
        int lamaPeminjaman;
        double denda, biayaSewa = 5000;

        System.out.print("Masukkan nama anda: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM anda: ");
        NIM = input.nextLine();
        System.out.println("Barang yang tersedia:");
        System.out.println("1. tenda");
        System.out.println("2. kompor");
        System.out.println("3. gas portabel");
        System.out.print("Masukkan nama barang yang di pinjam: ");
        barang = input.nextLine();
        System.out.print("Masukkan lama peminjaman (dalam hari): ");
        lamaPeminjaman = input.nextInt();

        if (lamaPeminjaman > 7) {
        denda = (lamaPeminjaman - 7) * 1000;
        } else {
            denda = 0;
        }

        double totalBiaya = biayaSewa * lamaPeminjaman + denda;

        System.out.println("==== Bukti Peminjaman Barang=====");
        System.out.println("Nama Peminjam: " + nama);
        System.out.println("ID peminjam: " + NIM);
        System.out.println("Barang yang di pinjam: " + barang);
        System.out.println("Lama peminjaman: " + lamaPeminjaman + "hari");
        System.out.println("Biaya sewa: Rp" + biayaSewa + "/hari");
        System.out.println("Denda: " + denda);
        System.out.println("Total biaya: " + totalBiaya);

    }
}