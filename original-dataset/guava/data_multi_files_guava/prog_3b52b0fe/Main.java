public class Main {
    public static void main(String[] args) {
        ImmutableMapBuilder mapBuilder = new ImmutableMapBuilder();
        mapBuilder.addEntry(1, "One");
        ImmutableSortedMap<Integer, String> map = mapBuilder.buildMap();

        Student student = new Student("Alice");
        student.addScore(90);
        
        // Additional unrelated code to increase complexity
        System.out.println("Student Name: " + student.getName());
        for (int score : student.getScores()) {
            System.out.println("Score: " + score);
        }

        /* read */ String value = map.get(1);
        System.out.println("Value from ImmutableSortedMap: " + value);
    }
}