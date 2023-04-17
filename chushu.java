package LeetCode;

import java.util.Scanner;

public class chushu {
    public static void main(String[] args) {
        System.out.print("n=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        person p1 = new person("爱丽丝");
        person p2 = new person("鲍勃");

        while (true) {
            int index = p1.search(n);
            if (index == 0) {
                System.out.println("false");
                break;
            }
            n = p2.search(index);
            if (n == 0) {
                System.out.println("true");
                break;
            }
        }

        while (true) {
            if (person.size != 0) {
                System.out.print("爱丽丝选择" + person.arr[0]);

                int end = 0;

                for (int i = 1; i < person.size; i++) {
                    if (i % 2 != 0) {
                        end = 1;
                        if (person.arr[i] == person.arr[i - 1]) {      //后元素等于前元素
                            System.out.print(",鲍勃也选择" + person.arr[i]);
                        } else {
                            System.out.print(",鲍勃选择" + person.arr[i]);
                        }
                    } else {
                        end = 2;
                        if (person.arr[i] == person.arr[i - 1]) {      //后元素等于前元素
                            System.out.print(",爱丽丝也选择" + person.arr[i]);
                        } else {
                            System.out.print(",爱丽丝选择" + person.arr[i]);
                        }
                    }
                }
                if (end == 1) {
                    System.out.println(",然后爱丽丝无法进行操作。");
                    break;
                } else if (end == 2) {
                    System.out.println(",然后鲍勃无法进行操作。");
                    break;
                } else if (end == 0) {
                    System.out.println(",然后鲍勃无法进行操作。");
                    break;
                }
            } else {
                System.out.println("爱丽丝无法进行操作");
            }
        }
    }
}

class person {
    static String name;
    static int arr[] = new int[100];
    static int size = 0;

    public person(String name) {
        this.name = name;
    }

    public static int search(int n) {
        for (int x = n - 1; x > 0; x--) {
            if (n % x == 0) {
                arr[size] = x;     //存入过程
                size++;

                n = n - x;
                return n;
            }
        }
        return 0;
    }
}
