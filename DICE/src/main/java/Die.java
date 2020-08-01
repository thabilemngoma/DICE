import java.util.ArrayList;
import java.util.Random;

public class Die {
    private int sides;
    private ArrayList<Integer> values = new ArrayList<>();

    public Die(int sides) {
        this.sides = sides;
        for (int i = 1; i < sides + 1; ++i) {
            values.add(i);
        }
    }

    public Die (int sides, int... probabilities) {
        for (int i = 0; i < probabilities.length; ++i) {
            if (probabilities[i] < 0) {
                throw new IllegalArgumentException("negative probabilities not allowed");
            }
        }
        this.sides = sides;
        setProbabilities(probabilities, sides);
    }

    void setProbabilities(int[] probability, int sides) {
        for (int i = 1; i <= sides; ++i) {
            if (i <= probability.length && probability[i - 1] > 1) {
                for (int j = 0; j < probability[i - 1]; ++j) {
                    values.add(i);
                }
                sides = sides + (probability[i - 1] - 1);
            } else if (i <= probability.length) {
                values.add(i);
            }
        }
        this.sides = sides;
    }

    public void roll() {
        int bound = sides - 1;
        Random random = new Random();
        int randomIndex = random.nextInt(bound);
        System.out.println(values.get(randomIndex));
    }

}