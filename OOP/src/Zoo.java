import com.tipizo.nonhuman.*;

public class Zoo {
    public static void main(String[] args) {

        Bird bird1 = new Bird(2, "F", 2);
        Sparrow sparrow1 = new Sparrow(2, "F", 90);
        Animal sparrow2 = new Sparrow(2, "M", 10);
        Fish fish1 = new Fish(2, "M", 10);

        // Polymorphic behavior
        moveAnimal(fish1);
        moveAnimal(sparrow1);
        moveAnimal(sparrow2);
        moveAnimal(bird1);

        //
        Flyable flyingBird1 = new Sparrow(2, "M", 4);
        flyingBird1.fly();
    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
