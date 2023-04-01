interface Shape {
    public void draw();
}

interface Color {
    public void color();
}

class Circle implements Shape, Color {
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    public void color() {
        System.out.println("Coloring a Circle");
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.color();
    }
}
