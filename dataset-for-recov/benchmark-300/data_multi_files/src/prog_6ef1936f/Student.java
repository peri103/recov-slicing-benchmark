public class Student {
    private String name;
    private HashSetManager hashSetManager = new HashSetManager();

    public Student(String name) {
        this.name = name;
    }

    public void addValueToSet(String value) {
        hashSetManager.addValue(value);
    }

    public boolean checkValueInSet(String value) {
        return hashSetManager.containsValue(value);
    }
}
