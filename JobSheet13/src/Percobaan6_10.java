import java.util.Scanner;

public class Percobaan6_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();
        
        L= hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        vol = volume(p, l, t);
        System.out.println("Volume balok adalah " + vol);

        input.close();
    }

    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }

    static int volume (int pjg, int lb, int tng) {
        int Volume = pjg*lb*tng;
        return Volume;
    }

}
