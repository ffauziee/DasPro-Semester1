import java.util.Scanner;

public class NestedLoop2341720138 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke- " + i);
            for (int j = 0; j < temps[0].length;j++) {
                System.out.println("Hari ke- " + (j + 1) + ":  ");
                temps[i][j] = input10.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double sum = 0.0;
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
                sum += temp;
            }
            double rata2 = sum / temps.length;
            System.out.println("Rata-rata: " + rata2);
            System.out.println();
        }
        input10.close();
    }
}
