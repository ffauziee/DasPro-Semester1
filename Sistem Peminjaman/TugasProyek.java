import java.util.ArrayList;
import java.util.Scanner;

public class TugasProyek {
    public static Scanner sc = new Scanner(System.in);

    static class konsol {

        String model;
        int jumlah;

        public konsol(String model, int jumlah){
        
        }

        public String getModel() {
            return model;
        }

        public int getJumlah() {
            return jumlah;
        }
        
    }

    static class rental {
        String namaPenyewa;
        konsol playStation;
        int tanggalSewa;
        int tanggalPengembalian;

        public rental(String namaPenyewa, konsol playStation, int tanggalSewa, int tanggalPengembalian){
            this.namaPenyewa = namaPenyewa;
            this.playStation = playStation;
            this.tanggalPengembalian = tanggalPengembalian;
            this.tanggalSewa = tanggalSewa;
        }
        
        public String getNama() {
            return namaPenyewa;
        }
        public konsol getPlaystation() {
            return playStation;
        }
        public int getHari() {
            return tanggalSewa;
        }
        public int getPengembalian() {
            return tanggalPengembalian;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        konsol ps2 = new konsol("PS2", 5);
        konsol ps3 = new konsol("PS3", 5);
        konsol ps4 = new konsol("PS4", 5);
        konsol ps5 = new konsol("PS5", 5);

        System.out.println("Selamat datang di Rental PlayStation Lek Sri");

        while (true) {
            System.out.println("\nSilahkan pilih menu berikut");
            System.out.println("1. Daftar Playstation tersedia");
            System.out.println("2. Sewa PlayStation");
            System.out.println("3. Pengembalian PlayStation");
            System.out.println("4. Daftar harga sewa harian");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan : ");

            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Barang Tersedia:\n");
                    System.out.println("1. PlayStation 2 - jumlah " + ps2.getJumlah());
                    System.out.println("2. PlayStation 3 - jumlah " + ps3.getJumlah());
                    System.out.println("3. PlayStation 4 - jumlah " + ps4.getJumlah());
                    System.out.println("4. PlayStation 5 - jumlah " + ps5.getJumlah());
                    break;
                case 2:
                    System.out.print("Masukkan nama anda: ");
                    String namaPenyewa = sc.next();

                    System.out.println("Pilih Seri PlayStation (1-5): ");
                    String playStationModel = sc.nextLine();
    
                    konsol selectedPlayStation = null;
                    


                case 3:
                    
                    break;
                case 4: daftarharga();
                    break;
            
                default:
                    break;
            }
        }
    }

    static void daftarharga() {
        System.out.println("\nDaftar harga Playstation harian:\n");
        System.out.println("1. PlayStation 2 - Rp. 30000/hari");
        System.out.println("2. PlayStation 3 - Rp. 40000/hari");
        System.out.println("3. PlayStation 4 - Rp. 50000/hari");
        System.out.println("4. PlayStation 5 - Rp. 65000/hari");
    }
    
}       
    

