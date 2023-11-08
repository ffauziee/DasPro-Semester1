import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.println("Masukkan nilai N: ");
        int N = input10.nextInt();
        int i = 0;
        while(i <= N) {
            int j = 0;
            while(j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        input10.close();
    }
}
