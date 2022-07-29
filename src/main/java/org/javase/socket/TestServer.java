package org.javase.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

    public static  void server() throws IOException, ClassNotFoundException {
        ServerSocket ss =new ServerSocket(8888);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);
        User user = (User) ois.readObject();
        boolean flag=false;
        if(user.username.equals("呼啦啦")&& user.password.equals( "123")){
            flag=true;
        }

        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeBoolean(flag);

        dos.close();
        os.close();
        ois.close();
        is.close();
        s.close();
        ss.close();
    }

    public static void main(String[] args) {
        try {
            TestServer.server();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
