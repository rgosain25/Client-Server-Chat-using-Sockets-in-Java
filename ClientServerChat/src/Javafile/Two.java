package Javafile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

//client
public class Two {
	public static void main(String[] args) throws Exception {
		Socket s=new Socket("localhost",9001);
		InputStream i;
		OutputStream os;
		DataInputStream dis;
		DataOutputStream dos;
		i=s.getInputStream();
		os=s.getOutputStream();
		dis=new DataInputStream(i);
		dos=new DataOutputStream(os);
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("THIS IS CLIENT");
		while(true)
		{
			System.out.print("Enter:");
			str=sc.nextLine();
			System.out.println("Client:"+str);
			dos.writeUTF(str);
			String str2=dis.readUTF();
			System.out.println("Server:"+str2);
		
		}
	}

}
