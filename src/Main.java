public class Main {
    public static void main(String[] args) {
        // Создаем объект 'f' для проверки
        F f = new F();

        System.out.println("--- Анализ выражений из Задания 1 ---");

        // 1. System.out.println(f.i);
        System.out.println("1. ДОПУСТИМО: Обращение к переменной экземпляра 'i' через объект 'f'.");

        // 2. System.out.println(f.s);
        System.out.println("2. ДОПУСТИМО: Обращение к статической переменной 's' через объект 'f'.");

        // 3. f.imethod();
        System.out.print("3. ДОПУСТИМО: Вызов метода экземпляра 'imethod' через объект 'f'. -> ");
        f.imethod();

        // 4. f.smethod();
        System.out.print("4. ДОПУСТИМО: Вызов статического метода 'smethod' через объект 'f'. -> ");
        f.smethod();

        // 5. System.out.println(F.i);
        System.out.println("5. НЕДОПУСТИМО: Нельзя обратиться к переменной экземпляра 'i' через имя класса 'F'.");
        // Раскомментирование строки ниже вызовет ошибку компиляции:
        // System.out.println(F.i);

        // 6. System.out.println(F.s);
        System.out.println("6. ДОПУСТИМО: Обращение к статической переменной 's' через имя класса 'F'.");

        // 7. F.imethod();
        System.out.println("7. НЕДОПУСТИМО: Нельзя вызвать метод экземпляра 'imethod' через имя класса 'F'.");
        // Раскомментирование строки ниже вызовет ошибку компиляции:
        // F.imethod();

        // 8. F.smethod();
        System.out.print("8. ДОПУСТИМО: Вызов статического метода 'smethod' через имя класса 'F'. -> ");
        F.smethod();

        System.out.println("\nИтог: Допустимыми являются выражения 1, 2, 3, 4, 6, 8.");
    }
}