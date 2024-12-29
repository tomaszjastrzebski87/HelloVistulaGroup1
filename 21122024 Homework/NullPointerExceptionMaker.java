public class NullPointerExceptionMaker {
    public void generateException() {
        String nullString = null;
        System.out.println(nullString.lastIndexOf(2));
    }
}

class Exercise1 {
    public static void main(String[] args) {
        NullPointerExceptionMaker generator = new NullPointerExceptionMaker();

        try {
            generator.generateException();
        } catch (NullPointerException error) {
            System.out.println("An error occurred: " + error.getMessage());
            System.out.println("Stack trace: ");
            error.printStackTrace();
            System.out.println("More information: " + error.toString());
        }
    }
}