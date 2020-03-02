package visitor;

import shape.Circle;
import shape.Dot;
import shape.Rectangle;
import shape.Star;

public class JSONExporter implements Visitor {

    @Override
    public void visitDot(Dot dot) {
        System.out.println("Экспортирую точку в JSON");
    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Экспортирую круг в JSON");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Экспортирую прямоугольник в JSON");
    }

    @Override
    public void visitStar(Star star) {
        System.out.println("Экспортирую звезду в JSON");
    }
}
