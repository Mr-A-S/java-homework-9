import java.util.Random;

public class SortTimer {
    public static void main(String[] args) {
        // 1. Создаем массив на 100 000 чисел
        int[] numbers = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000); // Заполняем случайными числами
        }

        // 2. Создаем объект нашего секундомера
        StopWatch timer = new StopWatch();

        // 3. Начинаем замер
        timer.start();
        System.out.println("Началась сортировка 100 000 чисел методом выбора...");

        // 4. Выполняем сортировку (это долгий процесс)
        selectionSort(numbers);

        // 5. Останавливаем замер
        timer.stop();
        System.out.println("Сортировка завершена.");

        // 6. Выводим результат
        System.out.println("Прошедшее время: " + timer.getElapsedTime() + " миллисекунд.");
    }

    /**
     * Сортирует массив целых чисел методом выбора.
     */
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Находим минимальный элемент в несортированной части массива
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами найденный минимальный элемент с первым элементом
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}