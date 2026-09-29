import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ChatServer {
  private static final int PORT = 5000;
  private static List<ClientHandler> clients = new CopyOnWriteArrayList<>();

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(PORT);
    System.out.println("Chat server started on port " + PORT);

    while(true){
      Socket clientSocket = serverSocket.accept();
      ClientHandler handler = new ClientHandler(clientSocket);
      clients.add(handler);
      new Thread(handler).start();
      System.out.println("New client connected: "+ clientSocket.getInetAddress());

    }
    
  }
  
  static void broadcast(String message,ClientHandler sender){
    for (ClientHandler client : clients){
      if(client != sender){
        client.sendMessage(message);
      }
    }
  }
  
  static void removeClient(ClientHandler client){
    clients.remove(client);
  }

  static class ClientHandler implements Runnable {
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String username;

    ClientHandler(Socket socket){
      this.socket = socket;
    }

    public void run(){
      try{
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(),true);

        out.println("Enter your name:");
        username= in.readLine();
        broadcast(username + "has joined the chat.",this);

        String message;
        while ((message = in.readLine()) != null){
          broadcast(username + ": " + message,this );
        }
        
      } catch (IOException e) {
        System.out.println("Client disconnected: "+ username);
      }finally {
        removeClient(this);
        broadcast(username + "has left the chat.",this);
        try{
          socket.close();
        } catch (IOException e){
          // ignore
        }
      }
    }
    void sendMessage(String message){
      out.println(message);
    }
  }
}
