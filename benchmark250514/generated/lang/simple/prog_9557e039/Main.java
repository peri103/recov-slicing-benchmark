import org.apache.commons.lang3.builder.CompareToBuilder;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder compareBuilder = new CompareToBuilder();
        /* write */ compareBuilder.append(1, 2);
        /* read */ int result = compareBuilder.toComparison();
        System.out.println(result);
    }
}