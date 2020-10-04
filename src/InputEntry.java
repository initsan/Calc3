import java.util.Scanner;

public class InputEntry {
    static Scanner scanner = new Scanner(System.in);

    public static String getEntry() {
        System.out.println("Введите пример в формате \"x + y\"");
        return scanner.nextLine();
    }
}
