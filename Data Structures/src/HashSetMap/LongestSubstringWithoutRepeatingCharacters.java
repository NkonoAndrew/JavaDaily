package HashSetMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int stringLength = s.length();
        int backPointer = 0;
        int frontPointer = 0;
        int max = 0;

        while (frontPointer < stringLength){
            if (!set.contains(s.charAt(frontPointer))){
                set.add(s.charAt(frontPointer));
                max = Math.max(set.size(), max);
                frontPointer++;
            } else {
                set.remove(s.charAt(backPointer));
                frontPointer++;

            }
        }
        return max;

    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
