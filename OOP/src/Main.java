import com.tipizo.introclasses.Ball;

public class Main {
    public static void main(String[] args) {


        // Creating a ball (an object)
        Ball ball = new Ball("Blue",
                             "justBall",
                            12,
                         45);

        System.out.println(ball.getName());
        System.out.println(ball.getColor());
        System.out.println(ball.getCapacity());
        System.out.println(ball.getBounceRate());

        ball.setName("Basketball");
        System.out.println(ball.getName());

        ball.setBounceRate(34);
        System.out.println(ball.getBounceRate());

        ball.setColor("white and black");
        System.out.println(ball.getColor());

        ball.setCapacity(23);
        System.out.println(ball.getCapacity());
    }
}
