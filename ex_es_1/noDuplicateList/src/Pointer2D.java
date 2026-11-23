import java.util.Objects;

public class Pointer2D {

    private int x;
    private int y;
    
    public Pointer2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String print(){
        return "x: " + x + "y: " + y;
    }

    @Override
    public boolean equals(Object obj) {

        //  I due oggetti hanno lo stesso riferimento?
        if(this == obj) return true;

        //  L'oggetto parametro è null? || I due oggetti corrispondono alla stessa classe?
        if((obj == null) || getClass() != obj.getClass()) return false;

        //  Confronto degli attributi dei due oggetti
        Pointer2D casted = (Pointer2D) obj;
        return this.x == casted.x && this.y == casted.y;

    }


    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }


}
