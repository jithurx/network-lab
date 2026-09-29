import java.net.*;
import java.util.*;

public class UDPServer {
  public static void main(String[] args) throws Exception{
    DatagramSocket serverSocket = new DatagramSocket(9876);
    byte[] receiveData = new byte[1024];
    byte[] sendData;

    Map<String, String> dictionary = new HashMap<>();
    dictionary.put("tbh","to be honest");
    dictionary.put("ig","I guess");
    dictionary.put("tbf","to be fair");
    dictionary.put("atm","at this moment");
    dictionary.put("irl","in real life");
    dictionary.put("lol","laughed out loud");
    dictionary.put("asap","as soon as possible");
    dictionary.put("omg","oh my god");
    dictionary.put("idk","I don't know");
    dictionary.put("nvm","never mind");
    dictionary.put("idc","I don't care");

    System.out.println("UDP Abbrevation Translation Server on port 9876...");

    while(true){
      DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
      serverSocket.receive(receivePacket);
      String sentence = new String(receivePacket.getData(),0,receivePacket.getLength());
      InetAddress clientAddress = receivePacket.getAddress();
      int clientPort = receivePacket.getPort();

      System.out.println("Received from client: " + sentence);

      String[] words = sentence.trim().split("\\s+");
      StringBuilder translated = new StringBuilder();

      for (String word : words){
        String lower = word.toLowerCase();
        if (dictionary.containsKey(lower)){
          translated.append(dictionary.get(lower));
        } else{
          translated.append(word);
        }
        translated.append(" ");
      }
      String result = translated.toString().trim();
      System.out.println("Translated sentence: "+ result);

      sendData = result.getBytes();
      DatagramPacket sendPacket = new DatagramPacket(sendData,sendData.length,clientAddress,clientPort);
      serverSocket.send(sendPacket);
    }
  }
}
