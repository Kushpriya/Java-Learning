import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Server
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println("server");
            ServerSocket ss = new ServerSocket(100);
            Socket socket = ss.accept();
            System.out.println("Connection done!!!");

            OutputStream outputStream = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(outputStream,true);

            Scanner input = new Scanner(System.in);

            while (true)
            {

                String userInput = input.nextLine();
                pw.println(userInput);
            }

        }
        catch (IOException e)
        {
            System.out.println("Cannot connect to client");
            throw new RuntimeException(e);
        }
    }
}
