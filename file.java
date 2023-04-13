package itheima11;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class file {
    public static void main(String[] args) throws IOException {
        BufferedReader bfdr = new BufferedReader(new FileReader("E:\\爱传送\\file.txt"));

        TreeSet<String> ts = new TreeSet<String>();   //存储学生

        while (true) {
            String s = bfdr.readLine();
            if (s != null) {
                ts.add(s);
            } else {
                break;
            }
        }      //学生已无重复的存储进了treeset

        ArrayList<String> al = new ArrayList<>();
        for (String s : ts) {
            al.add(s);
        }        //添加进arraylist里面

        Random r = new Random();

        while (true) {
            int index = r.nextInt(al.size());    //产生随机数

            System.out.println("1.继续   2.结束");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == 1) {
                String ss = al.get(index);
                System.out.println(ss);
            } else if (i == 2) {
                break;
            } else {
                System.out.println("输入错误,请重新输入");
            }
        }


        bfdr.close();
    }
}

/*
        BufferedReader bfdr = new BufferedReader(new FileReader("E:\\爱传送\\file.txt"));
        BufferedWriter bfdw = new BufferedWriter(new FileWriter("E:\\爱传送\\file22.txt"));

        ArrayList<String> al = new ArrayList<String>();
        while (true) {
            String s = bfdr.readLine();
            if (s != null) {
                al.add(s);
            } else {
                break;
            }
        }
//        for (String s : al) {
//            System.out.println(s);
//        }


        int index;
        for (index = 0; index < al.size(); index++) {
            bfdw.write(al.get(index));
            bfdw.newLine();
        }


        bfdr.close();
        bfdw.close();
 */
/*
        BufferedWriter bfdw = new BufferedWriter(new FileWriter("E:\\爱传送\\file.txt"));
        bfdw.write("hello");
        bfdw.newLine();
        bfdw.write("world");

        bfdw.close();
 */

/*
成功的
        FileReader fr = new FileReader("E:\\JavaSE_code\\idea_test\\src\\itheima11\\file.java");
        BufferedReader bfdr = new BufferedReader(fr);

        FileWriter fw = new FileWriter("E:\\爱传送//file.java");
        BufferedWriter bfdw = new BufferedWriter(fw);

        char c1[] = new char[10241024];
        int length = bfdr.read(c1);

        bfdw.write(c1, 0, length);

        bfdr.close();
        bfdw.close();
 */
/*
失败的
        FileReader fr = new FileReader("E:\\JavaSE_code\\idea_test\\src\\itheima11\\file.java");
        FileWriter fw = new FileWriter("E:\\爱传送\\file.java");

        while (true) {
            int i = fr.read();
            if (i != -1) {
                fw.write(i);
            } else {
                break;
            }
        }

        fr.close();
        fw.close();
 */

/*
成功的
    FileInputStream fips = new FileInputStream("E:\\爱传送\\请假条模板.pdf");
    BufferedInputStream bfdips = new BufferedInputStream(fips);

    FileOutputStream fops = new FileOutputStream("E:\\爱传送\\请假条模板2.pdf");
    BufferedOutputStream bfdops = new BufferedOutputStream(fops);

    byte b1[] = new byte[10241024];
    int length = bfdips.read(b1);

        bfdops.write(b1, 0, length);

                bfdips.close();
                bfdops.close();
*/

/*

 */

