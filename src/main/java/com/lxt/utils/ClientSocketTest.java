package com.lxt.utils;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by 李啸天 on 2018/11/15.
 */
public class ClientSocketTest {

    /*public static void main(String[] args) {
        try {
            //获取服务端的链接
            Socket socket = new Socket("127.0.0.1",9999);
            //写入输入流
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //创建输入文字
            String str = "你好";
            bufferedWriter.write(str);
            //刷新输入流
            bufferedWriter.flush();
            //关闭socket的输入流----此处与close不同，close后会完全关闭，无法接受服务端反馈的信息
            socket.shutdownOutput();
        }catch (IOException e){
            e.printStackTrace();
        }
    }*/

    /*public static void main(String[] args) {
        try {
            //获取服务端的链接
            Socket socket = new Socket("127.0.0.1", 9999);
            //写入输入流
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //写入输出流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in,"utf-8"));
            //读取服务器端数据
            DataInputStream input = new DataInputStream(socket.getInputStream());
            String ret = input.readUTF();
            System.out.println("服务器端返回过来的是: " + ret);
            //循环
            while(true){
                String str = bufferedReader.readLine();
                bufferedWriter.write(str);
                bufferedWriter.write("\n");
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

   /* public static void main(String[] args) {
        try {
            //获取服务端的链接
            Socket socket = new Socket("127.0.0.1", 9999);
            //写入输入流
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //写入输出流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in,"utf-8"));
            //循环
            while(true){
                String strinput = bufferedReader.readLine();
                bufferedWriter.write(strinput);
                bufferedWriter.write("\n");
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/

    public static void main(String[] args) {
        try {
            //获取服务端的链接
            Socket socket = new Socket("127.0.0.1", 9999);
            //循环
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("请输入发送消息内容：");
                String str = scanner.nextLine();
                //写入输入流
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                bufferedWriter.write(str);
                bufferedWriter.write("\n");
                bufferedWriter.newLine();
                bufferedWriter.flush();
                //写入输出流
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String ret = bufferedReader.readLine();
                System.out.println("服务器端返回过来的是: " + ret);
                /*String ret;
                while((ret=bufferedReader.readLine())!=null){
                    System.out.println("服务器端返回过来的是: " + ret);
                }*/
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
