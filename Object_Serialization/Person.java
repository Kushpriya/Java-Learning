import java.io.Serializable;

public class Person implements Serializable {
    int age =20;
    String name = "Priya Singh";

    String getName ()
    {
        return name;
    }
    int getAge()
    {
        return age;
    }

}
