public class Rectangle extends Figure {
    private int a, b, c, d;

    public Rectangle(String name, int a, int b, int c, int d) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public int calculatePerimeter() {
        return a * b + c * d;
    }

    @Override
    public void draw() {
        System.out.println("Image");
    }
}
