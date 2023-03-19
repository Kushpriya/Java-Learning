public class Q_4
{
    public void fly()
    {
        System.out.println("I am Flying");
    }

    public static class Animal extends Q_4
    {
        public void eat() {
            System.out.println("I am Eating");
        }
    }

    public static class Bird extends Animal
    {
        public void walk() {
            System.out.println("I am walking");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Hello world");
        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        bird.walk();
    }
}

