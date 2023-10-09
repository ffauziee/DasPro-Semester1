import java.util.Scanner;

public class PemilihanPercobaan210 {

    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        float uas, uts, kuis, tugas;

        System.out.print("Nilai UAS: ");
        uas = input10.nextFloat();
        System.out.print("Nilai UTS: ");
        uts =  input10.nextFloat();
        System.out.print("Nilai Kuis: ");
        kuis = input10.nextFloat();
        System.out.print("Nilai Tugas: ");
        tugas = input10.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total > 80 ? "A" :
        total > 73 && total <= 80 ? "B+" :
        total > 65 && total <= 73 ? "B" :
        total > 60 && total <= 65 ? "C+" :
        total > 50 && total <= 60 ? "C" :
        total > 39 && total <= 50 ? "D" :
        "E" ;

        System.out.println("Nilai Akhir: " + total + " sehingga Nilai anda adalah " + message);

        input10.close();

    }
}