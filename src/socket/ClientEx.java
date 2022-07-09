package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		try {
			socket = new Socket("localhost",9999);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("º¸³»±â >> ");
				String outputMessage = sc.nextLine();
				if (outputMessage.equalsIgnoreCase("bye")) {
					bw.write(outputMessage + "\n");
					bw.flush();
					break;
				}
				bw.write(outputMessage + "\n");
				bw.flush();
				String inputMessage = br.readLine();
				System.out.println("Server : "+inputMessage);
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				if(socket != null) socket.close();
			} catch(IOException e) {
				System.out.println("Error occured because of chating with Server");
			}
		}
	}

}
