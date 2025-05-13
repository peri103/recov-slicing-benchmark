import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        String input = "value1,value2,value3";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        /* write */ tokenizer.setDelimiterString(",");
        
        /* read */ String token = tokenizer.nextToken();
        
        System.out.println(token);
    }
}