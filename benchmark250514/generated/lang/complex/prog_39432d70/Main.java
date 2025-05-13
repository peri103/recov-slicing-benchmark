import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello World");
        ArrayList<String> tokensList = new ArrayList<>();
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        // Reset the tokenizer with a new string
        /* write */ tokenizer.reset("Hello World");
        
        // Simulate some unrelated operations
        String[] words = {"apple", "banana", "cherry", "date"};
        for (String word : words) {
            wordCount.put(word, word.length());
        }
        
        // Add tokens to the list
        tokensList.add("First Token");
        tokensList.add("Second Token");
        
        // Manipulate the HashMap
        for (String word : wordCount.keySet()) {
            System.out.println(word + " has " + wordCount.get(word) + " letters.");
        }
        
        // Add more tokens to the list
        tokensList.add("Third Token");
        tokensList.add("Fourth Token");
        
        // Read the next token from the tokenizer
        /* read */ String token = tokenizer.nextToken();
        System.out.println("Read token: " + token);
        
        // Further operations on tokensList
        for (String t : tokensList) {
            System.out.println("Token from list: " + t);
        }
    }
}