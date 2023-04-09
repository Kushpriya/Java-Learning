/*Build a program that reads a file containing serialized Java objects
and deserializes them to recreate the original objects.
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class QNo_3
{
    public static void main(String[] args)
    {
        String fileName = "serializedObjects";
        ArrayList<Object> objects = new ArrayList<>();

        try
        {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            while (true)
            {
                try
                {
                    Object obj = in.readObject();
                    objects.add(obj);
                } catch (ClassNotFoundException e)
                {
                    System.out.println("Error: Class not found.");
                }
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        } catch (IOException e)
        {
            System.out.println("Error: IO exception.");
        }
        System.out.println("Deserialized objects:");
        for (Object obj : objects)
        {
            System.out.println(obj);
        }
    }
}