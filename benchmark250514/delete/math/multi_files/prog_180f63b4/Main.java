import org.apache.commons.math3.linear.RealMatrix;

public class Main {
    public static void main(String[] args) {
        double[] rowData = {1.0, 2.0, 3.0};
        MatrixOperations matrixOps = new MatrixOperations();
        matrixOps.createMatrix(rowData);

        Student student = new Student("John Doe", 20, "Mathematics");
        student.displayStudentInfo();

        // Perform matrix operations
        RealMatrix anotherMatrix = MatrixUtils.createRowRealMatrix(new double[]{4.0, 5.0, 6.0});
        RealMatrix productMatrix = matrixOps.getRowMatrix(0).multiply(anotherMatrix.transpose());

        System.out.println("Product matrix:");
        for (int i = 0; i < productMatrix.getRowDimension(); i++) {
            for (int j = 0; j < productMatrix.getColumnDimension(); j++) {
                System.out.print(productMatrix.getEntry(i, j) + " ");
            }
            System.out.println();
        }

        /* read */ RealMatrix rowMatrix = matrixOps.getRowMatrix(0);
        
        System.out.println("Row matrix:");
        for (int i = 0; i < rowMatrix.getColumnDimension(); i++) {
            System.out.print(rowMatrix.getEntry(0, i) + " ");
        }
    }
}