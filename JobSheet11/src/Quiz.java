import java.util.Scanner;
import java.util.Random;

public class Quiz {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input10 = new Scanner(System.in);

        char menu = 'y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer =input10.nextInt();
                input10.nextLine();
                
                if (number == answer) {
                    success = true;
                    System.out.println("Tebakan anda benar");
                } else if (number < answer) {
                    System.out.println("Tebakan anda terlalu besar");
                } else {
                    System.out.println("Tebakan anda terlalu kecil");
                }

            } while(!success);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y): ");
            menu = input10.nextLine().charAt(0);
        }while (menu=='y'||menu=='Y');
        
        input10.close();
    }
}