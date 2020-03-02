package visitor;

import shape.*;

public interface Visitor {

    public void visitDot(Dot dot);
    public void visitCircle(Circle circle);
    public void visitRectangle(Rectangle rectangle);
    public void visitStar(Star star);
}
