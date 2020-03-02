package shape;

import visitor.Visitor;

public class Circle implements Shape {

    private double myX;
    private double myY;
    private double diameter;

    public Circle(double X, double Y, double diameter) {
        this.myX = X;
        this.myY = Y;
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle with center coordinates x = " + myX + ", y = " + myY + ", and diameter = " + diameter);
    }

    @Override
    public void move(double x, double y) {
        this.myX = x;
        this.myY = y;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}
