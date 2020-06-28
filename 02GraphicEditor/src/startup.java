
import Model.Circle;
import Model.GraphicEditor;
import Model.Rectangle;
import Model.Square;

/**
 *
 * @author User
 */
public class startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rec = new Rectangle();
        Square square = new Square();
        
        GraphicEditor editor = new GraphicEditor();
        editor.DrawShape(square);
        editor.DrawShape(rec);
        editor.DrawShape(circle);
    }
    
}
