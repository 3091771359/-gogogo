package test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        //1、创建集合
        ArrayList<User> list = new ArrayList<>();
        //2、创建对象
        User u1 = new User("001", "zhangsan", "123456");
        User u2 = new User("002", "lisi", "12345678");
        User u3 = new User("003", "wangwu", "123456qw");
        //3、存入用户对象
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //4、调用方法
        boolean flag = contains(list, "002");
        int index = getIndex(list, "002");
        //5、打印结果
        System.out.println(flag);
        System.out.println(index);
    }

    //定义方法，在集合在中查找id对应的用户信息
    //存在返回ture，在返回索引
    //不存在返回false，在返回-1
    public static boolean contains(ArrayList<User> list, String id) {
        /*for (int i = 0; i < list.size(); i++) {
            //取出每一个对象，再用对象调用对应的方法
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }*/
        //可以直接调用返回索引的方法，简化代码
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            //取出每一个对象，再用对象调用对应的方法
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
