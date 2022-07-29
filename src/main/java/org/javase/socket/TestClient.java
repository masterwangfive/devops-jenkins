package org.javase.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TestClient {


    public TestClient() throws IOException {

    }
    public static  void client() throws IOException {
        Socket so =new Socket("192.168.0.100",8888);
        OutputStream os = so.getOutputStream();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name=scanner.next();
        System.out.println("请输入密码：");
        String pws=scanner.next();
        User user=new User(name,pws);

        ObjectOutputStream oos =new ObjectOutputStream(os);
        oos.writeObject(user);

        InputStream is = so.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        boolean b = dis.readBoolean();
        if(b){
            System.out.println("恭喜您！登陆成功了！");
        }else{
            System.out.println("登陆失败了！");
        }

        dis.close();
        is.close();
        oos.close();
        os.close();
        so.close();

    }

    public static void main(String[] args) throws IOException {
        TestClient.client();
    }

}
