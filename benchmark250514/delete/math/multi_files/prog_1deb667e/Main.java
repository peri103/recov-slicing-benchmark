import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        // Initialize matrix data
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        
        // Create and handle matrix
        MatrixHandler matrixHandler = new MatrixHandler();
        matrixHandler.createMatrix(data);
        
        // Create students and courses
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        
        Course math = new Course("Math");
        Course science = new Course("Science");
        
        // Enroll students in courses
        math.enrollStudent(alice);
        math.enrollStudent(bob);
        
        science.enrollStudent(alice);
        
        // Display enrolled students in Math course
        System.out.println("Students enrolled in Math:");
        for (Student student : math.getStudents()) {
            System.out.println(student.getName());
        }
        
        // Read the matrix back using the MatrixHandler class
        RealMatrix matrix = matrixHandler.getMatrix();
        /* read */ double[][] readData = matrix.getData();
        
        // Output the read data to verify
        System.out.println("Original Matrix:");
        for (int i = 0; i < readData.length; i++) {
            for (int j = 0; j < readData[i].length; j++) {
                System.out.print(readData[i][j] + " ");
            }
            System.out.println();
        }
    }
}