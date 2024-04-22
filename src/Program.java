import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Program {
    public static Socket server;
    public static Boolean connectedToServer = false;
    public static InputStream inputStream;
    public static OutputStream outputStream;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the IP address of the server you want to log in:\n>");
        String serverAddress = scanner.nextLine();

        System.out.print("Enter your desired username during this session:\n>");
        String username = scanner.nextLine();

        while (true) {
            try {
                if(!connectedToServer) {
                    server = new Socket(serverAddress, 7777);
                    System.out.println("Connected to server at " + server.getInetAddress() + " at port 7777");

                    inputStream = server.getInputStream();
                    outputStream = server.getOutputStream();

                    outputStream.write(username.getBytes());
                    connectedToServer = true;
                }

                System.out.print(">");
                String message = scanner.nextLine();
                outputStream.write(message.getBytes());
            } catch (IOException e) {
                connectedToServer = false;

                System.out.println("Couldn't connect to server! Error: " + e);
                System.out.println("Trying again in 3 seconds...\n");
                Thread.sleep(3000);
            }
        }
    }
}
