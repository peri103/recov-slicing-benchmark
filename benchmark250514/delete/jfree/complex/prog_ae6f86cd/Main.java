import org.jfree.chart.title.Title;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Title title = new Title();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        
        /* write */ title.setText("Hello, World!");
        
        for (int i = 0; i < 5; i++) {
            stringList.add("String " + i);
            intList.add(i * 10);
        }
        
        for (String str : stringList) {
            System.out.println(str);
        }
        
        int sum = 0;
        for (Integer num : intList) {
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);
        
        /* read */ String text = title.getText();
        System.out.println(text);
        
        for (int i = 0; i < intList.size(); i++) {
            intList.set(i, intList.get(i) + 5);
        }
        
        for (Integer num : intList) {
            System.out.println(num);
        }
    }
}