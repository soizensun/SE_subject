package Goose;

import util.Quackable;

public class GoodAdapter implements Quackable {
    private Goose goose;

    public GoodAdapter(Goose goose) {
        this.goose = goose;
    }

    public void quack() {
        goose.honk();
    }
}
