import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client
{
    public static void main(String[] args) {
        System.out.println("client");
        try{
            Socket socket = new Socket("localhost", 12345);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
