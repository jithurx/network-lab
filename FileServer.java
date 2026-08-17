import java.io.*;
import java.net.*;

public class FileServer{
  public static void main(String[] args) throws Exception {

    ServerSocket serverSocket = new ServerSocket(5000);
    System.out.println("File Server Started...");
    System.out.println("Wating for clients...");

    while(true) {
      Socket socket = serverSocket.accept();

      Thread t = new Thread(new ClientHandler(socket));
      t.start();
    }
  }
}

class ClientHandler implements Runnable {
  
  Socket socket;

  ClientHandler(Socket socket){
    this.socket = socket;
  }

  public void run() {
    try{
      BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

      PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

      String fileName = in.readLine();

      long pid = ProcessHandle.current().pid();

      File file = new File(fileName);

      out.println("Server PID:" + pid);

      if(file.exists()){
        out.println("FOUND");

        BufferedReader fileReader = new BufferedReader(new FileReader(file));

        String line;

        while((line=fileReader.readLine())!=null){
          out.println(line);
        }

        out.println("EOF");

        fileReader.close();
        
      }else{
        out.println("File not Found");
      }

      socket.close();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  
}
