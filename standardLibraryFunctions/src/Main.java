import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

void main() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    // Map to store names and birth dates
    Map<String, LocalDate> people = new HashMap<>();

    // 1. Read the input file
    try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/input_file.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\.", 2);
            if (parts.length == 2) {
                String name = parts[0].trim();
                LocalDate birthDate = LocalDate.parse(parts[1].trim(), formatter);
                people.put(name, birthDate);
            }
        }
    } catch (IOException e) {
        System.out.println("Error reading file: " + e.getMessage());
        return;
    }

    // 2. Ask user for month number
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter month number (1-12): ");
    int month = scanner.nextInt();

    // 3. Filter people born in the given month
    List<String> foundNames = new ArrayList<>();
    for (Map.Entry<String, LocalDate> entry : people.entrySet()) {
        if (entry.getValue().getMonthValue() == month) {
            foundNames.add(entry.getKey());
        }
    }

    // 4. Sort names alphabetically
    Collections.sort(foundNames);

    // 5. Write results to output file
    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/output_file.txt"))) {
        for (String name : foundNames) {
            writer.write(name);
            writer.newLine();
        }
    } catch (IOException e) {
        System.out.println("Error writing file: " + e.getMessage());
    }

    System.out.println("Results have been written to output_file.txt");
}