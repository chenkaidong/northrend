package com.twodfire.io;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

/**
 * Created by chenkaidong on 2017/6/20.
 */
public class MyClient {


    public static void main(String[] args) throws IOException {

        String host = "127.0.0.1";

        int port = 8919;

        Socket client = new Socket(host, port);

        Writer writer = new OutputStreamWriter(client.getOutputStream());

        writer.write("Hello from Client");

        writer.flush();

        writer.close();

        client.close();

    }



}
