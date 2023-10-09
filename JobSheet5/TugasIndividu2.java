import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "Admin1", correctPass = "1234", inputUser, inputPassword;

        System.out.println("Selamat datang");
        System.out.print("Silahkan Masukkan Username anda\t: ");
        inputUser = sc.nextLine();
        System.out.print("Masukkan Password anda\t\t: ");
        inputPassword = sc.nextLine();

       if (inputUser == correctUsername && inputPassword == correctPass) {

        System.out.println("Selamat Datang di aplikasi Admin123");
       } else {

        System.out.println("Maaf Password anda salah");
       }

        sc.close();
    }
}
