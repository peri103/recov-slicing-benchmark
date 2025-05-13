import org.apache.commons.lang3.text.StrTokenizer;

public class TokenReader {
    private StrTokenizer tokenizer;

    public TokenReader(StrTokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public String readNextToken() {
        /* read */ return tokenizer.nextToken();
    }
}
