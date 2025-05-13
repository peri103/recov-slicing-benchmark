public class Student {
    private String name;
    private VectorOperations vectorOperations;

    public Student(String name, double[] initialData) {
        this.name = name;
        this.vectorOperations = new VectorOperations(initialData);
    }

    public double calculateDotProduct(RealVector otherVector) {
        return vectorOperations.dotProduct(otherVector);
    }

    public RealVector addVectors(RealVector otherVector) {
        return vectorOperations.addVector(otherVector);
    }

    public OpenMapRealVector getStudentVector() {
        return vectorOperations.getVector();
    }
}