package Javafile;
//server
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class One {
	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		ServerSocket ss=new ServerSocket(9001);
		InputStream i;
		
		OutputStream os;
		DataInputStream dis;
		DataOutputStream dos;
		Socket s=ss.accept();
		i=s.getInputStream();
		os=s.getOutputStream();
		dis=new DataInputStream(i);
		dos=new DataOutputStream(os);
		System.out.println("THIS IS SERVER");
		while(true)
		{
			String st=dis.readUTF();
			System.out.println("Client:"+st);
			System.out.print("Enter:");
			String str=sc.nextLine();
			System.out.println("Server:"+str);
			dos.writeUTF(str);
		}
		
		}

}
