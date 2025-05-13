import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TokenProcessor processor = new TokenProcessor("Hello 'world'! This is a 'test'.");
        processor.processTokens();

        ArrayList<String> tokensList = processor.getTokensList();
        HashMap<String, Integer> tokenCountMap = processor.getTokenCountMap();

        /* read */ String firstToken = tokensList.get(0);
        System.out.println("First token: " + firstToken);

        System.out.println("All tokens and their counts:");
        for (String token : tokenCountMap.keySet()) {
            System.out.println("Token: " + token + ", Count: " + tokenCountMap.get(token));
        }
    }
}