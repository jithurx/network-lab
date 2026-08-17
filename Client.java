import java.io.*;
import java.net.*;
import java.util.*;

public class Client
{
  public static void main(String[] args){
  try
  {
   Socket socket = new Socket("localhost",5000);
   DataInputStream dis = new DataInputStream(socket.getInputStream());
   DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the order of Matrix:");
   int n = sc.nextInt();
   int[][] matrix = new int[n][n];
   Random rand = new Random();
   System.out.println("\nGenerated Matrix:");
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     {
       matrix[i][j]=rand.nextInt(50)+1;
       System.out.println(matrix[i][j]+"\t");
     }
     System.out.println();
   }
   dos.writeInt(n);
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n;j++)
     {
       dos.writeInt(matrix[i][j]);
     }
   }
   String result = dis.readUTF();
   System.out.println(result);
   sc.close();
   dis.close();
   dos.close();
   socket.close();
  }
  catch(Exception e)
  {
    e.printStackTrace();
  }
}
}
