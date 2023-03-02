public class Shape {
//    public int width = 10;
//    public int height = 20;
//    public void area()
//    {
//        System.out.println("Calling the shape");
//         int area = width * height;
//        System.out.println("Area = " + area);
//    }
    public int width ;
    public int height;

    //default constructor
    Shape()
    {
        width = 10;
        height = 20;
    }
    //parameter constructor
    Shape(int w,int h)
    {
        width = w;
        height = h;
    }
    public void area()
    {
        System.out.println("Calling the shape");
         int area = width * height;
        System.out.println("Area = " + area);
    }
}
