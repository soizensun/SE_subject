package util;

public class QuackCounter implements Quackable {
    private int numberOfQuack;
    private Quackable duck;
//    private int numberOfQuack;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public int getNumberOfQuack() {
        return numberOfQuack;
    }

    public void quack() {
        duck.quack();
        this.numberOfQuack ++;
    }
}
