public class C {

    // 3. Переменная 'c' должна быть СТАТИЧЕСКОЙ, чтобы к ней
    // можно было обратиться из статического метода method2().
    // Также инициализируем её сразу.
    static Circle c = new Circle();

    public static void main(String[] args) {
        // 1. ОШИБКА: Нельзя вызвать нестатический метод из статического.
        // ИСПРАВЛЕНИЕ: Создаем объект класса C и вызываем method1() через него.
        C instanceOfC = new C();
        instanceOfC.method1();
    }

    public void method1() {
        // 2. ОШИБКИ НЕТ: из метода экземпляра можно вызывать статический метод.
        method2();
    }

    public static void method2() {
        // 4. ОШИБКА: Статический метод не может обратиться к переменной
        // экземпляра 'c'. Ошибка была исправлена путем объявления 'c' как static.
        System.out.println("What is area " + c.getArea());
    }
}