import java.util.Scanner;

public class Matrix_10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan ukuran baris matrix: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan ukuran kolom matrix: ");
        int kolom = scanner.nextInt();

        int[][] matrix1 = new int[baris][kolom];
        int[][] matrix2 = new int[baris][kolom];

        System.out.println("Masukkan nilai matriks pertama: ");
        inputNilaiMatrix(matrix1, scanner);
        

        System.out.println("Masukkan nilai matriks kedua: ");
        inputNilaiMatrix(matrix2, scanner);

        int[][] penjumlahanMatrix = new int[baris][kolom];
        int[][] selisihMatrix = new int[baris][kolom];

        hitungJumlahDanSelisih(matrix1, matrix2, penjumlahanMatrix, selisihMatrix, baris, kolom);

        System.out.println("Hasil Penjumlahan Matriks:");
        menampilkanMatrix(penjumlahanMatrix);

        System.out.println("\nHasil Selisih Matriks:");
        menampilkanMatrix(selisihMatrix);

        scanner.close();
    }

    public static void inputNilaiMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void hitungJumlahDanSelisih(int[][] matrix1, int[][] matrix2, int[][] penjumlahanMatrix,
            int[][] selisihMatrix, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                penjumlahanMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                selisihMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
    }

    public static void menampilkanMatrix(int[][] matrix) {
        for (int[] baris : matrix) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
}