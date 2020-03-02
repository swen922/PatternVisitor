package shape;

import visitor.Visitor;

public class Star implements Shape {

    private double myX;
    private double myY;
    private int points;
    private double starLength;


    public Star(double myX, double myY, int points, double starLength) {
        this.myX = myX;
        this.myY = myY;
        this.points = points;
        this.starLength = starLength;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle with center coordinates x = " + myX + ", y = " + myY + ", and points = " + points + ", and pointSize = " + starLength);
    }

    @Override
    public void move(double x, double y) {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStar(this);

    }
}
