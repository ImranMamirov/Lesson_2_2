public class Triangle extends Figure {
    private int a, b, c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int calculatePerimeter() {
        return a * b * c;
    }

    @Override
    public void draw() {
        System.out.println("Image");
    }
}
