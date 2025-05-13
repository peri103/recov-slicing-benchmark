import org.jfree.chart.title.Title;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Assuming Title is a class that has setText and getText methods
        Title title = new Title();
        ArrayList<String> textHistory = new ArrayList<>();
        
        /* write */ title.setText("Hello, World!");
        
        // Unrelated complex logic
        for (int i = 0; i < 5; i++) {
            title.setText("Iteration " + i);
            textHistory.add(title.getText());
        }
        
        // More complex logic with another class
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of squares: " + sum);
        
        // Unrelated complex logic
        StringBuilder builder = new StringBuilder();
        for (String text : textHistory) {
            builder.append(text).append(", ");
        }
        
        System.out.println("Text history: " + builder.toString());

        /* read */ String text = title.getText();
        
        System.out.println("Final title text: " + text);
    }
}