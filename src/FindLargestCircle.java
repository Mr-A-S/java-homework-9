public class FindLargestCircle {
    public static void main(String[] args) {
        // 1. Создаем массив для 5 объектов типа Circle
        Circle[] circleArray = new Circle[5];

        // 2. Заполняем массив кругами со случайными радиусами от 1 до 100
        System.out.println("--- Созданные круги ---");
        for (int i = 0; i < circleArray.length; i++) {
            // Создаем круг со случайным радиусом
            circleArray[i] = new Circle(Math.random() * 100 + 1);
            // Выводим информацию о созданном круге
            System.out.printf("Круг %d: радиус = %.2f, площадь = %.2f%n",
                    i, circleArray[i].getRadius(), circleArray[i].getArea());
        }

        // 3. Находим круг с самой большой площадью
        // Предполагаем, что первый круг - самый большой
        Circle largestCircle = circleArray[0];

        // Проверяем остальные круги в массиве
        for (int i = 1; i < circleArray.length; i++) {
            if (circleArray[i].getArea() > largestCircle.getArea()) {
                // Если нашли круг с большей площадью, запоминаем его
                largestCircle = circleArray[i];
            }
        }

        // 4. Выводим результат
        System.out.println("\n--- Результат поиска ---");
        System.out.printf("Круг с самой большой площадью имеет радиус %.2f и площадь %.2f%n",
                largestCircle.getRadius(), largestCircle.getArea());
    }
}