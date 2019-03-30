public class Main {
    public static void main(String[] args) {
        String[] myArray = {"Hello", "hi", "Peter"};

        int sum = 0;

        for (String argument : args) {

            try {

                sum += Integer.parseInt(argument);

            } catch (NumberFormatException e) {

                System.out.println("Exception message: " + e.getMessage());
                System.out.println("The " + argument + " is not a number.");
            }

            System.out.println("Sum is: " + sum);
        }
    }
}

/*
 Shortcuts:
  Option + Command + T
  Control + Option + R to pass arguments to main
 */