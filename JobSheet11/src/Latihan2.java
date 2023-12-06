import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nilai n : ");
        int n = sc.nextInt();

        if (n<5){
            System.out.println("Masukkan angka lebih dari 5");
        } else {
            for (int i= n; i>=1;i--){
                for (int j= 1; j<=i; j++) {
                    System.out.print("*");
            }System.out.println();
        } 
    }sc.close();
  }  
}