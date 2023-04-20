package itheima11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) throws IOException {
        Properties prpt = new Properties();

        BufferedWriter bfdw = new BufferedWriter(new FileWriter("E:\\文档\\学校\\zaza.txt"));
        start(prpt, bfdw);

        while (true) {
            String snum = prpt.getProperty("count");
            int num = Integer.parseInt(snum);
            if (num < 3) {
                game g = new game();
                boolean b1 = g.guess();
                if (b1 == true) {
                    break;
                }

                num++;
                String tmp = Integer.toString(num);
                prpt.setProperty("count", tmp);          //重新设置value

                BufferedWriter bfdw2 = new BufferedWriter(new FileWriter("E:\\文档\\学校\\zaza.txt"));
                prpt.store(bfdw2, null);              //重新写入文件
                bfdw2.close();

            } else {
                break;
            }
        }

        bfdw.close();
    }

    public static void start(Properties prpt, BufferedWriter bfdw) throws IOException {             //初始化文件
        prpt.setProperty("count", "0");

        prpt.store(bfdw, null);                             //写入数据
    }
}

class game {
    static Random rd = new Random();
    static int number = rd.nextInt(100) + 1;            //范围时1-100

    public static Boolean guess() {
        System.out.println("请输入你要猜的数字:");
        Scanner sc = new Scanner(System.in);
        int guess1 = sc.nextInt();

        if (guess1 == number) {
            System.out.println("回答正确");
            return true;
        } else {
            System.out.println("回答错误");
        }

        return false;
    }
}
