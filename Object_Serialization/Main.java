import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import  java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // FileInputStream fileInputStream =new FileInputStream("Priya.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("Priya.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Person person =new Person();
        objectOutputStream.writeObject(person);

        FileInputStream fileInputStream = new FileInputStream("Priya.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person person1 = ( Person) objectInputStream.readObject();
        person1.getName();
        person1.getAge();
    }
}