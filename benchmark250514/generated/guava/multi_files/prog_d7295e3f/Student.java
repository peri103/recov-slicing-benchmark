public class Student {
    private String name;
    private RangeManager rangeManager;

    public Student(String name) {
        this.name = name;
        this.rangeManager = new RangeManager();
    }

    public void addRange(int lower, int upper) {
        rangeManager.addRange(lower, upper);
    }

    public boolean isValueInRange(int value) {
        return rangeManager.contains(value);
    }

    public String getName() {
        return name;
    }
}