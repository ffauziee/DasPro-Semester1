import java.util.ArrayList;
import java.util.Scanner;

public class PinjamPS {

    static class Console {
        int id;
        boolean isRented;

        public Console(int id) {
            this.id = id;
            this.isRented = false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Console> consoles = new ArrayList<>();
        consoles.add(new Console(1));
        consoles.add(new Console(2));
        consoles.add(new Console(3));

        System.out.println("Selamat datang di PlayStation Rental System");

        while (true) {
            System.out.println("Silakan pilih opsi:");
            System.out.println("1. Rental PlayStation");
            System.out.println("2. Pengembalian PlayStation");
            System.out.println("3. Keluar");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    rentalPlayStation(scanner, consoles);
                    break;
                case 2:
                    returnPlayStation(scanner, consoles);
                    break;
                case 3:
                    System.out.println("Terima kasih atas kunjungan Anda!");
                    return;
                default:
                    System.out.println("Opsi tidak valid");
                    break;
            }
        }
    }

    private static void rentalPlayStation(Scanner scanner, ArrayList<Console> consoles) {
        System.out.println("Silakan masukkan nomor konsol yang ingin Anda sewa:");
        int consoleId = scanner.nextInt();
    
        Console selectedConsole = null;
        for (Console console : consoles) {
            if (console.id == consoleId && !console.isRented) {
                selectedConsole = console;
                break;
            }
        }
    
        if (selectedConsole == null) {
            System.out.println("Konsol yang ingin Anda sewa tidak tersedia");
            return;
        }
    
        System.out.println("Berapa hari Anda ingin menyewa konsol ini?");
        int rentalDays = scanner.nextInt();
    
        int rentalFee = calculateRentalFee(rentalDays);
    
        selectedConsole.isRented = true;
    
        System.out.println("Anda telah berhasil menyewa PlayStation dengan console " + consoleId + " selama " + rentalDays + " hari. Tarif sewa Anda adalah Rp " + rentalFee);
    }
    
    private static int calculateRentalFee(int rentalDays) {
        
        if (rentalDays > 7) {
        return 5000 + 1000 * (rentalDays - 1);
    }

    private static void returnPlayStation(Scanner scanner, ArrayList<Console> consoles) {
        System.out.println("Silakan masukkan nomor konsol yang ingin Anda kembalikan:");
        int consoleId = scanner.nextInt();

        Console selectedConsole = null;
        for (Console console : consoles) {
            if (console.id == consoleId && console.isRented) {
                selectedConsole = console;
                break;
            }
        }

        if (selectedConsole == null) {
            System.out.println("Konsol yang ingin Anda kembalikan tidak ditemukan");
            return;
        }

        selectedConsole.isRented = false;

        System.out.println("Terima kasih atas pengembalian konsol " + consoleId);
    }
}