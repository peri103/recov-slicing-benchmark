import org.jfree.chart.title.Title;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Title title = new Title() {
            private String text;

            @Override
            public void setText(String text) {
                this.text = text;
            }

            @Override
            public String getText() {
                return this.text;
            }
        };

        ArrayList<String> subtitleList = new ArrayList<>();
        subtitleList.add("Subtitle 1");
        subtitleList.add("Subtitle 2");

        for (String subtitle : subtitleList) {
            System.out.println("Processing subtitle: " + subtitle);
        }

        /* write */ title.setText("Chart Title");

        int counter = 0;
        for (int i = 0; i < 5; i++) {
            counter += i;
            System.out.println("Counter: " + counter);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        /* read */ String value = title.getText();
        System.out.println(value);

        for (int i = 0; i < numbers.size(); i++) {
            int doubled = numbers.get(i) * 2;
            System.out.println("Doubled: " + doubled);
        }
    }
}