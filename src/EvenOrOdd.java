import java.util.Random;

public class EvenOrOdd {
    public static void main(String[] args) {

        System.out.println("First i imported class Random.\n" +
                "After that i created new random number\n" +
                "from range 1 - 100.");

        Random random = new Random();
        System.out.println();
        int randomNumber = random.nextInt(1, 101);

        System.out.println("The random number is: " + randomNumber);
        System.out.println();

        System.out.println("Then i need to use modulo function\n" +
                "in order to find whether number is even or odd.");
        System.out.println();

        int dividedBy2 = randomNumber % 2;
        System.out.println("Operation: " + randomNumber + " % 2 = " + dividedBy2);
        System.out.println();

        System.out.println("Next i give the result using if statements: ");
        System.out.println();

        if (dividedBy2 == 0) {
            System.out.println("Number " + randomNumber + " is even.");
        } else {
            System.out.println("Number "  + randomNumber + " is odd.");
        }
    }
}