import java.util.Scanner;

public class userRegister {
    public String passwordRegister(){
        Scanner in = new Scanner(System.in);
        userDataTypes user1 = new userDataTypes();
        
        System.out.println("Lutfen sifrenizi belirleyiniz...");
        user1.password = in.nextLine();
        System.out.println("\n");
        return user1.password;
    }

    public String userNameRegister(){
        Scanner in = new Scanner(System.in);
        userDataTypes user1 = new userDataTypes();
        
        System.out.println("Lutfen kullanici adinizi belirleyiniz...");
        user1.username = in.nextLine();
        System.out.println("\n");
        return user1.username;
    }
}
