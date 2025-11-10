import java.util.Date; // Импортируем класс, чтобы не писать полный путь

public class TestDate {
    public static void main(String[] args) {
        // Создаем массив, который МОЖЕТ хранить 10 ссылок на Date
        Date[] dates = new Date[10];

        // --- ИСПРАВЛЕНИЕ ---
        // ОШИБКА: Элементы массива были 'null', так как объекты Date не были созданы.
        // РЕШЕНИЕ: Создаем реальный объект Date и помещаем его в первый элемент массива.
        dates[0] = new Date(); // new Date() создает объект с текущей датой и временем

        // Теперь эти строки отработают корректно
        System.out.println("Вывод самого объекта dates[0]:");
        System.out.println(dates[0]);

        System.out.println("\nВывод результата dates[0].toString():");
        System.out.println(dates[0].toString());
    }
}