package com.lzu.ctcvbackend.Utils;
import java.io.*;
import java.net.Socket;
public class SocketUtil {
    public static String sendMessage(String message) {
        String response = "";
        System.out.println("开始测试socket！");
        try (Socket socket = new Socket("127.0.0.1", 50007);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            out.println(message);
            response = in.readLine(); // 接收结果
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("response:"+response);
        return response;
    }
}
