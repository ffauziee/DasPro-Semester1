import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int [] nilaiMhs = new int[10];
        double total = 0;
        double ratarata = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke- " + (i +1) + " : ");
            nilaiMhs[i] = input10.nextInt();
        }

        for (int i=0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
            System.out.println("Nilai akhir mahasiswa ke-" + i + " lulus!");
            } else {
                System.out.println("Nilai akhir mahasiswa ke-" + i + " tidak lulus!");
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        ratarata = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + ratarata);
        
    }    
}
