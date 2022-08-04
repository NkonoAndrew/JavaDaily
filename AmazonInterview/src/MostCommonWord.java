import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*Given a string paragraph and a string array of the banned words banned,
return the most frequent word that is not banned. It is guaranteed there
is at least one word that is not banned, and that the answer is unique.
The words in paragraph are case-insensitive and the answer should be returned in lowercase. */
//Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
//Output: "ball"
public class MostCommonWord {
    public static String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        String result = " ";

        //remove the punctuation and make string lowercase
        String[] sentence = paragraph.toLowerCase().split("\\W+");

        //add banned words to set
        for (int i = 0; i < banned.length ; i++) {
            set.add(banned[i]);
        }

        //add words to hashmap and count them
        for (String word: sentence ) {
            if (!set.contains(word)){
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (String word: map.keySet()) {
            if (map.get(word) > max){
                max = map.get(word);
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
