import org.apache.commons.lang3.text.StrTokenizer;

public class TokenHandler {
    private StrTokenizer tokenizer;

    public TokenHandler(String input) {
        this.tokenizer = new StrTokenizer(input);
    }

    public void setIgnoredCharacter(char ignoredChar) {
        /* write */ tokenizer.setIgnoredChar(ignoredChar);
    }

    public StrTokenizer getTokenizer() {
        return tokenizer;
    }
}
