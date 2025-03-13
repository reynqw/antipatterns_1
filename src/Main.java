import java.util.Scanner;
import java.util.Random;

public class Main {
    // 1.God Object (один класс делает всё)
    static Random rnd = new Random(); // 2.Dependency Hell (глобальный Random)
    static Scanner inputScanner = new Scanner(System.in);
    static int fixedValue = 21; // 3.Hard Code и 4.Magic Numbers (жёстко заданное число)
    static int total = 0; // 5.Глобальная переменная (God Object)

    public static void main(String[] args) {
        processNumbers(); // 6.Spaghetti Code (метод перегружен логикой)
        extraComputation(); // 7.Copy-Paste Programming (повторение кода с изменёнными переменными)
    }

    public static void processNumbers() {
        // 8. Blind Faith (ввод юзера не проверяется)
        System.out.println("Введи число (или просто нажми Enter): ");
        String userInput = inputScanner.nextLine();
        int num;
        try {
            num = userInput.isEmpty() ? fixedValue : Integer.parseInt(userInput);
        } catch (Exception ex) {
            num = fixedValue; //Ошибки просто игнорируются(Blind Faith)
        }

        // 9.Spaghetti Code (метод делает всё подряд)
        total = 0;
        for (int i = num; i > 0; i--) { //Цикл написан по-другому
            total += i;
            if (rnd.nextInt(50) == 25) { //10.Lava Flow (ненужный код, который редко срабатывает)
                System.out.println("Неожиданное событие при числе: " + i);
            }
        }

        if (rnd.nextBoolean()) {
            System.out.println("Число делится на 3? " + (num % 3 == 0));
        }
        System.out.println("RESULT: " + total);
    }

    public static void extraComputation() {
        //Copy-Paste Programming (дублирование кода)
        int sumAgain = 0;
        for (int j = 1; j <= 37; j++) { //Magic Numbers (ещё одно захардкоженное число)
            sumAgain += j;
        }
        System.out.println("Доп. RESULT: " + sumAgain);
    }
}