import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String word = (line.charAt(line.indexOf("ั")) +  "" + line.charAt(line.indexOf("ะพ")) + "" + line.charAt(line.indexOf("ั")) +  line.charAt(line.indexOf("ั")));
        System.out.println(word);
    }
}
