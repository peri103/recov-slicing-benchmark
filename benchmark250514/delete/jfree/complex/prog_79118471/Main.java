import org.jfree.chart.title.Title;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Title title = new Title() {
            private String text;

            public void setText(String text) {
                this.text = text;
            }

            public String getText() {
                return this.text;
            }
        };

        ArrayList<String> messages = new ArrayList<>();
        messages.add("Initial Message");
        messages.add("Second Message");

        /* write */ title.setText("Hello, World!");
        
        for (String message : messages) {
            System.out.println("Processing message: " + message);
        }

        messages.add("Third Message");
        messages.add(title.getText());

        for (int i = 0; i < messages.size(); i++) {
            System.out.println("Message " + (i + 1) + ": " + messages.get(i));
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from 0 to 4: " + sum);

        /* read */ String value = title.getText();
        System.out.println(value);

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }

        System.out.println("Total sum of numbers: " + total);
    }
}