public class Student {
    private String name;
    private VectorOperations vectorOps;

    public Student(String name, int vectorSize) {
        this.name = name;
        this.vectorOps = new VectorOperations(vectorSize);
    }

    public void setVectorValues(double[] values) {
        vectorOps.setValues(values);
    }

    public OpenMapRealVector getStudentVector() {
        return vectorOps.getVector();
    }

    public String getName() {
        return name;
    }
}
