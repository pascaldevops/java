import com.tipizo.nonhuman.Animal;
import com.tipizo.nonhuman.Bird;
import com.tipizo.nonhuman.Fish;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal("dog", 23, "blue");

        Bird bird1 = new Bird();
        bird1.fly();

        Fish fish1 = new Fish();
        fish1.swim();
    }
}
