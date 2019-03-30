import com.tipizo.introclasses.Ball;

public class Main {
    public static void main(String[] args) {

        // Creating a ball (an object)
        Ball ball = new Ball("Blue",
                             "justBall",
                            12,
                         45);

        ball.showColor();
        ball.showName();
        ball.showCapacity();
        ball.showBounceRate();
    }
}
