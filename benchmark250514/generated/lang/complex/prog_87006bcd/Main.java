import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StrBuilder builder = new StrBuilder();
        List<String> stringList = new ArrayList<>();
        
        builder.append("Hello");
        builder.append(" World");
        stringList.add(builder.toString());

        builder.appendSeparator(",");
        builder.append(" Apache");
        
        StrBuilder anotherBuilder = new StrBuilder();
        anotherBuilder.append("Commons");
        anotherBuilder.append(" Lang");

        stringList.add(anotherBuilder.toString());

        for (String str : stringList) {
            System.out.println(str);
        }

        /* write */ builder.appendSeparator(",");
        builder.append(" Text");
        builder.append(" Utilities");

        int length = builder.length();
        System.out.println("Length of builder: " + length);

        anotherBuilder.append(" Library");

        /* read */ String result = builder.toString();
        System.out.println(result);

        int anotherLength = anotherBuilder.length();
        System.out.println("Length of anotherBuilder: " + anotherLength);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("String at index " + i + ": " + stringList.get(i));
        }
    }
}