import java.util.Scanner;
public class Star {
    public static void main(String[] args) throws Exception {
        Scanner input10 = new Scanner(System.in);
        System.out.println("Masukkan nilai N = ");
        int N = input10.nextInt();

        for(int i=1; i <= N; i++) {
            System.out.print("*");
        }
        input10.close();
    }
}
