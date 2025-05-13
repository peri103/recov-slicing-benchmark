import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("Mathematics");
        course.addInterval(0.0, 10.0);
        course.addInterval(20.0, 30.0);

        // Modify start value of the first interval
        List<IntervalMarkerWrapper> intervals = course.getIntervals();
        intervals.get(0).setStartValue(5.0);

        // Read the start value of the first interval
        /* read */ double startValue = intervals.get(0).getStartValue();
        System.out.println("Course: " + course.getCourseName() + ", Interval Start Value: " + startValue);

        // Calculate total range of intervals
        double totalRange = 0.0;
        for (IntervalMarkerWrapper interval : intervals) {
            totalRange += (interval.getEndValue() - interval.getStartValue());
        }
        System.out.println("Total Range: " + totalRange);
    }
}