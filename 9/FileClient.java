import java.io.*;
import java.net.*;
import java.util.Scanner;

public class FileClient{

  public static void main(String[] args) throws Exception{
    Socket socket = new Socket("localhost",5000);

    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    PrintWriter out = new PrintWriter(socket.getOutputStream(),true);

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter file name: ");
    String fileName = sc.nextLine();

    out.println(fileName);

    String pid = in.readLine();
    System.out.println(pid);

    String response = in.readLine();

    if(response.equals("FOUND")){
      System.out.println("\nFile Contents:\n");

      String line;

      while (!(line = in.readLine()).equals("EOF")){
        System.out.println(line);
      }
    }else {
      System.out.println(response);
    }

    socket.close();
    sc.close();
  }
}
