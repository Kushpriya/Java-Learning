public class Oops
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!!");
        //String x = new String();
       /* Shape object = new Shape();
        object.width = 500;
        System.out.println("Width of shape= " + object.width);
        System.out.println("Height of Shape= " + object.height);
        object.area();*/
        Shape object = new Shape(100,200);
        Shape object1 = new Shape(200,300);
        object.area();

    }
}
