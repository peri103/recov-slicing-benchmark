import org.apache.commons.math3.linear.SymmetricMatrix;

public class Main {
    public static void main(String[] args) {
        SymmetricMatrixOperations matrixOps = new SymmetricMatrixOperations(3);
        matrixOps.setMatrixEntry(1, 2, 5.0);

        MatrixReader matrixReader = new MatrixReader();
        SymmetricMatrix matrix = matrixOps.getMatrix();
        double value = matrixReader.readMatrixEntry(matrix, 1, 2);
        System.out.println("Value from symmetric matrix: " + value);

        Course course = new Course("Mathematics");
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        course.addStudent(student1);
        course.addStudent(student2);

        for (Student student : course.getStudents()) {
            System.out.println("Student: " + student.getName() + ", ID: " + student.getId());
        }
    }
}