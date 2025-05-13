import org.apache.commons.lang3.text.StrTokenizer;

public class TokenProcessor {
    private StrTokenizer tokenizer;

    public TokenProcessor(StrTokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public String processNextToken() {
        if (tokenizer.hasNext()) {
            return tokenizer.nextToken();
        }
        return null;
    }
}
