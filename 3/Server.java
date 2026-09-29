import java.io.*;
import java.net.*;

public class Server
{
  public static void main(String[] args){
  try
  {
   ServerSocket serverSocket = new ServerSocket(5000);
   System.out.println("Server is waiting for client.");
   Socket socket = serverSocket.accept();
   System.out.println("Client Connected.");
   DataInputStream dis = new DataInputStream(socket.getInputStream());
   DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
   int n = dis.readInt();
   int[][] matrix = new int[n][n];
   System.out.println("Received Matrix: ");
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     {
       matrix[i][j]=dis.readInt();
       System.out.println(matrix[i][j]+"\t");
     }
     System.out.println();
   }
   boolean upper = true;
   boolean lower = true;
   boolean diagonal = true;
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     {
       if(i>j && matrix[i][j]!=0)
         upper = false;
       if(i<j && matrix[i][j]!=0)
         lower = false;
       if(i!=j && matrix[i][j]!=0)
         diagonal = false;
     }
   }
   String result;
   if(diagonal)
     result = "Diagonal Matrix";
   else if(upper)
     result = "Upper Triangular Matrix";
   else if(lower)
     result = "Lower Triangular Matrix";
   else
     result = "Neither Upper, Lower nor Diagonal Matrix";
   dos.writeUTF(result);
   dis.close();
   dos.close();
   socket.close();
   serverSocket.close();
  }
  catch(Exception e)
  {
    e.printStackTrace();
  }
}
}
