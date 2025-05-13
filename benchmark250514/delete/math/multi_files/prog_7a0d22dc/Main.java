import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", new double[]{1.0, 2.0, 3.0});

        RealVector scaledScores = student.getScaledScores(2.0);
        System.out.println("Scaled Scores: ");
        for (int i = 0; i < scaledScores.getDimension(); i++) {
            System.out.println(scaledScores.getEntry(i));
        }

        ArrayRealVector additionalScores = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector totalScores = student.addScores(additionalScores);
        System.out.println("Total Scores: ");
        for (int i = 0; i < totalScores.getDimension(); i++) {
            System.out.println(totalScores.getEntry(i));
        }

        /* read */ OpenMapRealVector retrievedScores = student.getScores();
        System.out.println("Retrieved Scores: ");
        for (int i = 0; i < retrievedScores.getDimension(); i++) {
            System.out.println(retrievedScores.getEntry(i));
        }

        RealVector negatedScores = retrievedScores.mapMultiply(-1.0);
        System.out.println("Negated Retrieved Scores: ");
        for (int i = 0; i < negatedScores.getDimension(); i++) {
            System.out.println(negatedScores.getEntry(i));
        }
    }
}