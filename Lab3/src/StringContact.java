import java.util.Scanner;

public class StringContact {
    public static void isStringContact(){
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String str2 = scan2.nextLine();

        System.out.println(str1.concat(" ").concat(str2));
    }
}
