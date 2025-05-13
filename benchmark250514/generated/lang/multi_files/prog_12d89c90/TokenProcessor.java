import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;

public class TokenProcessor {
    private StrTokenizer tokenizer;
    private ArrayList<String> tokenList = new ArrayList<>();

    public TokenProcessor(String input) {
        tokenizer = new StrTokenizer(input);
    }

    public void setDelimiter(String delimiter) {
        /* write */ tokenizer.setDelimiterString(delimiter);
    }

    public void processTokens() {
        while (tokenizer.hasNext()) {
            tokenList.add(tokenizer.nextToken());
        }
    }

    public ArrayList<String> getTokenList() {
        return tokenList;
    }
}
