import java.io.*;
import java.net.*;
class Server{
public static void main(String[] args) throws Exception{
ServerSocket ServSock = new ServerSocket(5005);
System.out.println("Server Ready");
Socket Sock = ServSock.accept();
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
OutputStream OStream = Sock.getOutputStream();
PrintWriter PWrite = new PrintWriter(OStream, true);
InputStream IStream = Sock.getInputStream();
BufferedReader ReceiveRead = new BufferedReader(new InputStreamReader(IStream));
String ReceiveMessage, SendMessage, Fun;
int a, b, c;
while(true){
Fun = ReceiveRead.readLine();
if(Fun != null){
System.out.println("Operation: " + Fun);
}
a = Integer.parseInt(ReceiveRead.readLine());
System.out.println("Parameter1: " + a);
b = Integer.parseInt(ReceiveRead.readLine());
if(Fun.compareTo("add") == 0){
c = a + b;
System.out.println("Addition = " + c);
PWrite.println("Addition = " + c);
}
if(Fun.compareTo("sub") == 0){
c = a - b;
System.out.println("Substraction = " + c);
PWrite.println("Substraction = " + c);
}
if(Fun.compareTo("mul") == 0){
c = a * b;
System.out.println("Multiplication = " + c);
PWrite.println("Multiplication = " + c);
}
if(Fun.compareTo("div") == 0){
c = a/b;
System.out.println("Division = " + c);
PWrite.println("Division = " + c);
}
System.out.flush();
}
}
}
