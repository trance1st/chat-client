package ro.posa;

import java.io.*;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 9999);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        writer.write("Salut\n");
        writer.flush();

        writer.close();

    }
}
