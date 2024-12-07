import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n = scanner.nextInt();

        int counter = 0;
        String result = "";

        while (counter < n) {
            if (counter % 2 == 0) {
                result = result.concat("+");
            } else {
                result = result.concat("-");
            }
            counter++;
        }

        System.out.println("Output String: " + result);
    }
}