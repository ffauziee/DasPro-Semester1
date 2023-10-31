import java.util.Scanner;

public class PinjamPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nomorHp, seriPlaystation;
        int lamaPeminjaman, seri, pilihan, barang;
        double harga = 0;
        double totalHarga = 0;

        System.out.println("##############################");
        System.out.println("##############################");
        System.out.println("##                          ##");
        System.out.println("## Selamat datang di rental ##");
        System.out.println("##          PS LekSri       ##");
        System.out.println("##                          ##");
        System.out.println("##############################");
        System.out.println("##############################");
        System.out.println("");
        System.out.println("");

        do {
            System.out.println("\nSilahkan pilih menu\n");
            System.out.println("1. Daftar PlayStation");
            System.out.println("2. Peminjaman PlayStation");
            System.out.println("3. Total Harga Sewa");
            System.out.println("4. Keluar");
            System.out.print("\nSilahkan pilih opsi (1/2/3/4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1: 
                System.out.println("\nDaftar PlayStation yang tersedia: ");
                System.out.println("1. PlayStation 2 : 2000/Jam ");
                System.out.println("2. PlayStation 3 : 4000/Jam ");
                System.out.println("3. PlayStation 4 : 7000/Jam ");
                System.out.println("4. PlayStation 5 : 14.000/Jam ");
                    break;
                case 2:
                System.out.println("Silahkan Masukkan identitas anda: ");
                System.out.print("Nama: ");
                nama = sc.nextLine();
                System.out.print("Nomor HP: ");
                nomorHp =sc.nextLine();
                System.out.print("Masukkan nomor barang yang ingin dipinjam: ");
                System.out.println("1. PlayStation 2 : 2000/Jam ");
                System.out.println("2. PlayStation 3 : 4000/Jam ");
                System.out.println("3. PlayStation 4 : 7000/Jam ");
                System.out.println("4. PlayStation 5 : 14.000/Jam ");
                barang = sc.nextInt();
                System.out.print("Masukkan durasi peminjaman (Jam): ");
                lamaPeminjaman = sc.nextInt();

                switch (barang) {
                    case 1:
                        
                        harga = 30000 * lamaPeminjaman;
                        break;
                    case 2:
                        harga = 40000 * lamaPeminjaman;
                        break;
                    case 3:
                        harga = 50000 * lamaPeminjaman;
                        break;
                    case 4:
                        harga = 65000 * lamaPeminjaman;            
                        break;
                    default:
                        System.out.println("Nomor barang tidak valid.");

                }
                  totalHarga += harga;
                
                case 3:
                    System.out.println("Total Harga sewa anda adalah: " + totalHarga);
                case 4:
                    System.out.println("Terimakasih telah menggunakan jasa sewa kami");
                    System.exit(0);
                default:
                System.out.println("pilihan anda tidak benar mohon pilih kembali. ");
            
            
                
            } 
              
        } while (pilihan !=4);

    }
}