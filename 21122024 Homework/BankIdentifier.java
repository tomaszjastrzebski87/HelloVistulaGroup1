import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class BankIdentifier {
    public static void main(String[] args) {

        try {
            System.out.print("Please enter the initial three digits of the account number: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String prefix = reader.readLine();

            if (prefix == null || prefix.isEmpty()) {
                System.out.println("Nothing has been entered, exiting.");
                return;
            }

            URL url = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] parts = line.split("\\t+");
                if (parts.length >= 2 && parts[0].startsWith(prefix)) {
                    System.out.println("Bank: " + parts[1]);
                    System.out.println("Shortened bank number: " + parts[0]);
                    break;
                }
            }

            if (line == null) {
                System.out.println("No bank found for entered prefix.");
            }

        } catch (IOException error) {
            System.err.println("An error occurred: " + error.getMessage());
        }
    }
}