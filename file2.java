package itheima11;

import com.sun.source.tree.Tree;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class file {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\文档\\demo");
        File f2 = new File("E:\\文档\\demo2");

        File farr[] = f1.listFiles();    //获取到了文件的绝对路径
        BufferedReader bfdr = null;
        BufferedWriter bfdw = null;
        for (File f : farr) {
            bfdr = new BufferedReader(new FileReader(f));
            char c1[] = new char[10241024];
            bfdr.read(c1);         //数据已经存储在了数组中

            String s1 = f1.getName();  //demo
            String s2 = f.getName();        //文件名
            String s3 = f2.getName();       //demo2

            File f3 = new File(f2, s2);      //目的地的绝对路径
            bfdw = new BufferedWriter(new FileWriter(f3));
            bfdw.write(c1);
        }
        bfdr.close();
        bfdw.close();
    }
}
