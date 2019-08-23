package th.ku.emailtemplate;

public class Rectangle {
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int area(){
        return this.x * this.y;
    }
}
