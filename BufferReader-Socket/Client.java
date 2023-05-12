import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try {
            Socket socket=new Socket("localhost",12345);
            //this is for getting socket value
            BufferedReader socketDataReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //this is for user typed input
            BufferedReader userInputReader=new BufferedReader(new InputStreamReader(System.in));

            //i need a pen to write the message
            OutputStream outputStream=socket.getOutputStream();
            PrintWriter printWriter=new PrintWriter(outputStream);
            String sendingMessage,receivingMessage;

            while(true) {
                //receiving message from client
                receivingMessage=socketDataReader.readLine();
                System.out.println("Server:"+receivingMessage);

                //sending to client
                sendingMessage= userInputReader.readLine();//get input from user
                printWriter.println(sendingMessage);
                printWriter.flush();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}