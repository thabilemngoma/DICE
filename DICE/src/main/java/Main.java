public class Main {

    public static void main(String[] args) {
        DiceFactory die6 = new DiceFactory(6);
        die6.makeDie();

        DiceFactory die20 = new DiceFactory(20);
        die20.makeDie();

        Die dies6 = new Die(6);
        dies6.roll();

        Die mydie20 = new Die(20);
        mydie20.roll();


    }
}
