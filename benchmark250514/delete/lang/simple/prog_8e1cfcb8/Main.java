import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello World");
        StrMatcher matcher = StrMatcher.charSetMatcher(new char[] {' '});
        /* write */ tokenizer.setTokenMatcher(matcher);
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}