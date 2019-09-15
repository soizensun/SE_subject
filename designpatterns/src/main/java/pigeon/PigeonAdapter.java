package pigeon;

import util.Quackable;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }


    public void quack() {
        pigeon.coo();
    }
}
