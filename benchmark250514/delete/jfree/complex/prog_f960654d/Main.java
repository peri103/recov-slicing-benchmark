import org.jfree.chart.title.Title;

public class Main {
    public static void main(String[] args) {
        Title title = new Title() {
            private String text;

            @Override
            public String getText() {
                return text;
            }

            @Override
            public void setText(String text) {
                this.text = text;
            }
        };

        // Additional code for complexity
        class Subtitle extends Title {
            private String subtitleText;

            @Override
            public String getText() {
                return subtitleText;
            }

            @Override
            public void setText(String text) {
                this.subtitleText = text;
            }
        }

        Subtitle subtitle = new Subtitle();
        subtitle.setText("Subtitle Example");

        int number = 42;
        int squaredNumber = number * number;
        System.out.println("Squared Number: " + squaredNumber);

        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        /* write */ title.setText("Hello, World!");

        double pi = 3.14159;
        double radius = 5.0;
        double area = pi * radius * radius;
        System.out.println("Area of circle: " + area);

        String subtitleText = subtitle.getText();
        System.out.println("Subtitle: " + subtitleText);

        /* read */ String value = title.getText();
        System.out.println(value);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
    }
}