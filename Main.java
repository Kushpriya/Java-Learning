
import java.io.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {

       File file = new File("Priya.txt");


            file.createNewFile();

            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("hello..");
            fileWriter.close();

             FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line!= null)
            {
                 System.out.println(line);
                 line = bufferedReader.readLine();
            }
    }
}

