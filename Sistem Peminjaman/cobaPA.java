import java.util.HashMap;
import java.util.Scanner;

public class cobaPA {
    static Scanner scanner = new Scanner(System.in);
    static String nama = "";
    static String noHP = "";
    static String NIK = "";
    static String[] barang = {"PlayStation 2", "PlayStation 3", "PlayStation 4"};
    static int[] harga = {45000, 75000, 100000};
    static int[] pesanan = new int[barang.length];
    static int[] lamaPeminjaman = new int[barang.length];
    static String[] barangDipesan = new String[barang.length];

    public static void main(String[] args) {
        menuUtama();
    }

    static void inputDataDiri() {
        System.out.println("Masukkan data diri:");
        System.out.print("Nama: ");
        nama = scanner.nextLine();
        System.out.print("No HP: ");
        noHP = scanner.nextLine();
        System.out.print("NIK: ");
        NIK = scanner.nextLine();

        System.out.println("\nData yang telah dimasukkan:");
        System.out.println("Nama: " + nama);
        System.out.println("No HP: " + noHP);
        System.out.println("NIK: " + NIK);

        System.out.println("\nApakah Anda ingin mengedit data diri? (ya/tidak)");
        String pilihan = scanner.nextLine();
        if (pilihan.equalsIgnoreCase("ya")) {
            inputDataDiri();
        }
    }

    static void listBarangHarga() {
        System.out.println("\nList Barang dan Harga:");
        for (int i = 0; i < barang.length; i++) {
            System.out.println("- " + barang[i] + ", " + harga[i] + "/hari");
        }
    }

    static void daftarHargaSewa() {
        System.out.println("\nList Barang dan Harga:");
        for (int i = 0; i < barang.length; i++) {
            System.out.println("- " + barang[i] + ", " + harga[i] + "/hari");
        }
        System.out.print("Kembali ke menu utama (ya/tidak) : ");
        String pilihan = scanner.nextLine();
        if (pilihan.equalsIgnoreCase("ya")) {
            menuUtama();
        }
    }


    static void menuUtama() {
        System.out.println("Selamat datang di Rental PlayStation Senin");

        while (true) {
            System.out.println("\nSilahkan pilih menu berikut");
            System.out.println("1. Input Data Diri");
            System.out.println("2. Sewa PlayStation");
            System.out.println("3. Daftar harga sewa harian");
            System.out.println("4. Keranjang Anda");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihanMenu = scanner.nextInt();
            scanner.nextLine();

            if (pilihanMenu == 1) {
                inputDataDiri();
            } else if (pilihanMenu == 2) {
                pesanBarang();
                break;
            } else if (pilihanMenu == 3) {
                daftarHargaSewa();
                break;
            } else if (pilihanMenu == 4) {
                keranjang();
                break;
            } else {
                System.out.println("Pilihan tidak valid, silakan pilih menu yang benar.");
            }
        }
    }

    static void keranjang() {
        while (true) {
        System.out.println("\nMenu Keranjang:");
        System.out.println("Barang yang Anda Pilih:");

        boolean adaBarang = false;
        for (int i = 0; i < barang.length; i++) {
            if (pesanan[i] > 0) {
                System.out.println("- " + barangDipesan[i] + " (" + pesanan[i] + " barang, " + lamaPeminjaman[i] + " hari)");
                adaBarang = true;
            }
        }
        if (!adaBarang) {
            System.out.println("Tidak ada barang yang dipilih.");
        }

        System.out.print("Checkout Pesanan (ya/tidak) : ");
        String pilihan = scanner.nextLine();
        if (pilihan.equalsIgnoreCase("ya")) {
            cetakNota();
        } else if (pilihan.equalsIgnoreCase("tidak")){
            menuUtama();
        }
        }
    }

    static void pesanBarang() {
        listBarangHarga();
    System.out.print("Masukkan jumlah barang yang ingin dipesan: ");
    int jumlah = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < jumlah; i++) {
        System.out.print("Pilih nomor barang yang ingin disewa (1-" + barang.length + "): ");
        int nomorBarang = scanner.nextInt();
        scanner.nextLine();

        if (nomorBarang >= 1 && nomorBarang <= barang.length) {
            System.out.print("Masukkan jumlah barang seri " + barang[nomorBarang - 1] + " yang ingin disewa: ");
            int jumlahSeri = scanner.nextInt();
            scanner.nextLine();

            pesanan[nomorBarang - 1] += jumlahSeri;
            barangDipesan[nomorBarang - 1] = barang[nomorBarang - 1]; // Menyimpan nama barang yang dipilih

            System.out.print("Masukkan lama sewa (hari) untuk seri " + barang[nomorBarang - 1] + ": ");
            lamaPeminjaman[nomorBarang - 1] = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Nomor barang tidak valid.");
            i--; // Mengulangi input untuk nomor barang yang tidak valid
        }
    }
    }

    static void cetakNota() {
        System.out.println("\nNota Sewa PlayStation:");
        System.out.println("Nama: " + nama);
        System.out.println("No HP: " + noHP);
        System.out.println("NIK: " + NIK);
        System.out.println("Jumlah Barang:");

        System.out.println("\nBarang yang Disewa:");
    boolean adaBarang = false;
    for (int i = 0; i < barang.length; i++) {
        if (pesanan[i] > 0) {
            System.out.println("- " + barang[i] + " (" + pesanan[i] + " barang, " + lamaPeminjaman[i] + " hari)");
            adaBarang = true;
        }
    }
    if (!adaBarang) {
        System.out.println("Tidak ada barang yang disewa.");
    }

    int totalHarga = 0;
    for (int i = 0; i < barang.length; i++) {
        if (pesanan[i] > 0) {
            int subtotal = pesanan[i] * harga[i] * lamaPeminjaman[i];
            totalHarga += subtotal;
        }
    }

    System.out.println("\nTotal yang harus dibayar: Rp " + totalHarga);
    }

    
}
