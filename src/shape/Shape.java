package shape;

import visitor.Visitor;

public interface Shape {

    public void draw();
    public void move(double x, double y);
    public void accept(Visitor visitor);
}
