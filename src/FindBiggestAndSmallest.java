import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class FindBiggestAndSmallest {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> randomNumbers = new HashSet<>();

        while (randomNumbers.size() < 10) {
            int randomNumber = random.nextInt(1, 101);
            randomNumbers.add(randomNumber);
        }
        System.out.println("Wylosowane liczby to: " + randomNumbers);

        Iterator<Integer> iterator = randomNumbers.iterator();
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        while (iterator.hasNext()) {
            int currentNumber = iterator.next();
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        System.out.println("Największa liczba: " + maxNumber);
        System.out.println("Największa liczba: " + minNumber);
    }
}