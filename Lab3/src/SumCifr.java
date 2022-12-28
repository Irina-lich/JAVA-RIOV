import java.util.Scanner;

public class SumCifr {
    public static void isSumCifr() {
        Scanner scanner = new Scanner(System.in);
        // сумма всех цифр в строке
        String originalString = scanner.nextLine(); //d1k2alasj4fhfja6shf2jkas9
        int result = 0;

        String nums = originalString.replaceAll("[a-zA-Z]", "");  //124629
        for (char c : nums.toCharArray()) { // [1,2,4,6,2,9]
            String num = String.valueOf(c); // '1' -> "1"
            result += Integer.parseInt(num); // "1" -> 1
            // result += Integer.parseInt(String.valueOf(c)) // '1' -> "1" -> 1
        }
        System.out.println("Сумма = " + result);
    }

    public static void isTriPovtor(){
        Scanner scan = new Scanner(System.in);
        String originalString = scan.nextLine();
        String result = "";
        for (int i = 0; i < originalString.length() - 2; i++) {
            if (originalString.charAt(i) == originalString.charAt(i + 1) && originalString.charAt(i + 1) == originalString.charAt(i + 2)) {
                if (result.indexOf(originalString.charAt(i)) != -1) continue;
                result += originalString.charAt(i);
            }
        }

        System.out.println("Колво повторяющихся три раза символов : " + result.length());
    }
}