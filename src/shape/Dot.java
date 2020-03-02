package shape;

import visitor.Visitor;

public class Dot implements Shape {

    private double myX;
    private double myY;

    public Dot(double X, double Y) {
        this.myX = X;
        this.myY = Y;
    }

    @Override
    public void draw() {
        System.out.println("Draw Dot with coordinates x = " + myX + ", y = " + myY);
    }

    @Override
    public void move(double x, double y) {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}
