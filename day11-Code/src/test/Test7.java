package test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        /*
        需求：
        定义Javabean类：Phone
        Phone属性：品牌，价格。
        main方法中定义一个集合，存入三个手机对象。
        分别为：小米，1000。苹果，8000。锤子 2999。
        定义一个方法，将价格低于3000的手机信息返回。*/

        //1、定义集合
        ArrayList<Phone> list = new ArrayList<>();

        //2、定义对象
        Phone p1 = new Phone("小米", 1999);
        Phone p2 = new Phone("苹果", 7999);
        Phone p3 = new Phone("VIVO", 4999);

        //3、存入手机对象
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //4、调用方法
        ArrayList<Phone> result = getPhoneInfo(list);

        //5、遍历集合
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getBrand() + ", " + result.get(i).getPrice());
        }
    }

    //定义方法，返回手机信息
    //如果需要对多个对象进行返回，可以把这些都对象存在集合或者数组中，返回这个数组
    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        //定义集合
        ArrayList<Phone> PhoneInfo = new ArrayList<>();

        //对每一个手机对象中的价格做判断
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 5000) {
                //表明这个对象是满足条件的，需要存在集合当中
                PhoneInfo.add(list.get(i));
            }
        }
        //判断完毕后，返回这个集合
        return PhoneInfo;
    }
}
