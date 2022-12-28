import java.util.Scanner;

public class Posledovat {
    public static void isPosledovat(){
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        if(!str1.contains(str2)) System.out.println("false");
        else System.out.println("true");
    }
}
