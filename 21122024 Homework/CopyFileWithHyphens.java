import java.io.*;

public class CopyFileWithHyphens {
    public static void main(String[] args) {
        String sourceFile = "src/cthulhu.txt";
        String destinationFile = "src/cthulhu-with-hyphens.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replace(" ", "-");
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Copying completed.");

        } catch (IOException error) {
            System.err.println("An error during file copying occurred: " + error.getMessage());
        }
    }
}