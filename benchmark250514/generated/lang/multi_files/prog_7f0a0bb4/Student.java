public class Student {
    private String name;
    private StrBuilderWrapper notes;

    public Student(String name) {
        this.name = name;
        this.notes = new StrBuilderWrapper("Initial Notes");
    }

    public void clearNotes() {
        notes.clearContent();
    }

    public String getNotes() {
        return notes.getContent();
    }

    public void addNotes(String additionalNotes) {
        notes.appendContent(additionalNotes);
    }

    public String getName() {
        return name;
    }
}
