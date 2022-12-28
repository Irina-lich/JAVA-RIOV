import java.util.Scanner;

public class RemoveDublcate {
    public static void isRemoveDublicate(){

        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        String result = "";

        for (int i = 0; i < original.length(); i++) {
            if (result.indexOf(original.charAt(i)) == -1) {
                result = result + original.charAt(i);
            }
        }
        System.out.println(result);
    }
}
