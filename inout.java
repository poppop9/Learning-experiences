package itheima11;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class inout {
    public static void main(String[] args) throws IOException {
        BufferedReader bfdr = new BufferedReader(new FileReader("E:\\文档\\学校\\zaza.txt"));
        PrintWriter prw = new PrintWriter(new FileWriter("E:\\文档\\学校\\zazaza.txt"));

        while (true) {
            String s1 = bfdr.readLine();
            if (s1 != null) {
                prw.println(s1);
            } else {
                break;
            }
        }

        bfdr.close();
        prw.close();
    }
}

/*
        PrintWriter prw = new PrintWriter("E:\\文档\\学校\\zaza.txt");

        prw.write(33);
        prw.write("厉害");

        prw.println("厉害");

        prw.close();
 */

/*
        PrintStream prs = new PrintStream("E:\\文档\\学校\\zaza.txt");

        prs.write(999);

        prs.println("");
        prs.println(3242);
        prs.println("green");

        prs.close();
 */

/*
        BufferedReader bfdr = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int i = Integer.parseInt(bfdr.readLine());
            System.out.println(i);
        }


 */
/*
        while (true) {
            String s1 = bfdr.readLine();
            System.out.println(s1);
        }
 */

/*
        while (true) {
            int i = ips.read();
            if (i != -1) {
                System.out.print((char) i);
            } else {
                break;
            }
        }
 */
