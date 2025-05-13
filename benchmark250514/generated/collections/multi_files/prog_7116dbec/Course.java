import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class Course {
    private Bag<String> assignments;
    private PredicatedBag<String> predicatedAssignments;

    public Course() {
        Predicate<Object> truePredicate = object -> true;
        this.assignments = new HashBag<>();
        this.predicatedAssignments = PredicatedBag.predicatedBag(assignments, truePredicate);
    }

    public void addAssignment(String assignment) {
        /* write */ predicatedAssignments.add(assignment);
    }

    public int getAssignmentCount(String assignment) {
        /* read */ return predicatedAssignments.getCount(assignment);
    }
}
