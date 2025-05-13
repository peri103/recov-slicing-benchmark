public class Main {
    public static void main(String[] args) {
        // Create a course and a student
        Course course = new Course("Mathematics");
        Student student = new Student("Alice");

        // Enroll the student in the course
        course.enrollStudent(student);

        // Create a sparse matrix for the student
        double[][] sparseData = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        student.createSparseMatrix(sparseData);

        // Retrieve and print the sparse matrix
        /* read */ RealMatrix readSparseMatrix = student.getSparseMatrix();
        System.out.println("Sparse Matrix for " + student.getName() + ":");
        for (int i = 0; i < readSparseMatrix.getRowDimension(); i++) {
            for (int j = 0; j < readSparseMatrix.getColumnDimension(); j++) {
                System.out.print(readSparseMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }
    }
}