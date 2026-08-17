import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPTimeServer {
  static class ClientHandler extends Thread {
    DatagramSocket socket;
    DatagramPacket packet;

    ClientHandler(DatagramSocket socket,DatagramPacket packet) {
      this.socket=socket;
      this.packet=packet;
    }

    public void run() {
      try {
        String currentTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());

        byte[] sendData = currentTime.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(
          sendData,
          sendData.length,
          packet.getAddress(),
          packet.getPort());
        socket.send(sendPacket);

        System.out.println("Served client:" + packet.getAddress() + ":" + packet.getPort());
        
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    try{
      DatagramSocket serverSocket = new DatagramSocket(5000);

      System.out.println("UDP Time Server is Running...");
      System.out.println("Waiting for client requests...\n");

      while(true){
        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);

        serverSocket.receive(receivePacket);

        new ClientHandler(serverSocket,receivePacket).start();
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
