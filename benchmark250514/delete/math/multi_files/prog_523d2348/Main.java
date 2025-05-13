public class Main {
    public static void main(String[] args) {
        double[][] initialData = {{1.0, 2.0, 3.0}};
        Course mathCourse = new Course("Math", initialData);

        double[] newScores = {4.0, 5.0, 6.0};
        mathCourse.updateScores(0, newScores);

        mathCourse.printMatrix();

        /* read */ RealVector scores = mathCourse.getScores(0);
        System.out.println("Scores: " + scores);
    }
}