import java.util.Scanner;

public class TwoSumbols {
    public static void isTwoSumbols(){
        Scanner scan = new Scanner(System.in);
        String originalString = scan.nextLine();
        String firstTwo = originalString.substring(0, 2);

        boolean result = originalString.endsWith(firstTwo);
        System.out.println(result);
    }
}

