import java.net.*;
import java.util.*;

public class UDPClient {
  public static void main(String[] args) throws Exception {
    DatagramSocket clientSocket = new DatagramSocket();
    InetAddress serverAddress = InetAddress.getByName("localhost");
    int serverPort = 9876;

    Scanner scanner = new Scanner(System.in);
    byte[] sendData;
    byte[] receiveData = new byte[1024];

    System.out.print("Enter a sentence with abbrevations: ");
    String sentence = scanner.nextLine();

    sendData = sentence.getBytes();
    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
    clientSocket.send(sendPacket);

    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
    clientSocket.receive(receivePacket);

    String translated = new String(receivePacket.getData(), 0, receivePacket.getLength());
    System.out.println("Translated sentence: "+ translated);

    clientSocket.close();
  }
}
