import java.util.Scanner;

public class Registr {
    public static void registr_niz(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(str.toLowerCase());
    }

    public static void registr_vverh(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(str.toUpperCase());
    }
    public static void isLenght(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(str.length());
    }
}
