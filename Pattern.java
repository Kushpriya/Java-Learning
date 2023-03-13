/*      *****
        *****
        *****
        *****
        *****
*/
public class Pattern
{
    public static void main(String[] args)
    {
        for(int i=0;i<5; i++)
        {
            System.out.println();
            for(int j=0;j<5; j++)
            {
                System.out.print("*");
            }
        }
    }
}

 *
 **
 ***
 ****
 *****
public class pattern3
{
    public static void main(String[] args)
    {
        for(int i=0;i<5; i++)
        {
            System.out.println();
            for(int j=0;j<=i; j++)
            {
                System.out.print("*");
            }
        }
    }
}


        *****
        ****
        ***
        **
        *

public class Pattern4 {
    public static void main(String[] args)
    {
        for(int i=0;i<5; i++)
        {
            System.out.println();
            for(int j=i;j<5; j++)
            {
                System.out.print("*");
            }
        }
    }
}


                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
public class Pattern2
{
    public static void main(String[] args) {
        for(int i=1;i<=5; i++)
        {
            System.out.println();
            for(int j=1;j<=i; j++)
            {
                System.out.print(" "+ j);
            }
        }
    }
}


                5 4 3 2 1
                5 4 3 2
                5 4 3
                5 4
                5

public class Pattern2
{
    public static void main(String[] args) {
        for(int i=1;i<=5; i++)
        {
            System.out.println();
            for(int j=5;j>=i; j--)
            {
                System.out.print(" "+ j);
            }
        }
    }
}

