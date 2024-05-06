import java.util.Scanner;

public class startMenu {
    public void startMenu(){
        userRegister register = new userRegister();
        userLogIn logIn = new userLogIn();
        Scanner in = new Scanner(System.in);

        System.out.println("Ayeger || Bir blogdan daha fazlasi\n");

        System.out.println("1. Giris yap");
        System.out.println("2. Kaydol"+ "\n");

        int choose = in.nextInt();
        System.out.println("\n");

        if(choose==1){
            String tempLogUsername = logIn.userNamelogIn();
            String tempLogPassword = logIn.passwordLogIn();
            System.out.println("Hosgeldiniz, Sayin " + tempLogUsername+ "\n");
        }
        else if (choose==2){
            String tempRegUsername = register.userNameRegister();
            String tempRegPassword = register.passwordRegister();
            System.out.println("Kayit islemi basari ile gerceklestirildi. Lutfen giris yapiniz." + "\n");
        }
        else 
        System.out.println("Lutfen menudeki secenekleri sadece sayi girerek seciniz!!!");
    }
}
