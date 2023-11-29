import java.util.Scanner;

public class Kubus10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int volumeKubus = hitungVolumeKubus(sisi);
        int LuasPermukaanKubus = hitungLuasPermukaanKubus(sisi);

        System.out.println("Volume kubus adalah: " + volumeKubus);
        System.out.println("Luas permukaan kubus adalah: " + LuasPermukaanKubus);

        sc.close();
    }

    static int hitungVolumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    static int hitungLuasPermukaanKubus(int sisi) {
        return 6* sisi* sisi;
    }
}
