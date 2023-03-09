public class Main
{
    public static void main(String[] args)
    {
        Animal obj = new Animal();
        System.out.println(obj.height);
        obj.getHeight();

        Dog dog = new Dog();
        System.out.println(dog.name);
        dog.getHeight();

        //System.out.println(obj.color);
        obj.getColor();
    }
}
