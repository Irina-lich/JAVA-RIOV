import java.util.Scanner;

public class OdinakovDannye {
    public static void isOdinakovDannye(){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        System.out.println(str1.equals(str2));
    }
}
