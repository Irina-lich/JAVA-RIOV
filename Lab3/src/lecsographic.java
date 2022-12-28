import java.util.Scanner;
public class lecsographic {
    public static void isLecsographic1(){

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String str2 = scan2.nextLine();

        int result = str1.compareTo(str2);
        System.out.println(result);
    }
    public static void isLecsographic2(){

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        String str1 = scan1.nextLine();
        String str2 = scan2.nextLine();

        int resultt = str1.compareToIgnoreCase(str2);
        System.out.println(resultt);
    }
}
