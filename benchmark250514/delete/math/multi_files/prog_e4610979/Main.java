import org.apache.commons.math3.linear.OpenMapRealVector;

public class Main {
    public static void main(String[] args) {
        // Create a student with a vector of size 3
        Student student = new Student("Alice", 3);
        
        // Set vector values for the student
        student.setVectorValues(new double[] {1.0, 2.0, 3.0});
        
        // Retrieve the vector from the student
        /* read */ OpenMapRealVector studentVector = student.getStudentVector();
        
        // Print the vector entries
        System.out.println(student.getName() + "'s Vector:");
        for (int i = 0; i < studentVector.getDimension(); i++) {
            System.out.println("Entry " + i + ": " + studentVector.getEntry(i));
        }
    }
}