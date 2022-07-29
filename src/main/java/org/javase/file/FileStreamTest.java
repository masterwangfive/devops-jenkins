package org.javase.file;

import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * 文件操作
 */
public class FileStreamTest {

    /**
     * 利用缓冲区读取字节流和字符流
     */
    @Test
    public void test01() throws IOException {
        File file1=new File("/Users/master/Pictures/pic/IMG_1301.jpg");
        File file2=new File("/Users/master/Pictures/pic/1301.jpg");

        FileInputStream fis =new FileInputStream(file1);
        FileOutputStream fos =new FileOutputStream(file2);
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        //核心
        //字节缓冲数组
        byte [] b =new byte[1024*6];
        int len=  bis.read(b);
        while( len!=-1 ){
            bos.write(b,0,len);
            len=bis.read(b);
         }

      bos.close();
      bis.close();

    }

}
