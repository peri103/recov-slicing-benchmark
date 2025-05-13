import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator();
        NumberFormat format = NumberFormat.getInstance();
        /* write */ generator.setNumberFormat(format);
        /* read */ NumberFormat readFormat = generator.getNumberFormat();
        System.out.println(readFormat.equals(format)); // Should print true
    }
}