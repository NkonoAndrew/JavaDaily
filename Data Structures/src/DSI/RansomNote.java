package DSI;

import java.util.HashMap;
import java.util.Map;

//Given two strings ransomNote and magazine, return true if
// ransomNote can be constructed by using the letters from magazine and false otherwise.
//
//Each letter in magazine can only be used once in ransomNote.
//Input: ransomNote = "aa", magazine = "aab"
//Output: true
public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println(canConstruct(ransomNote, magazine));
    }

    // Takes a String, and returns a HashMap with counts of
    // each character.
    public static Map<Character, Integer> makeCountsMap(String s) {
        int stringLength = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stringLength ; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        // Check for obvious fail case.
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> ransomMap = makeCountsMap(ransomNote);
        Map<Character, Integer> magazineMap = makeCountsMap(magazine);


            // For each unique character, c, in the ransom note:
            // Check that the count of char in the magazine is equal
            // or higher than the count in the ransom note.

        for (char c: ransomMap.keySet()) {
            int magazineCount = magazineMap.getOrDefault(c, 0);
            int ransomCount = ransomMap.get(c);

            if (magazineCount < ransomCount){
                return false;
            }

        }

        return true;


    }
}
