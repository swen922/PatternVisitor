package shape;

import visitor.Visitor;

public class Rectangle implements Shape {

    private double myX;
    private double myY;
    private double xSize;
    private double ySize;

    public Rectangle(double myX, double myY, double xSize, double ySize) {
        this.myX = myX;
        this.myY = myY;
        this.xSize = xSize;
        this.ySize = ySize;
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle with center coordinates x = " + myX + ", y = " + myY + ", and width = " + xSize + ", height = " + ySize);
    }

    @Override
    public void move(double x, double y) {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}
