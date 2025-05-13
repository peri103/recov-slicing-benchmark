import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}