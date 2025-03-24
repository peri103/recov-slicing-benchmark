public class Student {
    private String name;
    private int age;
    private DataStore dataStore = new DataStore();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void storeGrade(String subject, int grade) {
        dataStore.storeData(subject, grade);
    }

    public Integer getGrade(String subject) {
        return dataStore.retrieveData(subject);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
