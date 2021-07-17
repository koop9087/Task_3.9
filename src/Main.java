import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String word = (line.charAt(line.indexOf("т")) +  "" + line.charAt(line.indexOf("о")) + "" + line.charAt(line.indexOf("р")) +  line.charAt(line.indexOf("т")));
        System.out.println(word);
    }
}
