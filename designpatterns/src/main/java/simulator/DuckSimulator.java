package simulator;

import Goose.GoodAdapter;
import Goose.Goose;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import pigeon.Pigeon;
import pigeon.PigeonAdapter;
import util.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        // adepter can make pigeon and good can call makeNoice();
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        GoodAdapter gooseAdapter = new GoodAdapter(new Goose());
        PigeonAdapter pigeonAdapter = new PigeonAdapter(new Pigeon());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(gooseAdapter);
        simulate(pigeonAdapter);
        System.out.println("---------------------------------");

        // Decoration Duck more option such as count and echo
        Quackable mallardDuckQuackCount = new QuackCounter(mallardDuck);
        Quackable redheadDuckQuackCount = new QuackCounter(redheadDuck);
        simulate(mallardDuckQuackCount);
        simulate(mallardDuckQuackCount);
        simulate(mallardDuckQuackCount);
        simulate(redheadDuckQuackCount);
        simulate(redheadDuckQuackCount);
        System.out.println(((QuackCounter) mallardDuckQuackCount).getNumberOfQuack());
        System.out.println(((QuackCounter) redheadDuckQuackCount).getNumberOfQuack());

        Quackable mallardDuckEcho = new QuackEcho(mallardDuck);
        Quackable readDuckEcho = new QuackEcho(redheadDuck);
        simulate(mallardDuckEcho);
        simulate(readDuckEcho);
        System.out.println("---------------------------------");



        // Fatory
        AbstractDuckFactory duckFactory = new DuckFactory();
        Quackable mallardDuckFactory = duckFactory.createMallardDuck();
        simulate(mallardDuckFactory);

        AbstractDuckFactory cDuckFactory = new CountingDuckFactory();
        Quackable cRedHeadDuckFactory = cDuckFactory.createRedheadDuck();
        simulate(cRedHeadDuckFactory);
//        System.out.println( cRedHeadDuckFactory.getNumberOfQuack() );

        AbstractDuckFactory eDuckFactory = new EchoDuckFactory();
        Quackable eRedHeadDuckFactory = eDuckFactory.createRedheadDuck();
        simulate(eRedHeadDuckFactory);



    }

    private void simulate(Quackable animal) {
        animal.quack();
    }
}
