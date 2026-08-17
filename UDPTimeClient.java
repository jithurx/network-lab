import java.net.*;
public class UDPTimeClient {
  public static void main(String[] args) {
    try{
      DatagramSocket clientSocket = new DatagramSocket();
      
      InetAddress serverAddress = InetAddress.getByName("localhost");

      String request = "TIME";

      byte[] sendData = request.getBytes();

      DatagramPacket sendPacket = new DatagramPacket(
        sendData,
        sendData.length,
        serverAddress,
        5000);

      clientSocket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
        clientSocket.receive(receivePacket);

        String serverTime = new String(
          receivePacket.getData(),
          0,
          receivePacket.getLength());

        System.out.println("Current Server Time:" + serverTime);

        clientSocket.close();
      
    } catch (Exception e){
      e.printStackTrace();
    }
  }
}
