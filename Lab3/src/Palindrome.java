import java.util.Scanner;
public class Palindrome {
    public static void isPalindrome(){
        System.out.println("Введите фразу");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("Введенная фраза: " + str);

        StringBuilder original = new StringBuilder(str);
        original.reverse();

        String str2 = original.toString();

        if (str2.equals(str)){
            System.out.println("Is a palindrome");
        }
        else {
            System.out.println("Is not a palindrome");
        }
    }
}
