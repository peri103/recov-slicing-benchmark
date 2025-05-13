import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'!");
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}