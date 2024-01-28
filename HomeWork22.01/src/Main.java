import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strBox = "";
        strBox = scanner.nextLine();
        strBox = strBox.toLowerCase();
        // Здесь пользователь вводит многое кол-во слово "плита", и оно заменяется на слово "пицца"

        String variant1 = strBox.replaceFirst("плита", "пицца");
        String variant2 = variant1.replace("плита", "");

        System.out.println(variant2);
    }
}