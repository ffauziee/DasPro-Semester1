import java.util.Scanner;
public class BioskopWithScanner_10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            System.out.print("Pilih menu (1/2/3): ");
            int PilihanMenu = input10.nextInt();
            input10.nextLine(); 

            switch (PilihanMenu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = input10.nextLine();
                    do {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = input10.nextInt();
                        input10.nextLine();
                        if (baris < 1 || baris > 4) {
                            System.out.println("Nomor baris tidak tersedia. Harap masukkan nomor baris antara 1 - 4.");
                        }
                    } while (baris < 1 || baris > 4);
                    do {
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = input10.nextInt();
                        input10.nextLine();
                        if (kolom < 1 || kolom > 2) {
                            System.out.println("Nomor kolom tidak tersedia. Harap masukkan nomor kolom antara 1 - 2.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");

                            System.out.print("Masukkan baris (1-4): ");
                            baris = input10.nextInt();
                            input10.nextLine();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = input10.nextInt();
                            input10.nextLine();
                        }
                    } while (kolom < 1 || kolom > 2 || penonton[baris - 1][kolom - 1] != null);
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil dimasukkan.");
                    break;
                case 2:
                System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int a = 0; a < penonton[i].length; a++) {
                            if (penonton[i][a] == null) {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (a + 1) + ": ***");
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (a + 1) + ": " + penonton[i][a]);
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih. Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1, 2, atau 3.");
            }
            System.out.print("Lanjutkan? (y/n): ");
            String selanjutnya = input10.nextLine();
            if (selanjutnya.equalsIgnoreCase("n")) {
                break;
            }
        }

        input10.close();
    }
}