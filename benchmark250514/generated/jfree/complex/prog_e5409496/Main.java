import org.jfree.chart.LegendItem;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Example Legend");
        ArrayList<String> labels = new ArrayList<>();
        labels.add("Label 1");
        labels.add("Label 2");
        labels.add("Label 3");
        
        for (String label : labels) {
            System.out.println("Processing: " + label);
        }
        
        /* write */ legendItem.setLineVisible(true);
        
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            counter += i;
            if (counter % 2 == 0) {
                System.out.println("Counter is even: " + counter);
            }
        }
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        
        /* read */ boolean isVisible = legendItem.isLineVisible();
        System.out.println("Line visibility: " + isVisible);
        
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 5);
            System.out.println("Updated Number: " + numbers.get(i));
        }
        
        ArrayList<String> newLabels = new ArrayList<>(labels);
        newLabels.add("Label 4");
        
        for (String newLabel : newLabels) {
            System.out.println("New Label: " + newLabel);
        }
    }
}