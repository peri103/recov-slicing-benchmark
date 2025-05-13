import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        String str = "apple,banana,cherry";
        StrTokenizer tokenizer = new StrTokenizer(str);

        /* write */ tokenizer.setDelimiterChar(',');

        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}