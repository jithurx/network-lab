import java.io.*;
import java.net.*;

public class ChatClient{
  public static void main(String[] args) throws Exception {
    String serverAddress = "localhost";
    int serverPort = 5000;

    Socket socket = new Socket(serverAddress,serverPort);
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
    BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

    Thread receiveThread = new Thread(() -> {
      String message;
      try{
        while ((message = in.readLine()) != null) {
          System.out.println(message);
        }
      } catch (IOException e) {
        System.out.println("Disconnected from server.");
      }
      });
      receiveThread.start();

      Thread sendThread = new Thread(() -> {
        String message;
        try {
          while ((message = userInput.readLine()) != null) {
            out.println(message);
            if (message.equalsIgnoreCase("exit")){
              break;
            }
          }
        } catch (IOException e) {
          e.printStackTrace();
        } finally {
          try {
            socket.close();
          } catch (IOException e) {
            // ignore
          }
        }
      });
      sendThread.start();
  }
}
