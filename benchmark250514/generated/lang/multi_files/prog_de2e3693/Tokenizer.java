import org.apache.commons.lang3.text.StrTokenizer;

public class Tokenizer {
    private StrTokenizer tokenizer;

    public Tokenizer(String str) {
        this.tokenizer = new StrTokenizer(str);
    }

    public void setDelimiter(char delimiter) {
        /* write */ tokenizer.setDelimiterChar(delimiter);
    }

    public String getNextToken() {
        return tokenizer.nextToken();
    }
}