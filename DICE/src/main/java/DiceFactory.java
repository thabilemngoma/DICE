import java.util.ArrayList;

public class DiceFactory {
    private ArrayList<Integer> values = new ArrayList<>();
    private int sides;

    DiceFactory(int sides) {
        this.sides = sides;
    }

    public void makeDie() {
        for (int i = 1; i <= sides; ++i) {
            values.add(i);
        }
        System.out.println("Die : " + values);
    }
}