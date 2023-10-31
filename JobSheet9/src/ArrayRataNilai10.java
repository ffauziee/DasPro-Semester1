import java.util.Scanner;

public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlahMhs = input10.nextInt();

        int [] nilaiMhs = new int[jumlahMhs];
        int mhsLulus = 0, mhsTdkLulus = 0;
        double total1 = 0, total2 = 0;
        double rata1 = 0, rata2 = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i +1) + " : ");
            nilaiMhs[i] = input10.nextInt();
        }

        for (int i=0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                total1 += nilaiMhs[i];
                mhsLulus++;
                System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " lulus!");
            } else {
                total2 += nilaiMhs[i];
                mhsTdkLulus++;
                System.out.println("Nilai akhir mahasiswa ke-" + (i+1) + " tidak lulus!");
            }
        }
        
        rata1 = total1 / mhsLulus;
        rata2 = total2 / mhsTdkLulus;
        System.out.println("\nRata-rata nilai lulus = " + rata1);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2);

        input10.close();
        
    }    
}
