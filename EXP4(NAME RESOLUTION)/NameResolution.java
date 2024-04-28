import java.io.*;
import java.net.*;
public class NameResolution{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Website url(like google.com) to Resolve its Name to Address");
		String name = br.readLine();
		try{
			InetAddress ip = InetAddress.getByName(name);
			ip = InetAddress.getByName(name);
			System.out.println("\nIP Address: " + ip.getHostAddress());
		}
		catch(UnknownHostException e){
			System.out.println("\n\nNo such Host is present......");
			System.out.println("\nTry Again");
		}
	}
}
