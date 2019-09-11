package simulator;

import Goose.GoodAdapter;
import Goose.Goose;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import pigeon.Pigeon;
import pigeon.PigeonAdapter;
import quack.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        GoodAdapter gooseAdater = new GoodAdapter(new Goose());
        PigeonAdapter pigeonAdapter = new PigeonAdapter(new Pigeon());

        System.out.println("\n--------Duck Simulate----------");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(gooseAdater);
        simulate(pigeonAdapter);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
