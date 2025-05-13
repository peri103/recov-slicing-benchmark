import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("hello world");
        StrBuilder builder = new StrBuilder();
        
        ArrayList<String> tokensList = new ArrayList<>();
        builder.append("Initial Builder Content");
        
        tokenizer.setIgnoreEmptyTokens(true);
        tokenizer.setDelimiterChar(',');
        
        for (int i = 0; i < 3; i++) {
            builder.append(" Additional Content " + i);
        }
        
        /* write */ tokenizer.setTokenChar(' ');
        
        tokensList.add("First Token");
        tokensList.add("Second Token");
        
        for (String token : tokensList) {
            builder.append(token).append(" ");
        }
        
        String firstToken = tokensList.get(0);
        System.out.println("First token from list: " + firstToken);
        
        String secondToken = tokenizer.nextToken();
        System.out.println("Second token from tokenizer: " + secondToken);
        
        String builderContent = builder.toString();
        System.out.println("Builder Content: " + builderContent);
        
        /* read */ String token = tokenizer.nextToken();
        System.out.println("Read Token: " + token);
        
        tokensList.add(token);
        for (String t : tokensList) {
            System.out.println("Token from list: " + t);
        }
    }
}