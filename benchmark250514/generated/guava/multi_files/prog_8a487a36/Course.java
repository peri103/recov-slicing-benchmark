import com.google.common.collect.MinMaxPriorityQueue;

public class Course {
    private MinMaxPriorityQueue<String> courses = MinMaxPriorityQueue.create();

    public void addCourse(String courseName) {
        /* write */ courses.add(courseName);
    }

    public String getFirstCourse() {
        /* read */ return courses.peek();
    }
}
