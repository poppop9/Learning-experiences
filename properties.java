package itheima11;

import java.io.*;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class properties {
    public static void main(String[] args) throws IOException {
        Properties prptstart = new Properties();

        prptstart.setProperty("12", "陈冠希");
        prptstart.setProperty("34", "吴彦祖");
        prptstart.setProperty("66", "金城武");

        arrayout(prptstart);

        Properties prptfinal = new Properties();
        arrayin(prptfinal);

        System.out.println(prptfinal);

    }

    public static void arrayout(Properties prptstart) throws IOException {
        BufferedWriter bfdw = new BufferedWriter(new FileWriter("E:\\文档\\学校\\zaza.txt"));
        prptstart.store(bfdw, null);
        bfdw.close();
    }

    public static void arrayin(Properties prptfinal) throws IOException {
        BufferedReader bfdr = new BufferedReader(new FileReader("E:\\文档\\学校\\zaza.txt"));
        prptfinal.load(bfdr);
        bfdr.close();
    }
}

/*
        Properties prpt = new Properties();                    //创建集合

        prpt.setProperty("12", "陈冠希");
        prpt.setProperty("34", "吴彦祖");
        prpt.setProperty("66", "金城武");

        String value1 = prpt.getProperty("34");
        String value2 = prpt.getProperty("555");
        System.out.println(value1);
        System.out.println(value2);

        Set<String> set = prpt.stringPropertyNames();

        for (String key : set) {
            String value = prpt.getProperty(key);
            System.out.println(key + "--" + value);
        }
 */
/*
        prpt.put(12, "陈冠希");                             //添加元素
        prpt.put(45, "吴彦祖");
        prpt.put(22, "金城武");

        Collection c1 = prpt.values();                        //获取所有value的集合

        for (Object o : c1) {
            System.out.println(o);                             //遍历
        }
 */
