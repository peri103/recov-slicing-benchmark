import org.apache.commons.lang3.text.StrTokenizer;

public class TokenProcessor {
    private StrTokenizer tokenizer;

    public TokenProcessor(StrTokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public String processNextToken() {
        /* read */ return tokenizer.nextToken();
    }

    public void processAllTokens() {
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            System.out.println("Processed Token: " + token);
        }
    }
}