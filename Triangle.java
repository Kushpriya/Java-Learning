public class Triangle {
    public double a;
    public double b;
    public double c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double perimeter() {
        return a + b + c;
    }
    
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Perimeter of triangle is " + t.perimeter() + " units");
        System.out.println("Area of triangle is " + t.area() + " square units");
    }
}
