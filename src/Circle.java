public class Circle {
    double radius;

    // Конструктор по умолчанию
    Circle() {
        this.radius = 1.0;
    }

    // Новый конструктор для удобства
    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    // Добавим геттер для радиуса, чтобы было удобнее выводить информацию
    public double getRadius() {
        return radius;
    }
}