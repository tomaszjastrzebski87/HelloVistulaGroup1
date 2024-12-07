public class TableIteration {
    public static void main(String[] args) {
        int[] table = {1, 3, 2, 4, 5, 6, 7, 8, 9, 10};

//        for (int i = 0; i < table.length; i++) {
//            table[i] = 10 - i;
//        }

        for (int number : table) {
            System.out.print(number + " ");
        }

        System.out.println();

        int counter = 0;

        for (int i = 0; i < table.length; i++) {
            counter++;
            for (int j = 0; j < table.length - 1; j++) {

                if (table[j + 1] > table[j]) {
                    continue;
                }

                counter++;
                if (table[i] > table[i + 1]) {

                    int greater = table[i];
                    table[j] = table[j + 1];
                    table[j + 1] = greater;
                    counter++;
                }
            }
        }

        for (int number : table) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Number of actions = " + counter);

    }
}
