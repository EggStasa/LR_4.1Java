import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть слово: ");
        String word = scanner.nextLine();
        //Учитування всіх пробілів та переведення слова в нижній регістр
        word = word.replaceAll(" ", "").toLowerCase();
        //Функція яка перевіряє чи слово є поліндромом
        boolean isPolindrom = true;
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                isPolindrom = false;
                break;
            }
        }

        if (isPolindrom) {
            System.out.println("Введене слово поліндром");
        } else {
            System.out.println("Введене слово не поліндром");
        }

        scanner.close();
    }
}