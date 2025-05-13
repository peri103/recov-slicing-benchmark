public class Student {
    private String name;
    private TriangularMatrix grades;

    public Student(String name, int numberOfCourses) {
        this.name = name;
        this.grades = new TriangularMatrix(numberOfCourses);
    }

    public void setGrade(int courseIndex, double grade) {
        grades.setEntry(courseIndex, courseIndex, grade);
    }

    public double getGrade(int courseIndex) {
        return grades.getEntry(courseIndex, courseIndex);
    }
}
