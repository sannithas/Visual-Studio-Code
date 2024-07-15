import java.util.Scanner;

public class SplitWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any text:");
        String input = scanner.nextLine();
        
        String[] words = input.replaceAll("\\p{Punct}", "").split("\\s+");
        
        for (String word : words) {
            System.out.println(word);
        }
        
        scanner.close();
    }