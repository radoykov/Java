import java.util.*;

void main() {
    ArrayList<String> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    System.out.print("Input length of array: ");
    int len = sc.nextInt();
    sc.nextLine(); //clean the buffer
    for (int i = 0; i < len; i++) {
        arr.add(sc.nextLine().trim());
    }
    HashSet<String> arrSet = new HashSet<>(arr);

    List<String> sortedList = new ArrayList<>(arrSet);
    Collections.sort(sortedList);

    System.out.println("Sorted unique elements:");
    for (String s : sortedList) {
        System.out.println(s);
    }

    System.out.println("Word : ");
    System.out.println(capitalizeWord(sc.nextLine()));
    System.out.println("Sentence : ");
    System.out.println(capitalizeSentence(sc.nextLine()));
    sc.close();

    LocalDate date1 = LocalDate.of(2025, 11, 27); // 27 Nov 2025
    LocalDate date2 = LocalDate.of(2025, 12, 5);  // 5 Dec 2025

    System.out.println("Days between " + date1 + " and " + date2 + " = " + calculateDaysBetween(date1, date2));
}
public static String capitalizeWord(String word) {
    if (word == null || word.isEmpty()) {
        return word;
    }
    return word.substring(0, 1).toUpperCase() + word.substring(1);
}

public static String capitalizeSentence(String sentence) {
    if (sentence == null || sentence.isEmpty()) {
        return sentence;
    }

    String[] words = sentence.split("\\s+"); // split by spaces
    StringBuilder result = new StringBuilder();

    for (String word : words) {
        result.append(capitalizeWord(word)).append(" ");
    }

    return result.toString().trim();
}
public static long calculateDaysBetween(LocalDate startDate, LocalDate endDate) {
    return ChronoUnit.DAYS.between(startDate, endDate);
}