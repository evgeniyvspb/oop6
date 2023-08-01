package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadreliteral rectangle = new Rectangle(4, 5);
        Quadreliteral square = new Square(3);
        System.out.printf("In a rectangle side A = %s, side B = %s\n", rectangle.getSideA(), rectangle.getSideB());
        System.out.printf("In a square side A = %s\n", square.getSideA());
        ShapeView view = new ShapeView(rectangle);
        ShapeView view1 = new ShapeView(square);
        view.showArea();
        view1.showArea();
    }
}
