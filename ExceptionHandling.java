public class ExceptionHandling
{
    public static void main(String[] args)
    {
        String isloading = "True..";
        try
        {
            int divider = 10;
            int value = 100;
            int result = value/divider;
//            if(divider == 0)
//            {
//                throw new Exception();
//            }
            System.out.println("Result is:- " + result);

        }
        catch (Exception error)
        {
            System.out.println("Error!!!"+ error);
        }
/*          int divider =10;
            int value = 100;
            int result = value/divider;
            System.out.println("Result is " + result);
*/
        finally
        {
            isloading = "False....";
            System.out.println("This is final block");
        }
        anotherWork();
    }
    static void anotherWork()
    {
        System.out.println("Another Work");
    }
}
