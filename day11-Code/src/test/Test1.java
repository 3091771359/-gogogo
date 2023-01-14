package test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //定义一个集合，只能存储字符串类型的数据，添加数据并遍历输出
        ArrayList<String> list = new ArrayList<>();

        list.add("你好！");
        list.add("吃饭了吗？");
        list.add("睡觉了吗？");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
