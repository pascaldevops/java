import com.tipizo.introclasses.Ball;
import com.tipizo.introclasses.BaseBall;
import com.tipizo.introclasses.BasketBall;

public class Main {
    public static void main(String[] args) {


        // Creating a ball (an object)
        Ball ball = new Ball("Blue",
                             "justBall",
                            12,
                         45);

        // Creating a basketball object
        BasketBall basketBall = new BasketBall();
        System.out.println(basketBall.isNBA());
        basketBall.bounces();

        // creating a baseball object
        BaseBall baseBall = new BaseBall();
        baseBall.bounces();


    }
}
