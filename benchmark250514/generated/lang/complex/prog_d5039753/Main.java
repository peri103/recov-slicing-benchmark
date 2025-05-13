import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("hello world");
        /* write */ strBuilder.reverse();

        // Additional unrelated code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int number : numbers) {
            map.put("key" + number, number);
        }

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }

        System.out.println("Sum of squares: " + sum);

        // More unrelated code
        StrBuilder anotherStrBuilder = new StrBuilder("Complexity");
        anotherStrBuilder.append(" is fun!");
        anotherStrBuilder.deleteCharAt(0);
        String anotherString = anotherStrBuilder.toString();
        System.out.println(anotherString);

        // Final read operation
        /* read */ String reversedString = strBuilder.toString();
        System.out.println(reversedString);
    }
}