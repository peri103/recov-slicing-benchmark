public class Student {
    private String name;
    private DataStore dataStore = new DataStore();

    public Student(String name) {
        this.name = name;
    }

    public void storeGrade(String course, int grade) {
        dataStore.storeValue(course, grade);
    }

    public int getGrade(String course) {
        return dataStore.retrieveValue(course);
    }
}
