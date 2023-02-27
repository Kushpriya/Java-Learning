import java.util.Vector;
public class Vectorlearning {
    public static void main(String[] args) {
        //this is a fixed length.
        int[] age = {10,20,30}; //length = 3
        Vector age2 = new Vector(); //automatically 10 ota memory address banxa
        //Vector age2 = new Vector(3); 
        System.out.println(age.length);
        age2.add (10);
        age2.add (20);
        age2.add (30);
       /* age2.add ('c');
        age2.add (50);
        age2.add (10);
        age2.add (20);
        age2.add (30);
        age2.add (40);
        age2.add (50);
        age2.add (10);
        age2.add (20);
        age2.add (30);
        age2.add (10);
        age2.add (50);*/
        System.out.println(age2);
        System.out.println("Vector age capacity>> " +age2.capacity());

    }
}
