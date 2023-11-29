import java.util.Scanner;

public class TugasIndividu {

    static int[][] nilaiTugas = new int[5][7];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        System.out.println("Silahkan pilih menu");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampilkan Nilai");
        System.out.println("3. Rata-rata hari Nilai tertinggi");
        System.out.println("4. Exit");
        pilihan = sc.nextInt();

        do {
        switch (pilihan) {
            case 1: inputData();
                break;

            case 2: tampilkanNilai();
                break;
        
            default:
            System.out.println("Menu yang anda pilih tidak valid!");
                break;
        }
        } while (pilihan != 4);

        sc.close();
    }
public static void inputData() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < nilaiTugas.length; i++) {
        for (int j = 0; j < nilaiTugas[i].length; j++) {
            System.out.print("Masukkan nilai tugas untuk siswa " + (i + 1) + " dan minggu ke " + (j + 1) + ": ");
            nilaiTugas[i][j] = sc.nextInt();
        }
    }
    sc.close();
}

public static void tampilkanNilai(){
    for (int i=0; i < nilaiTugas.length; i++) {
        System.out.println("Nilai Mahasiswa ke- " + (i+1)+ ": ");
        for (int j=0; j<nilaiTugas[i].length; j++){
            System.out.println(nilaiTugas[i][j]);
        }
    }
}

}
