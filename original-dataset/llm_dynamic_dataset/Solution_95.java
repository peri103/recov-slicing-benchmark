import java.util.*;

class Spellchecker {
   String changeVowel(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||
                    s.charAt(i) == 'e' ||
            s.charAt(i) == 'i' ||
            s.charAt(i) == 'o' ||
            s.charAt(i) == 'u') {
                sb.append('a');
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        Map<String, String> ori = new HashMap<>();
        Map<String, String> lowerCase = new HashMap<>();
        Map<String, String> vowel = new HashMap<>();

        for (int i = 0; i < wordlist.length; i++) {
            ori.put(wordlist[i], wordlist[i]);
            String lower = wordlist[i].toLowerCase();
            if (!lowerCase.containsKey(lower)) {
                lowerCase.put(lower, wordlist[i]);
            }

            String vowelString = changeVowel(wordlist[i]);
            if (!vowel.containsKey(vowelString)) {
                vowel.put(vowelString, wordlist[i]);
            }
        }

        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (ori.containsKey(queries[i])) {
                ans[i] = ori.get(queries[i]);
            } else if (lowerCase.containsKey(queries[i].toLowerCase())) {
                ans[i] = lowerCase.get(queries[i].toLowerCase());
            } else if (vowel.containsKey(changeVowel(queries[i]))) {
                ans[i] = vowel.get(changeVowel(queries[i]));
            } else {
                ans[i] = "";
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Spellchecker spellchecker = new Spellchecker();
        
        String[] wordlist = {"KiTe", "kite", "hare", "Hare"};
        String[] queries = {"kite", "Kite", "KiTe", "Hare", "HARE", "Hear", "hear", "keti", "keet", "keto"};
        
        String[] results = spellchecker.spellchecker(wordlist, queries);
        
        System.out.println("Spellcheck results:");
        for (String result : results) {
            System.out.println(result);
        }
    }
}