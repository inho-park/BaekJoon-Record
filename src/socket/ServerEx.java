package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;

import java.util.Scanner;

public class ServerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("Waiting for Connecting with port number 9999");
			socket = listener.accept();
			System.out.println("Connecting");
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = br.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("System down because of client (bye)");
					break;
				}
				System.out.println("client : "+inputMessage);
				System.out.print("sending >> ");
				String outputMessage = sc.nextLine();
				bw.write(outputMessage + "\n");
				bw.flush();
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			} catch(IOException e) {
				System.out.println("Error occured for chating with Client");
			}
		}
	}

}
