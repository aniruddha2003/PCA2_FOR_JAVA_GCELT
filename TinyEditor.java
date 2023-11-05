import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TinyEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "textfile.txt";

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Read the file");
            System.out.println("2. Write to the file");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (option) {
                case 1:
                    readFromFile(fileName);
                    break;
                case 2:
                    writeToFile(fileName, scanner);
                    break;
                case 3:
                    System.out.println("Exiting the text editor.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }

    public static void writeToFile(String fileName, Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true)) ) {
            System.out.print("Enter text to write to the file (Enter empty line to finish):\n");
            while (true) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Text written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
