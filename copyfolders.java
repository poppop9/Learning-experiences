package itheima11;

import java.io.*;

//把demo里的所有文件复制到demo2里面去

public class copyfolders {
    public static void main(String[] args) throws IOException {
        File f1 = new File("E:\\文档\\demo");
        File f2 = new File("E:\\文档\\demo2");

        copy(f1, f2);
    }

    public static void copy(File f1, File f2) throws IOException {
        if (f1.exists()) {
            if (f1.isDirectory()) {              //如果是目录
                String s1 = f1.getName();      //获取这个文件夹的名字
                File f3 = new File(f2, s1);
                f3.mkdir();               //在目的地创建这个文件夹

                File farr[] = f1.listFiles();
                for (File f : farr) {
                    copy(f, f3);           //递归
                }
            } else if (f1.isFile()) {          //如果是文件
                //E:\文档\demo\wenjina\xiaowenjianjia\\123.txt
                String s1 = f1.getName();
                File f4 = new File(f2, s1);     //终点文件名
                copyFile(f1, f4);
            }
        }
    }

    public static void copyFile(File start, File des) throws IOException {
        BufferedInputStream bfdips = new BufferedInputStream(new FileInputStream(start));
        BufferedOutputStream bfdops = new BufferedOutputStream(new FileOutputStream(des));

        while (true) {
            int i = bfdips.read();
            if (i != -1) {
                bfdops.write(i);
            } else {
                break;
            }
        }

//        byte b1[] = new byte[10241024];
//        int length = bfdips.read(b1);
//        bfdops.write(b1, 0, length);

        bfdips.close();
        bfdops.close();

    }
}
