import java.net.*;
import java.io.*;

public class IPCClient{
	public static void main(String args[]){
		try{
			Socket s = new Socket("localhost", 1200);
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			DataInputStream dis = new DataInputStream(s.getInputStream());
			InputStreamReader isr = new InputStreamReader(System.in);
			System.out.println("\n****CLIENT PROCESS STARTED****\n");
			System.out.println("\n**PLEASE ENTER THE VALUES OF NUMBER1 AND NUMBER2 TO PASS THEM TO SERVER PROCESS**\n");
			BufferedReader br = new BufferedReader(isr);
			int a = Integer.parseInt(br.readLine());
			System.out.println("Number1 ====> " + a);
			dos.writeInt(a);
			int b = Integer.parseInt(br.readLine());
			System.out.println("Number2 ====> " + b);
			dos.writeInt(b);
			int result = dis.readInt();
			System.out.println("\n......CLIENT PROCESS HAS RECEIVED RESULT FROM SERVER......\n");
			System.out.println("\nTHE ADDITION OF " + a + " AND " + b + " IS " + result);
			s.close();
		}
		catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}
}
