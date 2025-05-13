import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        LegendItemWrapper legendItemWrapper = new LegendItemWrapper("Sample Legend");
        legendItemWrapper.setSeriesIndex(5);

        PiePlot plot = new PiePlot();
        plot.setLabelGenerator(new StandardPieSectionLabelGenerator());
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        Course course = new Course("Math");
        course.addStudent(new Student("Alice", 1));
        course.addStudent(new Student("Bob", 2));

        for (Student student : course.getStudents()) {
            System.out.println("Student Name: " + student.getName() + ", ID: " + student.getStudentId());
        }

        /* read */ int seriesIndex = legendItemWrapper.getSeriesIndex();
        System.out.println("Legend Item Series Index: " + seriesIndex);
    }
}