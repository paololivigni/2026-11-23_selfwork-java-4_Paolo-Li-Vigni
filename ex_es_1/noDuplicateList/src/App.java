import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {


        // Creazione lista Set
        Set<Pointer2D> pointers = new HashSet<Pointer2D>(

            Set.of(
    
                new Pointer2D(10, 5),
                new Pointer2D(5, 10),
                new Pointer2D(10, 10),
                new Pointer2D(20, 10),
                // new Pointer2D(10, 5),
                // new Pointer2D(20, 10),
                new Pointer2D(30, 5)
    
            )
        );

        // pointers.add(new Pointer2D(20, 10));
        

        for (Pointer2D pointer2d : pointers) {
            System.out.println("x: " + pointer2d.getX() + " - y: " + pointer2d.getY());
        }

    }
}
