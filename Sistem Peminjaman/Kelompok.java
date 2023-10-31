import java.util.Scanner;

public class cobacoba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        double totalHarga = 0;
        
        do {
            System.out.println("\nSelamat datang di Sistem Rental PlayStation Dabest\n");
            System.out.println("### Pilih Opsi Anda ###\n");
            System.out.println("1. Daftar PlayStation Tersedia");
            System.out.println("2. Peminjaman PlayStation");
            System.out.println("3. Total Harga Sewa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1/2/3/4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    daftarBarangTersedia();
                    break;
                case 2:
                    totalHarga += pinjamBarang();
                    break;
                case 3:
                    System.out.println("Total Harga: Rp." + totalHarga);
                    break;
                case 4:
                    System.out.println("Terima kasih telah datang ke rental kami.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        } while (pilihan != 4);

        input.close();

    }

    static void daftarBarangTersedia() {
        System.out.println("\nDaftar Barang Tersedia:\n");
        System.out.println("1. PlayStation 2 - Rp. 30000/hari");
        System.out.println("2. PlayStation 3 - Rp. 40000/hari");
        System.out.println("3. PlayStation 4 - Rp. 50000/hari");
        System.out.println("4. PlayStation 5 - Rp. 65000/hari");
    }

    static double pinjamBarang() {
        Scanner input = new Scanner(System.in);
        String nama, nomor;
        int nomorBarang;
        int durasi;
        double harga = 0;

        System.out.print("Masukkan Nama Anda: ");
        nama = input.nextLine();

        System.out.print("Masukkan Nomor Handphone anda: ");
        nomor = input.nextLine();

        System.out.print("Masukkan nomor barang yang ingin dipinjam: ");
        nomorBarang = input.nextInt();

        System.out.print("Masukkan durasi peminjaman (hari): ");
        durasi = input.nextInt();

        switch (nomorBarang) {
            case 1:
                harga = 30000 * durasi;
                break;
            case 2:
                harga = 40000 * durasi;
                break;
            case 3:
                harga = 50000 * durasi;
                break;
            case 4:
                harga = 65000 * durasi;            
                break;
            default:
                System.out.println("Nomor barang tidak valid.");
        }

        input.close();

        if (harga > 0) {
            System.out.println("\n################################");
            System.out.println("# Bukti Peminjaman PlayStation #");
            System.out.println("################################\n");
            System.out.println("Nama: " + nama);
            System.out.println("Nomor: " + nomor);
            System.out.println("Barang yang disewa: " + nomorBarang);
            System.out.println("Waktu Peminjaman: " + durasi + " hari");
            System.out.println("Total harga peminjaman: Rp." + harga);
        }

        return harga;
    }
}

