import com.google.common.collect.MinMaxPriorityQueue;

public class Course {
    private String courseName;
    private MinMaxPriorityQueue<Integer> grades;

    public Course() {
        grades = MinMaxPriorityQueue.create();
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addGrade(int grade) {
        /* write */ grades.offer(grade);
    }

    public int getTopGrade() {
        /* read */ Integer topGrade = grades.peek();
        return topGrade != null ? topGrade : 0;
    }
}
