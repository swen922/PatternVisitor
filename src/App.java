import shape.*;
import visitor.JSONExporter;
import visitor.Visitor;
import visitor.XMLExporter;

import java.util.ArrayList;
import java.util.List;

/** Посетитель, также известен как: Visitor */

public class App {

    private static List<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        fillShapes();
        Visitor xmlExporter = new XMLExporter();
        Visitor jsonExporter = new JSONExporter();
        visitAll(xmlExporter);
        visitAll(jsonExporter);
    }

    private static void fillShapes() {
        shapes.add(new Dot(4.5, 9.5));
        shapes.add(new Circle(8, 9, 12.2));
        shapes.add(new Rectangle(2.3, 4.3, 15.5, 32));
        shapes.add(new Star(7, 8, 12, 9.9));
    }

    private static void visitAll(Visitor visitor) {
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }

}
