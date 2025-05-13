import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StandardPieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator();
        NumberFormat numberFormat = NumberFormat.getInstance();
        
        // Some unrelated code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Decimal format example: " + decimalFormat.format(1234.567));

        // Another similar API pair usage
        StandardPieSectionLabelGenerator anotherLabelGenerator = new StandardPieSectionLabelGenerator();
        anotherLabelGenerator.setNumberFormat(decimalFormat);
        
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }
        
        /* write */ labelGenerator.setNumberFormat(numberFormat);
        
        NumberFormat anotherRetrievedFormat = anotherLabelGenerator.getNumberFormat();
        System.out.println("Another retrieved format: " + anotherRetrievedFormat.format(1234.567));
        
        // More unrelated code
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        /* read */ NumberFormat retrievedFormat = labelGenerator.getNumberFormat();
        System.out.println("Retrieved format is same as set: " + (retrievedFormat == numberFormat)); // Should print 'true'
    }
}