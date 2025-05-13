import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.PredicatedBag;
import org.apache.commons.collections4.Predicate;

public class StudentScores {
    private Bag<Integer> scoreBag;

    public StudentScores() {
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean evaluate(Integer object) {
                return object instanceof Integer;
            }
        };
        scoreBag = PredicatedBag.predicatedBag(new HashBag<>(), predicate);
    }

    public void addScore(int score) {
        /* write */ scoreBag.add(score);
    }

    public int getScoreCount(int score) {
        /* read */ return scoreBag.getCount(score);
    }
}
