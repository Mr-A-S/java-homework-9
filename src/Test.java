public class Test {
    // 'count' должна быть static, чтобы к ней можно было обращаться
    // из статического метода getCount() и main() (если потребуется).
    static int count;

    // Метод main всегда должен быть статическим.
    public static void main(String[] args) {
        // Демонстрация работы
        Test.count = 10;
        System.out.println("Текущее значение count: " + Test.getCount());

        int number = 5;
        System.out.println("Факториал числа " + number + " равен " + Test.factorial(number));
    }

    // Метод должен быть static, чтобы его можно было вызвать из main
    // и чтобы он мог работать со статической переменной count.
    public static int getCount() {
        return count;
    }

    // Этот метод является вспомогательным и не зависит от состояния объекта.
    // Делаем его static, чтобы его можно было легко вызвать из main.
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}