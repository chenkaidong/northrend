package com.twodfire.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by chenkaidong on 2017/6/20.
 */
public class MyServer {

    public static void main(String[] args) throws IOException {

        int port = 8919;

        ServerSocket server = new ServerSocket(port);

        Socket socket = server.accept();

        Reader reader = new InputStreamReader(socket.getInputStream());

        char chars[] = new char[1024];

        int len;

        StringBuilder builder = new StringBuilder();

        while((len = reader.read(chars)) != -1) {

            builder.append(new String(chars, 0, len) );

        }

        System.out.println( "Receive from client"+builder);

        reader.close();

        socket.close();

        server.close();

    }



}
