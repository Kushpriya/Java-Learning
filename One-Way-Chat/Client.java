import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{
    public static void main(String[] args)
    {
        System.out.println("client");
        try
        {

            Socket socket = new Socket("localhost", 100);
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            System.out.print((char) inputStreamReader.read());
            while(true) {
                int c = inputStreamReader.read();
                while (c != 1) {
                    System.out.print((char) c);
                    c = inputStreamReader.read();
                }
            }

        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
