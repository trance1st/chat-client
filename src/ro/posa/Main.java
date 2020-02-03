package ro.posa;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 9999);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        Scanner scanner = new Scanner(System.in);
        String nr1 = scanner.nextLine();
        String nr2 = scanner.nextLine();
        writer.write("cat face " + nr1 + " plus " + nr2 + "\n");
        writer.flush();
        System.out.println(reader.readLine());
        writer.close();

    }
}
