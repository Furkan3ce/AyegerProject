import java.util.Scanner;

public class userLogIn {
    public String userNamelogIn(){
        Scanner in = new Scanner(System.in);
        

        System.out.println("Kullanici Adinizi Giriniz:");
        String isUserName = in.nextLine();
        System.out.println("\n");

        return isUserName;
    }

    public String passwordLogIn(){
        Scanner in = new Scanner(System.in);
        

        System.out.println("Sifrenizi Giriniz:");
        String isPassword = in.nextLine();
        System.out.println("\n");

        return isPassword;
    }
    
}
