import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> animals;

    public Herd (){
        animals = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        animals.add(movable);
    }

    @Override
    public String toString() {
        StringBuilder herd = new StringBuilder();
        for (Movable animal : animals) {
            herd.append(animal.toString()).append("\n");
        }
        return herd.toString();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable animal : animals) {
            animal.move(dx, dy);
        }
    }
}
