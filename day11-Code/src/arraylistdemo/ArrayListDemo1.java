package arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //泛型：限制集合中存储的数据类型
        //JDK7
        ArrayList<String> list1 = new ArrayList<String>();
        //JDK7以后，可以省略后面的数据类型，但不能省略<>
        ArrayList<String> list2 = new ArrayList<>();
        //此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
        //这个类在底层做了一些处理
        //打印对象不是地址值，而是集合中存储数据内容
        //在展示的时候会拿[]把所有的数据进行包裹
    }
}
