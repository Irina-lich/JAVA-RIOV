import java.util.Scanner;

public class FirstNoDuplicat {
    public static void isFirstNoDuplicat(){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                System.out.println(c);
                break;
            }
        }
    }
}
