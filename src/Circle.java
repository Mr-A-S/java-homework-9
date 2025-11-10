public class Circle {
    double radius;

    Circle() {
        this.radius = 1.0;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }
}