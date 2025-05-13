import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello World");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        StrBuilder anotherStrBuilder = new StrBuilder();
        anotherStrBuilder.append("Sum is: ").append(sum);

        /* write */ strBuilder.deleteFirst("Hello ");
        
        if (!anotherStrBuilder.isEmpty()) {
            System.out.println(anotherStrBuilder.toString());
        }

        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max number is: " + max);

        /* read */ String result = strBuilder.toString();
        System.out.println(result);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + " is: " + numbers.get(i));
        }
    }
}