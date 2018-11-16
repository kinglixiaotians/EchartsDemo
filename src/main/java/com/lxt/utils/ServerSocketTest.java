package com.lxt.utils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by 李啸天 on 2018/11/15.
 */
public class ServerSocketTest {

    /*public static void main(String[] args) {
        try {
            //初始化服务端
            ServerSocket serverSocket = new ServerSocket(9999);
            //等待客户端链接
            Socket socket = serverSocket.accept();
            //获取输入流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //读取一行数据
            String str = bufferedReader.readLine();
            //输出打印
            System.out.println("服务端:"+str);
        }catch (IOException e){
            //抓取初始化服务端的io异常
            e.printStackTrace();
        }

    }*/
    /*public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            //等待客户端链接
            Socket socket = serverSocket.accept();
            //获取输入流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
            String str;
            //循环判断是否为空
            while((str=bufferedReader.readLine())!=null){
                System.out.println("客户端:"+str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }*/
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            //等待客户端链接
            Socket socket = serverSocket.accept();
            //获取输出流
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));

            //循环判断是否为空
            //while((str=bufferedReader.readLine())!=null){
            Scanner sc = new Scanner(System.in);
            while (true) {
                //获取输入流
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
                String str = bufferedReader.readLine();
                System.out.println("客户端:" + str);
                System.out.println("请反馈客户端");
                String strs = sc.nextLine();
                bufferedWriter.write(strs);
                bufferedWriter.write("\n");
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
