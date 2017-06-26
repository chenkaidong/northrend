//import java.io.IOException;
//import java.net.ServerSocket;
//import java.net.Socket;
//
///**
// * Created by chenkaidong on 2017/6/9.
// */
//
//class ServerThread {
//
//    //服务器线程处理 和本线程相关的socket
//    Socket socket =null;
//
//    public ServerThread(Socket socket) {
//
//        this.socket = socket;
//
//    }
//
//
//    public void run() {
//
//
//    }
//
//}
//
//
//public class DimForestMT {
//
//    public static void main(String[] args) throws IOException {
//
//        ServerSocket serverSocket =new ServerSocket(10086);
//        Socket socket =null;
//        int count =0;//记录客户端的数量
//        while(true){
//            socket = serverSocket.accept();
//            ServerThread serverThread =new ServerThread(socket);
//            serverThread.start();
//            count++;
//            System.out.println("客户端连接的数量："+count);
//        }
//    }
//
//}
