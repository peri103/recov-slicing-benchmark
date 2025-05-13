import org.apache.commons.lang3.text.StrTokenizer;

public class FruitTokenizer {
    private StrTokenizer tokenizer;

    public FruitTokenizer(String fruits) {
        tokenizer = new StrTokenizer(fruits);
    }

    public void setDelimiter(String delimiter) {
        /* write */ tokenizer.setDelimiterString(delimiter);
    }

    public String getNextToken() {
        return tokenizer.nextToken();
    }
}
