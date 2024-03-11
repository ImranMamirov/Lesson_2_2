public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 15);
        Triangle triangle = new Triangle("Треуголник", 2, 5, 2);
        Square square = new Square("Квадрат", 5);
        Rectangle rectangle = new Rectangle("Прямоугольник", 4, 4, 6, 6);

        Dog dog = new Dog("Andro");
        Cat cat = new Cat("Tom");

        Drawable[] drawables = {circle, triangle, square, rectangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();

            if (drawables[i] instanceof Figure) {
                System.out.println(((Figure) drawables[i]).getName() + " Периметр => " +
                        ((Figure) drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal) {
                System.out.println(((Animal) drawables[i]).getName());
            }
        }
    }
}