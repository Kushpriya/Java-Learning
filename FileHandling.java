import java.io.*;

public class FileHandling
{
    /*public static void main(String[] args) throws IOException
    yo chai (try catch) na rakhda yo rakhda hunxa...
     */

    public static void main(String[] args) {
        File file = new File("Priya.txt");
        try {
            //this will create new file!
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("file create vayena...Error!!");
        }
        //write something on this file!
        try
        {

            FileWriter fileWriter = new FileWriter("Priya.txt");
            fileWriter.write("Hi..I am Priya");
            fileWriter.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        //reading file
        try
        {
            int value;
            FileReader fileReader = new FileReader("Priya.txt");
            while(( value = fileReader.read())!= -1)
            {
                System.out.print((char) value);
            }
            fileReader.close();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        file.delete();  //To delete file
    }
}