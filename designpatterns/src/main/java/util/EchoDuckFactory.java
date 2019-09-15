package util;

import ducks.MallardDuck;
import ducks.RedheadDuck;

public class EchoDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackEcho(new MallardDuck());
    }

    public Quackable createRedheadDuck() {
        return new QuackEcho(new RedheadDuck());
    }
}
