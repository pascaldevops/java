import com.tipizo.introclasses.Ball;

public class Main {
    public static void main(String[] args) {

        // Creating a ball (an object)
        Ball myBall = new Ball();
        Ball secondBall = new Ball();

        myBall.color = "Blue";
        myBall.name = "Basketball";
        System.out.println(myBall.color);

        secondBall.color = "white and black";
        secondBall.name = "Soccer Ball";
        System.out.println(secondBall.name);

    }
}
