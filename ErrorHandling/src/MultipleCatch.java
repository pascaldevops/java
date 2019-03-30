public class MultipleCatch {
    public static void main(String[] args) {
        int number[] = {4, 8, 16, 64, 128, 256, 512};
        int demon[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++) {
            try {
                System.out.println(number[i] + " / " + demon[i] + " is " + number[i]/demon[i]);
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No matching element found.");
            } finally {
                System.out.println("Will always run!");
            }
        }
    }
}
