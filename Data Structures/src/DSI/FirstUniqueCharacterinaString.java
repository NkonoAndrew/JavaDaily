package DSI;
//Input: s = "loveleetcode"
//Output: 2
import java.util.HashMap;

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));

    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int stringLength = s.length();

        for (int i = 0; i < stringLength ; i++) {
            char stringCharacters = s.charAt(i);
            map.put(stringCharacters, map.getOrDefault(stringCharacters, 0) + 1);
        }

        for (int i = 0; i < stringLength ; i++) {
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }


}

