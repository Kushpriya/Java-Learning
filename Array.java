
/*public class Array {

    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = {10, 20, 30};
        // System.out.println("Y>>  " + y[i]);

        /* for (int i = 0; i <= 2; i++) {
            System.out.println("Y>>  " + y[i]);
        }
        for(int element: y){
            System.out.println("element);
        }
    }
} */
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] x=new String[5];
        for(int i=0;i<5;i++)
        {
            x[i]=input.next();
        }
         for(String element:x )
         {
             System.out.println("Good Looking ppl:"+element);
         }
    }
}
