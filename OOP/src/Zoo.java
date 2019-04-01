import com.tipizo.nonhuman.Animal;
import com.tipizo.nonhuman.Bird;
import com.tipizo.nonhuman.Fish;
import com.tipizo.nonhuman.Sparrow;

public class Zoo {
    public static void main(String[] args) {

        Bird bird1 = new Bird(2, "F", 2);

        Sparrow sparrow1 = new Sparrow(2, "F", 90);

        Animal sparrow2 = new Sparrow(2, "M", 10);

        Fish fish1 = new Fish(2, "M", 10);

        moveAnimal(fish1);

        moveAnimal(sparrow1);

        moveAnimal(sparrow2);

        moveAnimal(bird1);
    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
