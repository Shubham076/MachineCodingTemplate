package Problem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Input {
    private Service service;

    public Input() {
        this.service = new Service();
    }

    public void processInputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter commands. Type 'exit' to stop:");
        while(true) {
            String line = scanner.nextLine();
            if ("exit".equalsIgnoreCase(line)) {
                break;
            }
            processLine(line);
        }
    }

    public void processInputFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private void processLine(String line) {
        String[] parts = line.split(" ");
        String command = parts[0];

        switch(command) {
            case "a":
//                service.addUser(parts[1], parts[2], parts[3], parts[4]);
                break;
            case "b":
//                service.borrowBook(parts[1], parts[2], parts[3]);
                break;
            case "c":
//                service.returnBook(parts[1], parts[2], parts[3]);
                break;
            case "d":
//                service.view(parts[1]);
                break;
            case "e":
//                service.showInventory();
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }
}