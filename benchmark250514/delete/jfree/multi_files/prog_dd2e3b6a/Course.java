import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import java.text.NumberFormat;

public class Course {
    private String courseName;
    private StandardCategoryToolTipGenerator tooltipGenerator;

    public Course(String courseName) {
        this.courseName = courseName;
        this.tooltipGenerator = new StandardCategoryToolTipGenerator();
    }

    public void setCategoryFormat(NumberFormat format) {
        /* write */ tooltipGenerator.setCategoryFormat(format);
    }

    public NumberFormat getCategoryFormat() {
        /* read */ return tooltipGenerator.getCategoryFormat();
    }

    public String getCourseName() {
        return courseName;
    }
}
