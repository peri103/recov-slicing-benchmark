import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a LegendManager and set a stroke
        LegendManager legendManager = new LegendManager("Sample Legend");
        legendManager.setStroke(2.0f);

        // Create a LegendAnalyzer to analyze the legend item
        LegendAnalyzer legendAnalyzer = new LegendAnalyzer(legendManager.getLegendItem());
        legendAnalyzer.analyze();

        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 22));

        // Print student details
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
        }

        // Create a list of colors
        List<Color> colorList = new ArrayList<>();
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.BLUE);

        // Print each color
        for (Color color : colorList) {
            System.out.println("Color: " + color);
        }
    }
}