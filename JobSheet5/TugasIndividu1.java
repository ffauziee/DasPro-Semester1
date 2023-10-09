import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double jarak;
        String senjata;

        System.out.println("Masukkan jarak pertempuran anda (dalam satuan meter): ");
        jarak = sc.nextDouble();

        senjata = (jarak <= 5) ? "Melee weapon" : "Range weapon";
        
        System.out.println("Anda disarankan menggunakan " + senjata + " Karena anda bertempur pada jarak " + jarak + " Meter");

        sc.close();
    }
}
