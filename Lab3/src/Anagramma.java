import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Anagramma {
    public static void isAnagramma(){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        fillMap(map1);
        fillMap(map2);

        if (map1.keySet().size() != map2.keySet().size()) {
            System.out.println("Это не анограмма");
        } else {
            Set<Character> keys = map1.keySet();
            for (Character c : keys) {
                if (!map1.get(c).equals(map2.get(c))) {
                    System.out.println("Это не анограмма");
                    return;
                }
            }
            System.out.println("Это анограмма");
        }
    }
    private static void fillMap(HashMap<Character, Integer> map) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int value = map.get(str.charAt(i)) + 1;
                map.put(str.charAt(i), value);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
    }
}
